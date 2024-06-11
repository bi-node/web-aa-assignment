// src/components/Posts.js
import React, { useState } from "react";
import Post from "./Post";
import PostDetail from "./PostDetail";
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
                <PostDetail post={postSelected} closeDetail={() => setSelectedPost(null)} />
            )}
        </>
    );
};

export default Posts;
