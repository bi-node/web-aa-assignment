// src/components/Post.js
import React from 'react';
import './styles.css';

const Post = ({ post, readPost }) => {
    return (
        <div className="post-c" onClick={() => readPost(post)}>
            <h4>Title: {post.title}</h4>
            <p>Author: {post.author}</p>
            <p>Description: {post.description}</p>
        </div>
    );
};

export default Post;
