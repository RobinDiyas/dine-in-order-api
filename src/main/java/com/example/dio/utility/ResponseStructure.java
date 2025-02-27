package com.example.dio.utility;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseStructure <T>{

    private int status;
    private String message;
    private T data;

    public static <T> ResponseStructure<T> create(HttpStatus status, String message, T data){
        ResponseStructure<T> reponse = new ResponseStructure();
        reponse.status= status.value();
        reponse.message=message;
        reponse.data=data;

        return reponse;
}

}
