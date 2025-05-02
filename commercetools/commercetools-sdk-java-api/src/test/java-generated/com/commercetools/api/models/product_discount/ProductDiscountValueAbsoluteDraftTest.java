
package com.commercetools.api.models.product_discount;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountValueAbsoluteDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountValueAbsoluteDraftBuilder builder) {
        ProductDiscountValueAbsoluteDraft productDiscountValueAbsoluteDraft = builder.buildUnchecked();
        Assertions.assertThat(productDiscountValueAbsoluteDraft).isInstanceOf(ProductDiscountValueAbsoluteDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "money", ProductDiscountValueAbsoluteDraft.builder()
                .money(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl())) } };
    }

    @Test
    public void money() {
        ProductDiscountValueAbsoluteDraft value = ProductDiscountValueAbsoluteDraft.of();
        value.setMoney(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl()));
        Assertions.assertThat(value.getMoney())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl()));
    }
}
