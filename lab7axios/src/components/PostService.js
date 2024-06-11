// src/services/PostService.js
import axios from "axios";

const BASE_URL = "http://localhost:9900/posts";

const fetchPosts = async () => {
    try {
        const response = await axios.get(BASE_URL);
        const data = response.data.map(post => ({
            id: post.id,
            title: post.title,
            author: post.author,
        }));
        return data;
    } catch (error) {
        console.error("Error fetching posts:", error);
        return [];
    }
};

export default {
    fetchPosts,
};
