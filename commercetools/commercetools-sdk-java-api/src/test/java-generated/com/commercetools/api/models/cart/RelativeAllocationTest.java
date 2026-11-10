
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RelativeAllocationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RelativeAllocationBuilder builder) {
        RelativeAllocation relativeAllocation = builder.buildUnchecked();
        Assertions.assertThat(relativeAllocation).isInstanceOf(RelativeAllocation.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "percentage", RelativeAllocation.builder().percentage(3) } };
    }

    @Test
    public void percentage() {
        RelativeAllocation value = RelativeAllocation.of();
        value.setPercentage(3);
        Assertions.assertThat(value.getPercentage()).isEqualTo(3);
    }
}
