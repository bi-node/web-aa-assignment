import React, { useState } from 'react';
import Post from './Post';
import './posts.css';

const Posts = ({ posts, onUpdateTitle }) => {
    const [newTitle, setNewTitle] = useState('');

    const handleUpdateTitle = () => {
        onUpdateTitle(newTitle);
        setNewTitle('');
    };

    const postList = posts.map((post) => (
        <Post
            title={post.title}
            author={post.author}
            id={post.id}
            key={post.id}
        />
    ));

    return (
        <div>
            {postList}
            <input
                type="text"
                value={newTitle}
                onChange={(e) => setNewTitle(e.target.value)}
                placeholder="Enter new title for the first post"
            />
            <button onClick={handleUpdateTitle}>Update Title</button>
        </div>
    );
};

export default Posts;
