// src/components/Comment.js
import React from 'react';

const Comment = ({ comment }) => {
    return (
        <div className="comment">
            <p><strong>{comment.author}</strong>: {comment.content}</p>
        </div>
    );
};

export default Comment;
