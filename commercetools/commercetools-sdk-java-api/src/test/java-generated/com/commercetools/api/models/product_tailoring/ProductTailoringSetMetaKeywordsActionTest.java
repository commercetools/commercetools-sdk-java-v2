
package com.commercetools.api.models.product_tailoring;

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
public class ProductTailoringSetMetaKeywordsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringSetMetaKeywordsActionBuilder builder) {
        ProductTailoringSetMetaKeywordsAction productTailoringSetMetaKeywordsAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetMetaKeywordsAction)
                .isInstanceOf(ProductTailoringSetMetaKeywordsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTailoringSetMetaKeywordsAction.builder()
                        .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductTailoringSetMetaKeywordsAction.builder().staged(true) } };
    }

    @Test
    public void metaKeywords() {
        ProductTailoringSetMetaKeywordsAction value = ProductTailoringSetMetaKeywordsAction.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductTailoringSetMetaKeywordsAction value = ProductTailoringSetMetaKeywordsAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
