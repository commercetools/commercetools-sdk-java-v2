
package com.commercetools.api.models.discount_code;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeUpdateBuilder builder) {
        DiscountCodeUpdate discountCodeUpdate = builder.buildUnchecked();
        Assertions.assertThat(discountCodeUpdate).isInstanceOf(DiscountCodeUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", DiscountCodeUpdate.builder().version(2L) },
                new Object[] { "actions",
                        DiscountCodeUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.discount_code.DiscountCodeUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        DiscountCodeUpdate value = DiscountCodeUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        DiscountCodeUpdate value = DiscountCodeUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.discount_code.DiscountCodeUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.discount_code.DiscountCodeUpdateActionImpl()));
    }
}
