package com.example.plathome.member.exception;


import com.example.plathome.global.exception.NotFoundException;

import static com.example.plathome.global.error.ErrorStaticField.ERROR_MEMBER_NOT_FOUND;

public class NotFoundMemberException extends NotFoundException {
    private static final String MESSAGE = ERROR_MEMBER_NOT_FOUND;
    public NotFoundMemberException() {
        super(MESSAGE);
    }
}
