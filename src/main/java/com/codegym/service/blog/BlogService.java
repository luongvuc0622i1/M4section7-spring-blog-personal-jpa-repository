package com.codegym.service.blog;

import com.codegym.model.Blog;
import com.codegym.repository.blog.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public Iterable<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blog model) {
        blogRepository.save(model);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }
}
