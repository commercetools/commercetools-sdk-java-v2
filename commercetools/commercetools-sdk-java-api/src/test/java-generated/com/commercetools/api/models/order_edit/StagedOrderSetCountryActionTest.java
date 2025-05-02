
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetCountryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetCountryActionBuilder builder) {
        StagedOrderSetCountryAction stagedOrderSetCountryAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetCountryAction).isInstanceOf(StagedOrderSetCountryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "country", StagedOrderSetCountryAction.builder().country("country") } };
    }

    @Test
    public void country() {
        StagedOrderSetCountryAction value = StagedOrderSetCountryAction.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }
}
