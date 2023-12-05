
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
public class ProductSetMetaKeywordsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetMetaKeywordsActionBuilder builder) {
        ProductSetMetaKeywordsAction productSetMetaKeywordsAction = builder.buildUnchecked();
        Assertions.assertThat(productSetMetaKeywordsAction).isInstanceOf(ProductSetMetaKeywordsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSetMetaKeywordsAction.builder()
                        .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductSetMetaKeywordsAction.builder().staged(true) } };
    }

    @Test
    public void metaKeywords() {
        ProductSetMetaKeywordsAction value = ProductSetMetaKeywordsAction.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductSetMetaKeywordsAction value = ProductSetMetaKeywordsAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
