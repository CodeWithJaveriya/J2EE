package com.xworkz.blogs.service.impl;

import com.xworkz.blogs.dto.BlogDTO;
import com.xworkz.blogs.repository.BlogRepo;
import com.xworkz.blogs.repository.impl.BlogRepoImpl;
import com.xworkz.blogs.service.BlogService;

public class BlogServiceImpl implements BlogService {

    public BlogRepo blogRepo;

    public BlogServiceImpl(){
        blogRepo = new BlogRepoImpl();
    }
    @Override
    public boolean validateAndSave(BlogDTO blogDTO) {
        boolean titleVerified = false;
        boolean categoryVerified = false;
        boolean authorVerified = false;
        boolean creationDateVerified = false;
        boolean contentVerified = false;
        if(blogDTO != null){
            if(blogDTO.getTitle() != null){
                titleVerified = true;
                System.out.println("title verified");
            }
            if(blogDTO.getCategory() != null){
                categoryVerified = true;
                System.out.println("category verified");
            }
            if(blogDTO.getAuthor() != null){
                authorVerified = true;
                System.out.println("uthor verified");
            }
            if(blogDTO.getCreationDate() !=null){
                creationDateVerified = true;
                System.out.println("date verified");
            }
            if(blogDTO.getContent() != null){
                contentVerified = true;
                System.out.println("content verified");
            }
            if(titleVerified == true && categoryVerified == true &&
            authorVerified == true && creationDateVerified == true &&contentVerified==true){
                blogRepo.addPost(blogDTO);
                return true;
            }else {
                System.out.println("Not Verified!!!");
            }
        }
        return false;
    }

}
