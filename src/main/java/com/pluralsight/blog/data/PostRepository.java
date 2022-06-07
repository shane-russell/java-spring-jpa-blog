package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Category;
import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// findAll, findById(id) are in parent classes along with other methods
public interface PostRepository extends JpaRepository<Post, Long> {

    public List<Post> findByCategory(Category category);
}