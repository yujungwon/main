package com.project._tteockgi.global.global.initData;

import com.project._tteockgi.domain.article.service.ArticleService;
import com.project._tteockgi.domain.auction.service.AuctionService;
import com.project._tteockgi.domain.member.entity.Member;
import com.project._tteockgi.domain.member.service.MemberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class Dev {

    @Bean
    public CommandLineRunner init(MemberService memberService, ArticleService articleService, AuctionService auctionService) {
        return args -> {
            Member admin = memberService.create("admin", "admin","admin@admin.com", "1234" );
            Member member1 = memberService.create("member1", "member1","member1@admin.com", "1234" );
            Member member2 = memberService.create("member2", "member2","member2@admin.com", "1234" );


            // 게시글 등록
            articleService.create("에어팟 팝니다.",  "에어팟 팝니다.", admin);
            articleService.create("건담 프라모델 팝니다.",  "건담 프라모델 팝니다.", member1);
            articleService.create("리바이 프라모델 팝니다.",  "리바이 프라모델 팝니다.", member1);
            articleService.create("보노보노 프라모델 팝니다.",  "보노보노 프라모델 팝니다.",  member2);
            articleService.create("워해머 40k 스페이스 마린 팝니다.",  "워해머 40k 스페이스 마린 팝니다.",  member2);
            // 5개  더

            // 경매 등록
            auctionService.create("에어팟 경매 합니다.",  "에어팟 합니다.", admin);
            auctionService.create("건담 프라모델 경매합니다.",  "건담 프라모델 경매합니다.", member1);
            auctionService.create("리바이 프라모델 경매합니다.",  "리바이 프라모델 경매합니다.", member1);
            auctionService.create("보노보노 프라모델 경매합니다.",  "보노보노 프라모델 경매합니다.",  member2);
            auctionService.create("워해머 40k 스페이스 마린 경매합니다.",  "워해머 40k 스페이스 마린 경매합니다.",  member2);
            // 5개  더
        };
    }

}
