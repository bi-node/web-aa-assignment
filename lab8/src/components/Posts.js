import React, { useContext, useEffect } from 'react';
import PostService from '../services/PostService';
import Post from './Post';
import { PostContext } from '../context/PostContext';

const Posts = () => {
    const { posts, setPosts, setSelectedPostId } = useContext(PostContext);

    useEffect(() => {
        const fetchPosts = async () => {
            const fetchedPosts = await PostService.fetchPosts();
            setPosts(fetchedPosts);
        };

        fetchPosts();
    }, [setPosts]);

    const handlePostClick = (postId) => {
        setSelectedPostId(postId);
    };

    return (
        <div className="posts-container">
            {posts.map((post) => (
                <div key={post.id} onClick={() => handlePostClick(post.id)}>
                    <Post post={post} />
                </div>
            ))}
        </div>
    );
};

export default Posts;
