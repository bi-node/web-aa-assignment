// src/services/PostService.js
class PostService {
    constructor() {
        this.postList = [
            { id: 1, title: 'Good Post', author: 'Blondie', description: 'Blondie Posted' },
            { id: 2, title: 'Bad Post', author: 'Angel Eye', description: 'Angel Eye posted' },
            { id: 3, title: 'The Ugly Post', author: 'Tuco', description: 'Tuco Posted' }
        ];
    }

    findAll() {
        return this.postList;
    }
}

export default PostService;
