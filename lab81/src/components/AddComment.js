// src/components/AddComment.js
import React, { useRef, useContext } from 'react';
import PostService from './PostService';
import { SelectedPostContext } from './SelectedPostContext ';
import './styles.css';

const AddComment = () => {
    const commentRef = useRef(null);
    const { selectedPostId } = useContext(SelectedPostContext);

    const handleAddComment = async (e) => {
        e.preventDefault();
        const newComment = {
            name: commentRef.current.value
        };
        await PostService.addComment(selectedPostId, newComment);
        // Optionally, you can clear the input field after adding the comment
        commentRef.current.value = '';
    };

    return (
        <div className="add-comment">
            <h3>Add Comment</h3>
            <form onSubmit={handleAddComment}>
                <input type="text" placeholder="Comment" ref={commentRef} required />
                <button type="submit">Add Comment</button>
            </form>
        </div>
    );
};

export default AddComment;
