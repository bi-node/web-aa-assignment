// src/components/PostDetails.js
import React, { useContext, useEffect, useState, useMemo } from 'react';
import { SelectedPostContext } from './SelectedPostContext ';
import PostService from './PostService';
import Comment from './Comment';
import AddComment from './AddComment';
import './styles.css';

const PostDetails = () => {
    const { selectedPostId } = useContext(SelectedPostContext);
    const [post, setPost] = useState(null);
    const [comments, setComments] = useState([]);

    useEffect(() => {
        const fetchPostDetails = async () => {
            if (selectedPostId !== null) {
                const postDetails = await PostService.fetchPostById(selectedPostId);
                setPost(postDetails);
                const postComments = await PostService.fetchCommentsByPostId(selectedPostId);
                setComments(postComments);
            }
        };
        fetchPostDetails();
    }, [selectedPostId]);

    const renderedComments = useMemo(() => {
        if (!comments) return null; // Check if comments is null or undefined
        return comments.map((comment, index) => (
            <Comment key={index} comment={comment} />
        ));
    }, [comments]);

    if (!post) return null;

    return (
        <div className="post-details">
            <h3>{post.title}</h3>
            <div>Author: {post.author}</div>
            <div className="comments-section">
                {renderedComments}
            </div>
            <AddComment />
        </div>
    );
};

export default PostDetails;
