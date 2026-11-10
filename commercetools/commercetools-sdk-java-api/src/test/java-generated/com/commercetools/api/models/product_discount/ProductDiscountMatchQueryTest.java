
package com.commercetools.api.models.product_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountMatchQueryTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountMatchQueryBuilder builder) {
        ProductDiscountMatchQuery productDiscountMatchQuery = builder.buildUnchecked();
        Assertions.assertThat(productDiscountMatchQuery).isInstanceOf(ProductDiscountMatchQuery.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "productId", ProductDiscountMatchQuery.builder().productId("productId") },
                new Object[] { "variantId", ProductDiscountMatchQuery.builder().variantId(5) },
                new Object[] { "staged", ProductDiscountMatchQuery.builder().staged(true) },
                new Object[] { "price", ProductDiscountMatchQuery.builder()
                        .price(new com.commercetools.api.models.common.QueryPriceImpl()) } };
    }

    @Test
    public void productId() {
        ProductDiscountMatchQuery value = ProductDiscountMatchQuery.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void variantId() {
        ProductDiscountMatchQuery value = ProductDiscountMatchQuery.of();
        value.setVariantId(5);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5);
    }

    @Test
    public void staged() {
        ProductDiscountMatchQuery value = ProductDiscountMatchQuery.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void price() {
        ProductDiscountMatchQuery value = ProductDiscountMatchQuery.of();
        value.setPrice(new com.commercetools.api.models.common.QueryPriceImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.QueryPriceImpl());
    }
}
