// src/components/Dashboard.js
import React, { useEffect, useState } from "react";
import PostService from "./PostService";
import Posts from "./Posts";
import "./styles.css";

const Dashboard = () => {
    const [posts, setPosts] = useState([]);
    const [title, setTitle] = useState("");

    useEffect(() => {
        const fetchPosts = async () => {
            const data = await PostService.fetchPosts();
            setPosts(data);
        };

        fetchPosts();
    }, []);

    const updateTitle = () => {
        const updatedPosts = [...posts];
        if (updatedPosts.length > 0) {
            updatedPosts[0].title = title;
        }
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
