
package com.commercetools.api.models.discount_code;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeChangeGroupsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeChangeGroupsActionBuilder builder) {
        DiscountCodeChangeGroupsAction discountCodeChangeGroupsAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeChangeGroupsAction).isInstanceOf(DiscountCodeChangeGroupsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "groups",
                DiscountCodeChangeGroupsAction.builder().groups(Collections.singletonList("groups")) } };
    }

    @Test
    public void groups() {
        DiscountCodeChangeGroupsAction value = DiscountCodeChangeGroupsAction.of();
        value.setGroups(Collections.singletonList("groups"));
        Assertions.assertThat(value.getGroups()).isEqualTo(Collections.singletonList("groups"));
    }
}
