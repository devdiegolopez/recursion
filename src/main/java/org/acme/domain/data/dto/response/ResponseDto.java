package org.acme.domain.data.dto.response;

import org.acme.domain.data.dto.request.RequestDto;

public class ResponseDto {
    String message;
    int factorial;

    public ResponseDto() {
    }
    public ResponseDto(String message, int factorial) {
        this.message = message;
        this.factorial = factorial;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public int getFactorial() {
        return factorial;
    }
    public void setFactorial(int factorial) {
        this.factorial = factorial;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "message='" + message + '\'' +
                ", factorial=" + factorial +
                '}';
    }
}
