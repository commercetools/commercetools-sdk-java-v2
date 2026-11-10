
package com.commercetools.api.models.discount_group;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupUpdateBuilder builder) {
        DiscountGroupUpdate discountGroupUpdate = builder.buildUnchecked();
        Assertions.assertThat(discountGroupUpdate).isInstanceOf(DiscountGroupUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", DiscountGroupUpdate.builder().version(2L) },
                new Object[] { "actions", DiscountGroupUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.discount_group.DiscountGroupUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        DiscountGroupUpdate value = DiscountGroupUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        DiscountGroupUpdate value = DiscountGroupUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.discount_group.DiscountGroupUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.discount_group.DiscountGroupUpdateActionImpl()));
    }
}
