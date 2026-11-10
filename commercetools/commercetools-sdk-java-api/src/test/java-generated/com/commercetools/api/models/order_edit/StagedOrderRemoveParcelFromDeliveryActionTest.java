
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderRemoveParcelFromDeliveryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderRemoveParcelFromDeliveryActionBuilder builder) {
        StagedOrderRemoveParcelFromDeliveryAction stagedOrderRemoveParcelFromDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderRemoveParcelFromDeliveryAction)
                .isInstanceOf(StagedOrderRemoveParcelFromDeliveryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "parcelId", StagedOrderRemoveParcelFromDeliveryAction.builder().parcelId("parcelId") },
                new Object[] { "parcelKey",
                        StagedOrderRemoveParcelFromDeliveryAction.builder().parcelKey("parcelKey") } };
    }

    @Test
    public void parcelId() {
        StagedOrderRemoveParcelFromDeliveryAction value = StagedOrderRemoveParcelFromDeliveryAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        StagedOrderRemoveParcelFromDeliveryAction value = StagedOrderRemoveParcelFromDeliveryAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }
}
