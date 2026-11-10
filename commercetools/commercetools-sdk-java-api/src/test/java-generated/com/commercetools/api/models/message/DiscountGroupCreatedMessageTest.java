
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupCreatedMessageBuilder builder) {
        DiscountGroupCreatedMessage discountGroupCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(discountGroupCreatedMessage).isInstanceOf(DiscountGroupCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discountGroup", DiscountGroupCreatedMessage.builder()
                .discountGroup(new com.commercetools.api.models.discount_group.DiscountGroupImpl()) } };
    }

    @Test
    public void discountGroup() {
        DiscountGroupCreatedMessage value = DiscountGroupCreatedMessage.of();
        value.setDiscountGroup(new com.commercetools.api.models.discount_group.DiscountGroupImpl());
        Assertions.assertThat(value.getDiscountGroup())
                .isEqualTo(new com.commercetools.api.models.discount_group.DiscountGroupImpl());
    }
}
