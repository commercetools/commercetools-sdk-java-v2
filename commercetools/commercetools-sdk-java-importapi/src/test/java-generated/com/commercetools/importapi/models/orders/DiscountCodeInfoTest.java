
package com.commercetools.importapi.models.orders;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeInfoTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeInfoBuilder builder) {
        DiscountCodeInfo discountCodeInfo = builder.buildUnchecked();
        Assertions.assertThat(discountCodeInfo).isInstanceOf(DiscountCodeInfo.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "discountCode", DiscountCodeInfo.builder()
                        .discountCode(new com.commercetools.importapi.models.common.DiscountCodeKeyReferenceImpl()) },
                new Object[] { "state", DiscountCodeInfo.builder()
                        .state(com.commercetools.importapi.models.orders.DiscountCodeState.findEnum("NotActive")) } };
    }

    @Test
    public void discountCode() {
        DiscountCodeInfo value = DiscountCodeInfo.of();
        value.setDiscountCode(new com.commercetools.importapi.models.common.DiscountCodeKeyReferenceImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.importapi.models.common.DiscountCodeKeyReferenceImpl());
    }

    @Test
    public void state() {
        DiscountCodeInfo value = DiscountCodeInfo.of();
        value.setState(com.commercetools.importapi.models.orders.DiscountCodeState.findEnum("NotActive"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.importapi.models.orders.DiscountCodeState.findEnum("NotActive"));
    }
}
