// src/components/Dashboard.js
import React, { useEffect, useState } from "react";
import PostService from "./PostService";
import Posts from "./Posts";
import AddPost from "./AddPost";
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

    const handlePostAdded = (newPost) => {
        setPosts([...posts, newPost]);
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
            <AddPost onPostAdded={handlePostAdded} />
            <Posts posts={posts} />
        </div>
    );
};

export default Dashboard;
