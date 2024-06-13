import React, { useContext } from 'react';
import Post from './Post';
import { PostContext } from './PostContext';
import './styles.css';

const Posts = () => {
    const { posts } = useContext(PostContext);

    return (
        <div className="posts">
            {posts.map((post, index) => (
                <Post key={index} post={post} isSelected={false} />
            ))}
        </div>
    );
};

export default Posts;
