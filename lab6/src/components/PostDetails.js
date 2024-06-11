import React from 'react';

const PostDetails = ({ post, onUpdateTitle, newTitle, handleChange }) => {
    if (!post) return null;

    return (
        <div className="post-details">
            <h2>{post.title}</h2>
            <p><strong>Author:</strong> {post.author}</p>
            <p><strong>ID:</strong> {post.id}</p>
            <input
                type="text"
                value={newTitle}
                onChange={handleChange}
                placeholder="Enter new title"
            />
            <button onClick={onUpdateTitle}>Update Title</button>
            <div className="post-actions">
                <button>Edit</button>
                <button>Delete</button>
            </div>
        </div>
    );
};

export default PostDetails;
