import React, { useContext, useRef } from 'react';
import PostService from '../services/PostService';
import { PostContext } from '../context/PostContext';

const AddPost = () => {
    const { posts, setPosts } = useContext(PostContext);
    const titleRef = useRef();
    const authorRef = useRef();
    const commentRef = useRef();

    const handleAddPost = async (e) => {
        e.preventDefault();
        const newPost = {
            title: titleRef.current.value,
            author: authorRef.current.value,
            comment: [{ name: commentRef.current.value }]
        };
        const addedPost = await PostService.addPost(newPost);
        if (addedPost) {
            setPosts([...posts, addedPost]);
        }
        titleRef.current.value = '';
        authorRef.current.value = '';
        commentRef.current.value = '';
    };

    return (
        <form onSubmit={handleAddPost}>
            <input ref={titleRef} type="text" placeholder="Title" required />
            <input ref={authorRef} type="text" placeholder="Author" required />
            <input ref={commentRef} type="text" placeholder="Comment" required />
            <button type="submit">Add Post</button>
        </form>
    );
};

export default AddPost;
