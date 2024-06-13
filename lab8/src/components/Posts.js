// src/components/Posts.js
import React, { useContext } from "react";
import { SelectedPostContext } from "./SelectedPostContext ";
import Post from "./Post";
import "./styles.css";

const Posts = ({ posts }) => {
    const { selectedPostId, setSelectedPostId } = useContext(SelectedPostContext);

    const readPost = (postId) => {
        setSelectedPostId(postId);
    };

    return (
        <div className="postsContainer">
            {posts.map((post) => (
                <div key={"post_" + post.id}>
                    <Post
                        post={post}
                        readPost={() => readPost(post.id)}
                        isSelected={post.id === selectedPostId}
                    />
                </div>
            ))}
        </div>
    );
};

export default Posts;
