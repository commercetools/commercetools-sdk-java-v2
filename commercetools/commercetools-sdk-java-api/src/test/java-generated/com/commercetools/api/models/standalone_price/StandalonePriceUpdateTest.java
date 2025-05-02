
package com.commercetools.api.models.standalone_price;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceUpdateBuilder builder) {
        StandalonePriceUpdate standalonePriceUpdate = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceUpdate).isInstanceOf(StandalonePriceUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", StandalonePriceUpdate.builder().version(2L) },
                new Object[] { "actions", StandalonePriceUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        StandalonePriceUpdate value = StandalonePriceUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        StandalonePriceUpdate value = StandalonePriceUpdate.of();
        value.setActions(Collections
                .singletonList(new com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionImpl()));
    }
}
