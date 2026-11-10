
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeReferenceBuilder builder) {
        DiscountCodeReference discountCodeReference = builder.buildUnchecked();
        Assertions.assertThat(discountCodeReference).isInstanceOf(DiscountCodeReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", DiscountCodeReference.builder().id("id") } };
    }

    @Test
    public void id() {
        DiscountCodeReference value = DiscountCodeReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
