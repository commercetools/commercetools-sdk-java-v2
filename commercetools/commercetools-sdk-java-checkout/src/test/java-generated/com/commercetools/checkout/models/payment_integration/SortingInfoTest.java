
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SortingInfoTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SortingInfoBuilder builder) {
        SortingInfo sortingInfo = builder.buildUnchecked();
        Assertions.assertThat(sortingInfo).isInstanceOf(SortingInfo.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "priority", SortingInfo.builder().priority(6) } };
    }

    @Test
    public void priority() {
        SortingInfo value = SortingInfo.of();
        value.setPriority(6);
        Assertions.assertThat(value.getPriority()).isEqualTo(6);
    }
}
