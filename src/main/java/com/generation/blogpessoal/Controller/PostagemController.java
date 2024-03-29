package com.generation.blogpessoal.Controller;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/postagens")
    @CrossOrigin(origins = "*", allowedHeaders = "*")


    public class PostagemController {

        @Autowired
        private PostagemRepository postagemRepository;

        @GetMapping
        public ResponseEntity<List<Postagem>> getall(){
            return (ResponseEntity<List<Postagem>>) ResponseEntity.ok(postagemRepository.findAll());
        }

}
