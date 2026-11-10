
package com.commercetools.api.models.discount_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupResourceIdentifierBuilder builder) {
        DiscountGroupResourceIdentifier discountGroupResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(discountGroupResourceIdentifier).isInstanceOf(DiscountGroupResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", DiscountGroupResourceIdentifier.builder().id("id") },
                new Object[] { "key", DiscountGroupResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        DiscountGroupResourceIdentifier value = DiscountGroupResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        DiscountGroupResourceIdentifier value = DiscountGroupResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
