
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
public class ProductReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductReferenceBuilder builder) {
        ProductReference productReference = builder.buildUnchecked();
        Assertions.assertThat(productReference).isInstanceOf(ProductReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductReference.builder().obj(new com.commercetools.api.models.product.ProductImpl()) },
                new Object[] { ProductReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        ProductReference value = ProductReference.of();
        value.setObj(new com.commercetools.api.models.product.ProductImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.product.ProductImpl());
    }

    @Test
    public void id() {
        ProductReference value = ProductReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
