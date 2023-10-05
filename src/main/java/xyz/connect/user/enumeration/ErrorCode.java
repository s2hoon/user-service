package xyz.connect.user.enumeration;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    //Common
    SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Z001", "Unknown Server Error"),
    THIRD_PARTY_API_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR, "Z002", ""),
    NOT_SUPPORTED_METHOD(HttpStatus.BAD_REQUEST, "Z003", "지원하지 않는 Http method 입니다."),

    INVALID_API_PARAMETER(HttpStatus.BAD_REQUEST,"Z004" ,"파라미터를 확인해주세요." );

    private final HttpStatus status;
    private final String code;
    private final String message;

    ErrorCode(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
