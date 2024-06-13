// src/services/PostService.js
import axios from 'axios';

class PostService {
    constructor() {
        this.baseUrl = 'http://localhost:9900';
    }

    async fetchPosts() {
        try {
            const response = await axios.get(`${this.baseUrl}/posts`);
            return response.data;
        } catch (error) {
            console.error('Error fetching posts:', error);
            return [];
        }
    }

    async fetchPostById(postId) {
        try {
            const response = await axios.get(`${this.baseUrl}/posts/${postId}`);
            return response.data;
        } catch (error) {
            console.error('Error fetching post by ID:', error);
            return null;
        }
    }

    async fetchCommentsByPostId(postId) {
        try {
            const response = await axios.get(`${this.baseUrl}/posts/${postId}/comments`);
            return response.data;
        } catch (error) {
            console.error('Error fetching comments by post ID:', error);
            return [];
        }
    }

    async addPost(post) {
        try {
            const response = await axios.post(`${this.baseUrl}/posts`, post);
            return response.data;
        } catch (error) {
            console.error('Error adding post:', error);
            return null;
        }
    }
}

export default new PostService();
