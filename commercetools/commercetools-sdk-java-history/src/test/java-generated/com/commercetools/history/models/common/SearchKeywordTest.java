
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchKeywordTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchKeywordBuilder builder) {
        SearchKeyword searchKeyword = builder.buildUnchecked();
        Assertions.assertThat(searchKeyword).isInstanceOf(SearchKeyword.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "text", SearchKeyword.builder().text("text") },
                new Object[] { "suggestTokenizer", SearchKeyword.builder()
                        .suggestTokenizer(new com.commercetools.history.models.common.SuggestTokenizerImpl()) } };
    }

    @Test
    public void text() {
        SearchKeyword value = SearchKeyword.of();
        value.setText("text");
        Assertions.assertThat(value.getText()).isEqualTo("text");
    }

    @Test
    public void suggestTokenizer() {
        SearchKeyword value = SearchKeyword.of();
        value.setSuggestTokenizer(new com.commercetools.history.models.common.SuggestTokenizerImpl());
        Assertions.assertThat(value.getSuggestTokenizer())
                .isEqualTo(new com.commercetools.history.models.common.SuggestTokenizerImpl());
    }
}
