
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DirectDiscountReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DirectDiscountReferenceBuilder builder) {
        DirectDiscountReference directDiscountReference = builder.buildUnchecked();
        Assertions.assertThat(directDiscountReference).isInstanceOf(DirectDiscountReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", DirectDiscountReference.builder().id("id") } };
    }

    @Test
    public void id() {
        DirectDiscountReference value = DirectDiscountReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
