import React from 'react';
import './styles.css';

const Post = ({ post }) => {
    return (
        <div className="post-c">
            <h4>Title: {post.title}</h4>
            <p>Author: {post.author}</p>
            {post.comment && post.comment.map((c, index) => (
                <div key={index} className="comment">
                    {c.name}
                </div>
            ))}
        </div>
    );
};

export default Post;
