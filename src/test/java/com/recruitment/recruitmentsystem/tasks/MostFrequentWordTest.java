package com.recruitment.recruitmentsystem.tasks;

import com.recruitment.recruitmentsystem.tasks.services.MostFrequentWordService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MostFrequentWordTest {

    @Test
    void shouldReturnMostFrequentWord() {
        String input = "Java is great and Java is fun";
        String result = MostFrequentWordService.mostFrequentWord(input);
        assertThat(result).isEqualTo("java");
    }

    @Test
    void shouldHandleMultipleMostFrequentWords() {
        String input = "hello world hello world";
        String result = MostFrequentWordService.mostFrequentWord(input);
        assertThat(result).isIn("hello", "world");
    }

    @Test
    void shouldIgnoreCase() {
        String input = "JAVA java JaVa";
        String result = MostFrequentWordService.mostFrequentWord(input);
        assertThat(result).isEqualTo("java");
    }

    @Test
    void shouldReturnEmptyForNullOrEmptyInput() {
        assertThat(MostFrequentWordService.mostFrequentWord("")).isEqualTo("");
        assertThat(MostFrequentWordService.mostFrequentWord(null)).isEqualTo("");
    }
}
