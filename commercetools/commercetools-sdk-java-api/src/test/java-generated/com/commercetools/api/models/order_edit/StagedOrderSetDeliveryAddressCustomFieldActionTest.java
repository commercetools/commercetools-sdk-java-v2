
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetDeliveryAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetDeliveryAddressCustomFieldActionBuilder builder) {
        StagedOrderSetDeliveryAddressCustomFieldAction stagedOrderSetDeliveryAddressCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetDeliveryAddressCustomFieldAction)
                .isInstanceOf(StagedOrderSetDeliveryAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId",
                        StagedOrderSetDeliveryAddressCustomFieldAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey",
                        StagedOrderSetDeliveryAddressCustomFieldAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "name", StagedOrderSetDeliveryAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", StagedOrderSetDeliveryAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void deliveryId() {
        StagedOrderSetDeliveryAddressCustomFieldAction value = StagedOrderSetDeliveryAddressCustomFieldAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderSetDeliveryAddressCustomFieldAction value = StagedOrderSetDeliveryAddressCustomFieldAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void name() {
        StagedOrderSetDeliveryAddressCustomFieldAction value = StagedOrderSetDeliveryAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StagedOrderSetDeliveryAddressCustomFieldAction value = StagedOrderSetDeliveryAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
