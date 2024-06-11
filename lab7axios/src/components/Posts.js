// src/components/Posts.js
import React, { useState } from "react";
import Post from "./Post";
import "./styles.css";

const Posts = ({ posts }) => {
    const [postSelected, setSelectedPost] = useState(null);

    const readPost = (post) => {
        setSelectedPost(post);
    };

    return (
        <>
            <div className="postsContainer">
                {posts.map((post) => (
                    <div key={"post_" + post.id}>
                        <Post post={post} readPost={readPost} />
                    </div>
                ))}
            </div>
            {postSelected && (
                <div className="postDetailContainer">
                    <span
                        onClick={() => setSelectedPost(null)}
                        className="closeButton"
                        title="Close"
                    >
                        <svg x="0px" y="0px" fill="white" width="20" height="20" viewBox="0 0 50 50">
                            <path d="M 7.71875 6.28125 L 6.28125 7.71875 L 23.5625 25 L 6.28125 42.28125 L 7.71875 43.71875 L 25 26.4375 L 42.28125 43.71875 L 43.71875 42.28125 L 26.4375 25 L 43.71875 7.71875 L 42.28125 6.28125 L 25 23.5625 Z"></path>
                        </svg>
                    </span>
                    <h3>{postSelected.title}</h3>
                    <div>{postSelected.author}</div>
                </div>
            )}
        </>
    );
};

export default Posts;
