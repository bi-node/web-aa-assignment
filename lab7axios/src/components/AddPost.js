// src/components/AddPost.js
import React, { useState } from "react";
import PostService from "./PostService";
import "./styles.css";

const AddPost = ({ onPostAdded }) => {
    const [title, setTitle] = useState("");
    const [author, setAuthor] = useState("");
    const [description, setDescription] = useState("");

    const handleSubmit = async (e) => {
        e.preventDefault();
        const newPost = { title, author, description };
        const addedPost = await PostService.addPost(newPost);
        onPostAdded(addedPost);
        setTitle("");
        setAuthor("");
        setDescription("");
    };

    return (
        <form className="addPostForm" onSubmit={handleSubmit}>
            <input
                type="text"
                placeholder="Title"
                value={title}
                onChange={(e) => setTitle(e.target.value)}
                required
            />
            <input
                type="text"
                placeholder="Author"
                value={author}
                onChange={(e) => setAuthor(e.target.value)}
                required
            />
            <textarea
                placeholder="Description"
                value={description}
                onChange={(e) => setDescription(e.target.value)}
                required
            ></textarea>
            <button type="submit">Add Post</button>
        </form>
    );
};

export default AddPost;
