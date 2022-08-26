package com.example.demo.controller;

import com.example.demo.dto.Member;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/")
    public String index() {
        return "redirect:/member/list";
    }

    @GetMapping("/add")
    public String addMemberForm() {
        return "addMemberForm";
    }

    @PostMapping("/add")
    public String addMember(@ModelAttribute Member member) {
        memberService.addMember(member);
        return "redirect:/member/list";
    }

    @GetMapping("/list")
    public String getMembers(Model model) {
        List<Member> members = memberService.getMembers();
        model.addAttribute("members", members);
        return "members";
    }
}
