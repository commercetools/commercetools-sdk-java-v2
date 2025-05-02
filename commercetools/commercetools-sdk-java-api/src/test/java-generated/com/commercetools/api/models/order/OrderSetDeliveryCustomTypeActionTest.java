
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetDeliveryCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetDeliveryCustomTypeActionBuilder builder) {
        OrderSetDeliveryCustomTypeAction orderSetDeliveryCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetDeliveryCustomTypeAction).isInstanceOf(OrderSetDeliveryCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", OrderSetDeliveryCustomTypeAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey", OrderSetDeliveryCustomTypeAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "type",
                        OrderSetDeliveryCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", OrderSetDeliveryCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void deliveryId() {
        OrderSetDeliveryCustomTypeAction value = OrderSetDeliveryCustomTypeAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        OrderSetDeliveryCustomTypeAction value = OrderSetDeliveryCustomTypeAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void type() {
        OrderSetDeliveryCustomTypeAction value = OrderSetDeliveryCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        OrderSetDeliveryCustomTypeAction value = OrderSetDeliveryCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
