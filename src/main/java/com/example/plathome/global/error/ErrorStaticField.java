package com.example.plathome.global.error;

public class ErrorStaticField {
    public static final int BAD_REQUEST = 400;
    public static final int UNAUTHORIZED = 401;
    public static final int FORBIDDEN = 403;
    public static final int NOT_FOUND = 404;
    public static final int NOT_MATCH = 405;
    public static final int OK = 200;
    public static final int CREATED = 201;


    //member
    public static final String MEMBER_NOT_FOUND = "존재하지 않는 회원입니다.";
    public static final String DUP_EMAIL = "이미 존재하는 이메일 입니다.";
    public static final String DUP_NICKNAME = "이미 존재하는 닉네임 입니다.";
    public static final String MEMBER_UNAUTHORIZED = "Member 로그인이 필요한 서비스 입니다.";
    public static final String INVALID_ID = "존재하지 않는 아이디 입니다.";
    public static final String INVALID_PASSWORD = "비밀번호가 올바르지 않습니다.";

    //request
    public static final String BINDING_ERROR = "잘못된 Form 형식입니다.";
    public static final String REQUEST_BODY_NOT_FOUND = "ReqeustBody에 입력된 내용이 없습니다.";
    public static final String INVALID_REFRESH_TOKEN = "Refresh 토큰 인증에 실패하였습니다.";
    public static final String INVALID_ACCESS_TOKEN = "Access 토큰 인증에 실패하였습니다.";
    public static final String EXPIRED_REFRESH_TOKEN = "Refresh 토큰만료! 재로그인 하세요.";
    public static final String EXPIRED_ACCESS_TOKEN = "Access 토큰만료! 재시도 하세요.";
    public static final String CONVERSION_ERROR = "변환 불가능한 타입이 URL에 입력되었습니다";
    public static final String EMAIL_FORM_ERROR = "Email should end with @ajou.ac.kr";
    public static final String EXPIRED_AUTH_CODE = "인증번호 만료! 재인증 하세요.";
    public static final String INVALID_AUTH_CODE = "이메일 인증번호 인증에 실패하였습니다.";
    public static final String MEMBER_FORBIDDEN = "접근권한이 없는 회원입니다.";
    public static final String DUP_REQUESTED = "한번에 하나의 매물만 등록요청이 가능합니다.";
    public static final String REQUESTED_NOT_FOUND = "오류: 요청된 매물을 찾을 수 없습니다.";
    public static final String ESTATE_NOT_FOUND = "오류: 등록된 매물을 찾을 수 없습니다.";
    public static final String DUP_ESTATE = "오류: 회원은 하나의 매물만 등록할 수 있습니다.";

    //chat
    public static final String ROOM_NOT_FOUND = "채팅방을 찾을 수 없습니다.";
    public static final String INVALID_SOCKET_SESSION = "소켓 세션이 유효하지 않습니다.";



}
