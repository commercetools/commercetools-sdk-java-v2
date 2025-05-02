
package com.commercetools.history.models.common;

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
                new Object[] { "discountCode",
                        DiscountCodeInfo.builder()
                                .discountCode(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "state", DiscountCodeInfo.builder()
                        .state(com.commercetools.history.models.common.DiscountCodeState.findEnum("NotActive")) } };
    }

    @Test
    public void discountCode() {
        DiscountCodeInfo value = DiscountCodeInfo.of();
        value.setDiscountCode(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void state() {
        DiscountCodeInfo value = DiscountCodeInfo.of();
        value.setState(com.commercetools.history.models.common.DiscountCodeState.findEnum("NotActive"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.history.models.common.DiscountCodeState.findEnum("NotActive"));
    }
}
