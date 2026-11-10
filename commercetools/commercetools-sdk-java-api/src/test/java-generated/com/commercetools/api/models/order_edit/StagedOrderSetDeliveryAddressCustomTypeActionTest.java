
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetDeliveryAddressCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetDeliveryAddressCustomTypeActionBuilder builder) {
        StagedOrderSetDeliveryAddressCustomTypeAction stagedOrderSetDeliveryAddressCustomTypeAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetDeliveryAddressCustomTypeAction)
                .isInstanceOf(StagedOrderSetDeliveryAddressCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId",
                        StagedOrderSetDeliveryAddressCustomTypeAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey",
                        StagedOrderSetDeliveryAddressCustomTypeAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "type",
                        StagedOrderSetDeliveryAddressCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", StagedOrderSetDeliveryAddressCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void deliveryId() {
        StagedOrderSetDeliveryAddressCustomTypeAction value = StagedOrderSetDeliveryAddressCustomTypeAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderSetDeliveryAddressCustomTypeAction value = StagedOrderSetDeliveryAddressCustomTypeAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void type() {
        StagedOrderSetDeliveryAddressCustomTypeAction value = StagedOrderSetDeliveryAddressCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        StagedOrderSetDeliveryAddressCustomTypeAction value = StagedOrderSetDeliveryAddressCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
