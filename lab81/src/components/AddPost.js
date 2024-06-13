import React, { useRef, useContext } from 'react';
import { PostContext } from './PostContext';
import './styles.css';

const AddPost = () => {
    const titleRef = useRef('');
    const authorRef = useRef('');
    const contentRef = useRef('');
    const { addPost } = useContext(PostContext);

    const handleSubmit = (e) => {
        e.preventDefault();
        const newPost = {
            title: titleRef.current.value,
            author: authorRef.current.value,
            comments: [{ name: contentRef.current.value }]
        };
        addPost(newPost);
        titleRef.current.value = '';
        authorRef.current.value = '';
        contentRef.current.value = '';
    };

    return (
        <div className="add-post">
            <form onSubmit={handleSubmit}>
                <input type="text" ref={titleRef} placeholder="Enter title" required />
                <input type="text" ref={authorRef} placeholder="Enter author" required />
                <textarea ref={contentRef} placeholder="Enter comment" required />
                <button type="submit">Add Post</button>
            </form>
        </div>
    );
};

export default AddPost;
