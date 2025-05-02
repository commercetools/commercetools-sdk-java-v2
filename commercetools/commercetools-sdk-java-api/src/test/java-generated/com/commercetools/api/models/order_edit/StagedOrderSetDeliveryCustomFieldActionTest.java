
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetDeliveryCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetDeliveryCustomFieldActionBuilder builder) {
        StagedOrderSetDeliveryCustomFieldAction stagedOrderSetDeliveryCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetDeliveryCustomFieldAction)
                .isInstanceOf(StagedOrderSetDeliveryCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId",
                        StagedOrderSetDeliveryCustomFieldAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey",
                        StagedOrderSetDeliveryCustomFieldAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "name", StagedOrderSetDeliveryCustomFieldAction.builder().name("name") },
                new Object[] { "value", StagedOrderSetDeliveryCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void deliveryId() {
        StagedOrderSetDeliveryCustomFieldAction value = StagedOrderSetDeliveryCustomFieldAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderSetDeliveryCustomFieldAction value = StagedOrderSetDeliveryCustomFieldAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void name() {
        StagedOrderSetDeliveryCustomFieldAction value = StagedOrderSetDeliveryCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetDeliveryCustomFieldAction value = StagedOrderSetDeliveryCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
