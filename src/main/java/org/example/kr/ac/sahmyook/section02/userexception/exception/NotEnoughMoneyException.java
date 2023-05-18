package org.example.kr.ac.sahmyook.section02.userexception.exception;

public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException() {}

    public NotEnoughMoneyException(String msg) {
        super(msg);
    }
}
