
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
public class ProductSetMetaTitleActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetMetaTitleActionBuilder builder) {
        ProductSetMetaTitleAction productSetMetaTitleAction = builder.buildUnchecked();
        Assertions.assertThat(productSetMetaTitleAction).isInstanceOf(ProductSetMetaTitleAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSetMetaTitleAction.builder()
                        .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductSetMetaTitleAction.builder().staged(true) } };
    }

    @Test
    public void metaTitle() {
        ProductSetMetaTitleAction value = ProductSetMetaTitleAction.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductSetMetaTitleAction value = ProductSetMetaTitleAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
