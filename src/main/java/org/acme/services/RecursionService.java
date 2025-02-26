package org.acme.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.domain.data.dto.request.RequestDto;
import org.acme.domain.data.dto.response.ResponseDto;
import org.acme.domain.ports.RecursionServicePort;

import java.util.logging.Logger;

@ApplicationScoped
public class RecursionService implements RecursionServicePort {
    @Override
    public ResponseDto eval(RequestDto requestDto) {
        int factorial = requestDto.getNum();
        Logger logger = Logger.getLogger(RecursionService.class.getName());
        logger.info(requestDto.toString());
        int result = evalu(factorial);
        String messageEval = even(factorial);
        return new ResponseDto(messageEval,result);
    }
    private String even(int factorial) {
        return factorial%2==0?"even":"odd";
    }
    public int evalu(int factorial) {
        if (factorial == 0 || factorial == 1) {
            return 1;
        }
        return factorial * evalu(factorial-1);
    }
}