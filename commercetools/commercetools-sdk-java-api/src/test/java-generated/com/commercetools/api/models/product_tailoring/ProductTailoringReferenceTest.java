
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
public class ProductTailoringReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringReferenceBuilder builder) {
        ProductTailoringReference productTailoringReference = builder.buildUnchecked();
        Assertions.assertThat(productTailoringReference).isInstanceOf(ProductTailoringReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringReference.builder().id("id") },
                new Object[] { ProductTailoringReference.builder()
                        .obj(new com.commercetools.api.models.product_tailoring.ProductTailoringImpl()) } };
    }

    @Test
    public void id() {
        ProductTailoringReference value = ProductTailoringReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void obj() {
        ProductTailoringReference value = ProductTailoringReference.of();
        value.setObj(new com.commercetools.api.models.product_tailoring.ProductTailoringImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.product_tailoring.ProductTailoringImpl());
    }
}
