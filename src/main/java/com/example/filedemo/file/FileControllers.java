package com.example.filedemo.file;

import org.springframework.http.codec.multipart.FilePart;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/upload")
@EnableAsync
public class FileControllers {

   /* private final FileServices fileService;

    public FileControllers(FileServices fileService) {
        this.fileService = fileService;
    }

    @PostMapping("/images")
    public Mono<String> uploadFile(@RequestPart(name = "file") Flux<FilePart> files) {
        return fileService.uploadFile(files)
                .then(Mono.just("ok"));
    }*/
}
