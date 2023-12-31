package com.example.plathome.user_report.controller;

import com.example.plathome.login.argumentresolver_interceptor.argumentresolver.Admin;
import com.example.plathome.login.argumentresolver_interceptor.argumentresolver.Login;
import com.example.plathome.member.domain.MemberSession;
import com.example.plathome.user_report.dto.request.UserReportForm;
import com.example.plathome.user_report.dto.response.UserReportResponse;
import com.example.plathome.user_report.service.UserReportService;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/chat/user-report")
@RequiredArgsConstructor
@RestController
public class UserReportController {
    private final UserReportService userReportService;

    @PostMapping("/auth")
    public String report(
            @Parameter(hidden = true) @Login MemberSession memberSession,
            @RequestBody @Valid UserReportForm userReportForm
    ) {
        userReportService.report(memberSession, userReportForm);
        return "success";
    }

    @GetMapping("/auth/{userReportId}")
    public UserReportResponse getOne(
            @Parameter(hidden = true) @Admin MemberSession memberSession,
            @PathVariable long userReportId
    ) {
        return userReportService.getById(userReportId);
    }

    @GetMapping("/auth")
    public List<UserReportResponse> getAll(
            @Parameter(hidden = true) @Admin MemberSession memberSession
    ) {
        return userReportService.getAll();
    }

    @DeleteMapping("/auth/{userReportId}")
    public String delete(
            @Parameter(hidden = true) @Admin MemberSession memberSession,
            @PathVariable long userReportId
    ) {
        userReportService.delete(userReportId);
        return "success";
    }
}
