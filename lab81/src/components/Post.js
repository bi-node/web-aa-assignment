import React from 'react';
import './styles.css';

const Post = ({ post, readPost, isSelected }) => {
    return (
        <div className={`post ${isSelected ? 'selected' : ''}`} onClick={readPost}>
            <div className="post-header">
                <div className="post-header-user">
                    <img src="https://via.placeholder.com/32" alt="User Avatar" />
                    <span>{post.author}</span>
                </div>
                <div className="post-actions">
                    <button>Edit</button>
                    <button>Delete</button>
                </div>
            </div>
            <div className="post-content">
                <h4>Title: {post.title}</h4>
                {/* Displaying comments */}
                <div className="post-comments">
                    {post.comments.map((comment, index) => (
                        <div key={index} className="comment">
                            <p>{comment.name}</p>
                        </div>
                    ))}
                </div>
            </div>
        </div>
    );
};

export default Post;
