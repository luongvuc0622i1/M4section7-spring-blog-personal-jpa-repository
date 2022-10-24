//package com.codegym.controller;
//
//import com.codegym.model.Category;
//import com.codegym.service.category.ICategoryService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.Optional;
//
//@Controller
//public class CategoryController {
//    @Autowired
//    private ICategoryService categoryService;
//
//    @GetMapping("/")
//    public ModelAndView listBlog() {
//        Iterable<Category> category = categoryService.findAll();
//        ModelAndView modelAndView = new ModelAndView("/category/list");
//        modelAndView.addObject("category", category);
//        return modelAndView;
//    }
//    @GetMapping("/category")
//    public ModelAndView showCreateForm() {
//        ModelAndView modelAndView = new ModelAndView("/category/create");
//        modelAndView.addObject("category", new Category());
//        return modelAndView;
//    }
//
//    @PostMapping("/create-category")
//    public ModelAndView saveBlog(@ModelAttribute("category") Category category) {
//        categoryService.save(category);
//        ModelAndView modelAndView = new ModelAndView("/category/create");
//        modelAndView.addObject("category", new Category());
//        modelAndView.addObject("message", "New category created successfully");
//        return modelAndView;
//    }
//
//    @GetMapping("/edit-category/{id}")
//    public ModelAndView showEditForm(@PathVariable Long id) {
//        Optional<Category> category = categoryService.findById(id);
//        if (category != null) {
//            ModelAndView modelAndView = new ModelAndView("/category/edit");
//            modelAndView.addObject("category", category);
//            return modelAndView;
//        } else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }
//
//    @PostMapping("/edit-category")
//    public ModelAndView updateBlog(@ModelAttribute("category") Category category) {
//        categoryService.save(category);
//        ModelAndView modelAndView = new ModelAndView("/category/edit");
//        modelAndView.addObject("category", category);
//        modelAndView.addObject("message", "Category updated successfully");
//        return modelAndView;
//    }
//    @GetMapping("/delete-category/{id}")
//    public ModelAndView showDeleteForm(@PathVariable Long id){
//        Optional<Category> category = categoryService.findById(id);
//        if(category != null) {
//            ModelAndView modelAndView = new ModelAndView("/category/delete");
//            modelAndView.addObject("category", category);
//            return modelAndView;
//
//        }else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }
//    @PostMapping("/delete-category")
//    public String deleteCategory(@ModelAttribute("category") Category category) {
//        categoryService.remove(category.getId());
//        return "redirect:/";
//    }
//}
