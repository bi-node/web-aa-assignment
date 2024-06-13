// src/components/AddPost.js
import React, { useRef } from "react";
import PostService from "./PostService";
import "./styles.css";

const AddPost = ({ onPostAdded }) => {
    const titleRef = useRef(null);
    const authorRef = useRef(null);
    const descriptionRef = useRef(null);

    const handleSubmit = async (e) => {
        e.preventDefault();
        const newPost = {
            title: titleRef.current.value,
            author: authorRef.current.value,
            description: descriptionRef.current.value,
        };
        const addedPost = await PostService.addPost(newPost);
        onPostAdded(addedPost);
        titleRef.current.value = "";
        authorRef.current.value = "";
        descriptionRef.current.value = "";
    };

    return (
        <form className="addPostForm" onSubmit={handleSubmit}>
            <input type="text" placeholder="Title" ref={titleRef} required />
            <input type="text" placeholder="Author" ref={authorRef} required />
            <textarea placeholder="Description" ref={descriptionRef} required></textarea>
            <button type="submit">Add Post</button>
        </form>
    );
};

export default AddPost;
