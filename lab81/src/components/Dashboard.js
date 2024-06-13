// src/components/Dashboard.js
import React, { useState, useEffect } from 'react';
import Posts from './Posts';
import PostDetails from './PostDetails';
import AddPost from './AddPost';
import { SelectedPostProvider } from './SelectedPostContext ';
import PostService from './PostService';
import './styles.css';

const Dashboard = () => {
    const [posts, setPosts] = useState([]);

    // Function to fetch posts
    const fetchPosts = async () => {
        const fetchedPosts = await PostService.fetchPosts();
        setPosts(fetchedPosts);
    };

    useEffect(() => {
        fetchPosts();
    }, []); // Fetch posts on component mount

    // Function to refresh posts after adding a new post
    const handleAddPost = () => {
        fetchPosts(); // Fetch posts again after adding a post
    };

    return (
        <SelectedPostProvider>
            <div className="dashboard">
                <AddPost onAddPost={handleAddPost} />
                <Posts posts={posts} />
                <PostDetails />
            </div>
        </SelectedPostProvider>
    );
};

export default Dashboard;
