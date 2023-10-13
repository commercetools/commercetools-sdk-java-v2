
package com.commercetools.api.models.product_type;

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
public class ProductTypeReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeReferenceBuilder builder) {
        ProductTypeReference productTypeReference = builder.buildUnchecked();
        Assertions.assertThat(productTypeReference).isInstanceOf(ProductTypeReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTypeReference.builder()
                        .obj(new com.commercetools.api.models.product_type.ProductTypeImpl()) },
                new Object[] { ProductTypeReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        ProductTypeReference value = ProductTypeReference.of();
        value.setObj(new com.commercetools.api.models.product_type.ProductTypeImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.product_type.ProductTypeImpl());
    }

    @Test
    public void id() {
        ProductTypeReference value = ProductTypeReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
