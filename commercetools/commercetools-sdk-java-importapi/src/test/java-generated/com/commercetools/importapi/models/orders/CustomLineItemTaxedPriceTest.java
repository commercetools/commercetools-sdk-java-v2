
package com.commercetools.importapi.models.orders;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomLineItemTaxedPriceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomLineItemTaxedPriceBuilder builder) {
        CustomLineItemTaxedPrice customLineItemTaxedPrice = builder.buildUnchecked();
        Assertions.assertThat(customLineItemTaxedPrice).isInstanceOf(CustomLineItemTaxedPrice.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "totalNet",
                        CustomLineItemTaxedPrice.builder()
                                .totalNet(new com.commercetools.importapi.models.common.TypedMoneyImpl()) },
                new Object[] { "totalGross", CustomLineItemTaxedPrice.builder()
                        .totalGross(new com.commercetools.importapi.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void totalNet() {
        CustomLineItemTaxedPrice value = CustomLineItemTaxedPrice.of();
        value.setTotalNet(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getTotalNet())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }

    @Test
    public void totalGross() {
        CustomLineItemTaxedPrice value = CustomLineItemTaxedPrice.of();
        value.setTotalGross(new com.commercetools.importapi.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getTotalGross())
                .isEqualTo(new com.commercetools.importapi.models.common.TypedMoneyImpl());
    }
}
