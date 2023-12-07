package com.night520.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {
    private Integer code;   //0-成功  1-失敗
    private String message;
    private T data;

    public static <E> Result<E> success(E data) {
        return new Result<>(0, "good", data);
    }

    public static Result success() {
        return new Result(0, "good", null);
    }

    public static Result error(String message) {
        return new Result(1, message, null);
    }
}
