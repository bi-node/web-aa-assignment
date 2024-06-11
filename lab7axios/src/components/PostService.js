// src/services/PostService.js
import axios from "axios";

const BASE_URL = "http://localhost:9900/posts";

const fetchPosts = async () => {
    try {
        const response = await axios.get(BASE_URL);
        return response.data;
    } catch (error) {
        console.error("Error fetching posts:", error);
        return [];
    }
};

const addPost = async (post) => {
    try {
        const response = await axios.post(BASE_URL, post);
        return response.data;
    } catch (error) {
        console.error("Error adding post:", error);
        return null;
    }
};

export default {
    fetchPosts,
    addPost,
};
