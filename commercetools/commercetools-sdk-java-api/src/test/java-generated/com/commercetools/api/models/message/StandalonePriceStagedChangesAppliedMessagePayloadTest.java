
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceStagedChangesAppliedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceStagedChangesAppliedMessagePayloadBuilder builder) {
        StandalonePriceStagedChangesAppliedMessagePayload standalonePriceStagedChangesAppliedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(standalonePriceStagedChangesAppliedMessagePayload)
                .isInstanceOf(StandalonePriceStagedChangesAppliedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stagedChanges",
                StandalonePriceStagedChangesAppliedMessagePayload.builder()
                        .stagedChanges(
                            new com.commercetools.api.models.standalone_price.StagedStandalonePriceImpl()) } };
    }

    @Test
    public void stagedChanges() {
        StandalonePriceStagedChangesAppliedMessagePayload value = StandalonePriceStagedChangesAppliedMessagePayload
                .of();
        value.setStagedChanges(new com.commercetools.api.models.standalone_price.StagedStandalonePriceImpl());
        Assertions.assertThat(value.getStagedChanges())
                .isEqualTo(new com.commercetools.api.models.standalone_price.StagedStandalonePriceImpl());
    }
}
