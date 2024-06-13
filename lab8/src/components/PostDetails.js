// src/components/PostDetails.js
import React, { useContext, useEffect, useState, useMemo } from 'react';
import { SelectedPostContext } from './SelectedPostContext ';
import PostService from './PostService';
import Comment from './Comment';
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
            }
        };

        fetchPostDetails();
    }, [selectedPostId]);

    useEffect(() => {
        const fetchComments = async () => {
            if (selectedPostId !== null) {
                const postComments = await PostService.fetchCommentsByPostId(selectedPostId);
                setComments(postComments);
            }
        };

        fetchComments();
    }, [selectedPostId]);

    const memoizedComments = useMemo(() => {
        return comments.map((comment) => (
            <Comment key={comment.id} comment={comment} />
        ));
    }, [comments]);

    if (!post) {
        return null;
    }

    return (
        <div className="postDetailContainer">
            <h3>{post.title}</h3>
            <div>{post.author}</div>
            <div>{post.description}</div>
            <h4>Comments</h4>
            {memoizedComments}
        </div>
    );
};

export default PostDetails;
