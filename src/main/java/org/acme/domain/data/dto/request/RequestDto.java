package org.acme.domain.data.dto.request;

public class RequestDto {
    private int num;

    public RequestDto() {
    }
    public RequestDto(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "RequestDto{" +
                "num=" + num +
                '}';
    }
}
