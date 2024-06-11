import React from 'react';
import './posts.css'

const Post = ({ title, author }) => {
    return (
        <div className="post-c">
            <h4>Title: {title}</h4>
            <p>Author: {author}</p>
        </div>
    );
};

export default Post;
