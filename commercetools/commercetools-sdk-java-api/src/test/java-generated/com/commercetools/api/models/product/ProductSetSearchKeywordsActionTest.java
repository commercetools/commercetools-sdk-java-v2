
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetSearchKeywordsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetSearchKeywordsActionBuilder builder) {
        ProductSetSearchKeywordsAction productSetSearchKeywordsAction = builder.buildUnchecked();
        Assertions.assertThat(productSetSearchKeywordsAction).isInstanceOf(ProductSetSearchKeywordsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "searchKeywords",
                        ProductSetSearchKeywordsAction.builder()
                                .searchKeywords(new com.commercetools.api.models.product.SearchKeywordsImpl()) },
                new Object[] { "staged", ProductSetSearchKeywordsAction.builder().staged(true) } };
    }

    @Test
    public void searchKeywords() {
        ProductSetSearchKeywordsAction value = ProductSetSearchKeywordsAction.of();
        value.setSearchKeywords(new com.commercetools.api.models.product.SearchKeywordsImpl());
        Assertions.assertThat(value.getSearchKeywords())
                .isEqualTo(new com.commercetools.api.models.product.SearchKeywordsImpl());
    }

    @Test
    public void staged() {
        ProductSetSearchKeywordsAction value = ProductSetSearchKeywordsAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
