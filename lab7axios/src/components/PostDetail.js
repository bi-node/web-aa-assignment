// src/components/PostDetail.js
import React from 'react';
import './styles.css';

const PostDetail = ({ post, closeDetail }) => {
    return (
        <div className="postDetailContainer">
            <span onClick={closeDetail} className="closeButton" title="Close">
                <svg x="0px" y="0px" fill="white" width="20" height="20" viewBox="0 0 50 50">
                    <path d="M 7.71875 6.28125 L 6.28125 7.71875 L 23.5625 25 L 6.28125 42.28125 L 7.71875 43.71875 L 25 26.4375 L 42.28125 43.71875 L 43.71875 42.28125 L 26.4375 25 L 43.71875 7.71875 L 42.28125 6.28125 L 25 23.5625 Z"></path>
                </svg>
            </span>
            <h3>{post.title}</h3>
            <div>{post.author}</div>
            <div>{post.description}</div>
            <button>Edit</button>
            <button>Delete</button>
        </div>
    );
};

export default PostDetail;
