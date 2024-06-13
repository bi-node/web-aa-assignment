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

    async addPost(post) {
        try {
            const response = await axios.post(`${this.baseUrl}/posts`, post);
            return response.data;
        } catch (error) {
            console.error('Error adding post:', error);
        }
    }

    async fetchPostById(id) {
        try {
            const response = await axios.get(`${this.baseUrl}/posts/${id}`);
            return response.data;
        } catch (error) {
            console.error('Error fetching post:', error);
        }
    }

    async fetchCommentsByPostId(postId) {
        try {
            const response = await axios.get(`${this.baseUrl}/posts/${postId}/comments`);
            return response.data;
        } catch (error) {
            console.error(`Error fetching comments for post ${postId}:`, error);
        }
    }

    async addComment(postId, comment) {
        try {
            const response = await axios.post(`${this.baseUrl}/posts/${postId}/comments`, comment);
            return response.data;
        } catch (error) {
            console.error(`Error adding comment to post ${postId}:`, error);
        }
    }
}

export default new PostService();
