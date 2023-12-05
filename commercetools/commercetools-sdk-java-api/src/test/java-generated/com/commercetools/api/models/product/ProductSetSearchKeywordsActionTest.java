
package com.commercetools.api.models.product;

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
public class ProductSetSearchKeywordsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetSearchKeywordsActionBuilder builder) {
        ProductSetSearchKeywordsAction productSetSearchKeywordsAction = builder.buildUnchecked();
        Assertions.assertThat(productSetSearchKeywordsAction).isInstanceOf(ProductSetSearchKeywordsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSetSearchKeywordsAction.builder()
                        .searchKeywords(new com.commercetools.api.models.product.SearchKeywordsImpl()) },
                new Object[] { ProductSetSearchKeywordsAction.builder().staged(true) } };
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
