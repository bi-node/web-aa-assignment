import React, { useState } from 'react';
import Posts from './Posts';

function Dashboard() {
    const [posts, setPosts] = useState([
        { id: 1, title: 'Good Post', author: 'Blondie' },
        { id: 2, title: 'Bad Post', author: 'Angel Eye' },
        { id: 3, title: 'The Ugly Post', author: 'Tuco' },
    ]);

    const handleUpdateTitle = (newTitle) => {
        const updatedPosts = posts.map((post, index) => {
            if (index === 0) {
                return { ...post, title: newTitle };
            }
            return post;
        });
        setPosts(updatedPosts);
    };

    return (
        <div>
            <Posts posts={posts} onUpdateTitle={handleUpdateTitle} />
        </div>
    );
}

export default Dashboard;
