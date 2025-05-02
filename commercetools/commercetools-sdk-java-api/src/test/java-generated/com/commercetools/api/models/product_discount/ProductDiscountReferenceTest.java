
package com.commercetools.api.models.product_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountReferenceBuilder builder) {
        ProductDiscountReference productDiscountReference = builder.buildUnchecked();
        Assertions.assertThat(productDiscountReference).isInstanceOf(ProductDiscountReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        ProductDiscountReference.builder()
                                .obj(new com.commercetools.api.models.product_discount.ProductDiscountImpl()) },
                new Object[] { "id", ProductDiscountReference.builder().id("id") } };
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
