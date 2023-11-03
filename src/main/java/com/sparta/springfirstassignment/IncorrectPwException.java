package com.sparta.springfirstassignment;

public class IncorrectPwException extends Exception{
    public IncorrectPwException(){
        super("비밀번호가 일치하지 않습니다.");
    }

}
