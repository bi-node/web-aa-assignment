// src/components/Dashboard.js
import React, { useState } from "react";
import Posts from "./Posts";
import PostService from "./PostService";
import "./styles.css";

const postService = new PostService();

const Dashboard = () => {
    const [posts, setPosts] = useState(postService.findAll());
    const [title, setTitle] = useState("");

    const updateTitle = () => {
        const updatedPosts = [...posts];
        updatedPosts[0].title = title;
        setPosts(updatedPosts);
    };

    return (
        <div>
            <div className="inputContainer">
                <input 
                    name="post-title" 
                    type="text" 
                    value={title} 
                    onChange={(e) => setTitle(e.target.value)} 
                />
                <button onClick={updateTitle}>Update Title</button>
            </div>
            <Posts posts={posts} />
        </div>
    );
};

export default Dashboard;
