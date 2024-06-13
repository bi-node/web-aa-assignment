// src/components/Comment.js
import React from 'react';
import './styles.css';

const Comment = ({ comment }) => {
    return (
        <div className="comment">
            <p>{comment}</p>
        </div>
    );
};

export default Comment;
