package com.jams7777.study.ddd.main.controller;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
public class MainControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private WebClient webClient;

    @Test
    public void 메인화면호출테스트() throws Exception {

        // 페이지 호출 정상테스트
        this.mvc.perform(get("/").accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk());

        // 페이지 내용 테스트
        HtmlPage page = this.webClient.getPage("/");
        //assertThat(page.getBody().getTextContent().trim()).isEqualTo("메인화면");
    }

}