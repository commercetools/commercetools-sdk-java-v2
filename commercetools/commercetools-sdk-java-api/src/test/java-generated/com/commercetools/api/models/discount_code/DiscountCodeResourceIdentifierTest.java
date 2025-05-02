
package com.commercetools.api.models.discount_code;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeResourceIdentifierBuilder builder) {
        DiscountCodeResourceIdentifier discountCodeResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(discountCodeResourceIdentifier).isInstanceOf(DiscountCodeResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", DiscountCodeResourceIdentifier.builder().id("id") },
                new Object[] { "key", DiscountCodeResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        DiscountCodeResourceIdentifier value = DiscountCodeResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        DiscountCodeResourceIdentifier value = DiscountCodeResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
