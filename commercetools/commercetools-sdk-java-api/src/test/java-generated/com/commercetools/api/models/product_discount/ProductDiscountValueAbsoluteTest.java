
package com.commercetools.api.models.product_discount;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountValueAbsoluteTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountValueAbsoluteBuilder builder) {
        ProductDiscountValueAbsolute productDiscountValueAbsolute = builder.buildUnchecked();
        Assertions.assertThat(productDiscountValueAbsolute).isInstanceOf(ProductDiscountValueAbsolute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "money", ProductDiscountValueAbsolute.builder()
                .money(Collections.singletonList(new com.commercetools.api.models.common.CentPrecisionMoneyImpl())) } };
    }

    @Test
    public void money() {
        ProductDiscountValueAbsolute value = ProductDiscountValueAbsolute.of();
        value.setMoney(Collections.singletonList(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()));
        Assertions.assertThat(value.getMoney())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()));
    }
}
