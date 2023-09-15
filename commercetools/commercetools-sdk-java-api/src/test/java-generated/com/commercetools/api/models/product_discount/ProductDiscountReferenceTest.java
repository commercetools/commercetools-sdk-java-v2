
package com.commercetools.api.models.product_discount;

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
public class ProductDiscountReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountReferenceBuilder builder) {
        ProductDiscountReference productDiscountReference = builder.buildUnchecked();
        Assertions.assertThat(productDiscountReference).isInstanceOf(ProductDiscountReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductDiscountReference.builder()
                        .obj(new com.commercetools.api.models.product_discount.ProductDiscountImpl()) },
                new Object[] { ProductDiscountReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        ProductDiscountReference value = ProductDiscountReference.of();
        value.setObj(new com.commercetools.api.models.product_discount.ProductDiscountImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.product_discount.ProductDiscountImpl());
    }

    @Test
    public void id() {
        ProductDiscountReference value = ProductDiscountReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
