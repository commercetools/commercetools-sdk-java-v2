
package com.commercetools.importapi.models.products;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class SearchKeywordTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SearchKeywordBuilder builder) {
        SearchKeyword searchKeyword = builder.buildUnchecked();
        Assertions.assertThat(searchKeyword).isInstanceOf(SearchKeyword.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SearchKeyword.builder().text("text") },
                new Object[] { SearchKeyword.builder()
                        .suggestTokenizer(new com.commercetools.importapi.models.products.SuggestTokenizerImpl()) } };
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
        value.setSuggestTokenizer(new com.commercetools.importapi.models.products.SuggestTokenizerImpl());
        Assertions.assertThat(value.getSuggestTokenizer())
                .isEqualTo(new com.commercetools.importapi.models.products.SuggestTokenizerImpl());
    }
}
