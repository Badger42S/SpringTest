package com.springFramworkTest.spring5WebApp.bootstrap;

import com.springFramworkTest.spring5WebApp.model.Author;
import com.springFramworkTest.spring5WebApp.model.Book;
import com.springFramworkTest.spring5WebApp.model.Publisher;
import com.springFramworkTest.spring5WebApp.repositories.AuthorRepository;
import com.springFramworkTest.spring5WebApp.repositories.BookRepository;
import com.springFramworkTest.spring5WebApp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {
    private AuthorRepository authorRepos;
    private BookRepository bookRes;
    private PublisherRepository publisherRes;

    public DevBootStrap(AuthorRepository authorRepos, BookRepository bookRes, PublisherRepository publisherRes) {
        this.authorRepos = authorRepos;
        this.bookRes = bookRes;
        this.publisherRes=publisherRes;
    }

    private void initData(){
        Author rick = new Author("Rick", "Sanches");
        Publisher cosmoPublisher=new Publisher("Scvonch","Nowhere");
        Book mortyDeath = new Book(cosmoPublisher,"Cosmic Events", "2147");
        rick.getBooks().add(mortyDeath);
        mortyDeath.getAuthors().add(rick);

        publisherRes.save(cosmoPublisher);
        authorRepos.save(rick);
        bookRes.save(mortyDeath);


        Author jery =new Author("Jery", "idiot");
        Publisher who=new Publisher("earthpublisher", "earth");
        Book spdJery=new Book(who,"Stupid Jery","2007");
        spdJery.getAuthors().add(jery);
        publisherRes.save(who);
        authorRepos.save(jery);
        bookRes.save(spdJery);

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
