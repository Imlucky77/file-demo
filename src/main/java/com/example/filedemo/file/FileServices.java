package com.example.filedemo.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.stereotype.Service;


import java.nio.file.Paths;


@Service
public class FileServices {


    /*@Value("${file.upload-dir}")
    private static String UPLOAD_ROOT = "";

    public Mono<Void> uploadFile(Flux<FilePart> files) {
        return files.flatMap(file -> file.transferTo(
                Paths.get(UPLOAD_ROOT, file.filename()).toFile())).then();
    }*/

    /**
     *
     * return type: (Void, Future, CompletableFuture, ListenableFuture )
     *
     */
    /*@Async("asyncExecutor")
    public Void asynchUploadFile() throws InterruptedException{


    }*/
}
