package ru.zeidler.excelsior.exception;

public class NoTickerException extends RuntimeException {


    public NoTickerException(String ticker) {
        super("No ticker: " + ticker);
    }

}
