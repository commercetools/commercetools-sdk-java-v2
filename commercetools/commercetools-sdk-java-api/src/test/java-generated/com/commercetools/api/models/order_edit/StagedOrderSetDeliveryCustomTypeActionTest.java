
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetDeliveryCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetDeliveryCustomTypeActionBuilder builder) {
        StagedOrderSetDeliveryCustomTypeAction stagedOrderSetDeliveryCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetDeliveryCustomTypeAction)
                .isInstanceOf(StagedOrderSetDeliveryCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId",
                        StagedOrderSetDeliveryCustomTypeAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey",
                        StagedOrderSetDeliveryCustomTypeAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "type",
                        StagedOrderSetDeliveryCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", StagedOrderSetDeliveryCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void deliveryId() {
        StagedOrderSetDeliveryCustomTypeAction value = StagedOrderSetDeliveryCustomTypeAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderSetDeliveryCustomTypeAction value = StagedOrderSetDeliveryCustomTypeAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void type() {
        StagedOrderSetDeliveryCustomTypeAction value = StagedOrderSetDeliveryCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        StagedOrderSetDeliveryCustomTypeAction value = StagedOrderSetDeliveryCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
