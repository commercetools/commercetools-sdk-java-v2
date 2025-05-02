
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetDeliveryAddressCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetDeliveryAddressCustomTypeActionBuilder builder) {
        OrderSetDeliveryAddressCustomTypeAction orderSetDeliveryAddressCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetDeliveryAddressCustomTypeAction)
                .isInstanceOf(OrderSetDeliveryAddressCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId",
                        OrderSetDeliveryAddressCustomTypeAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey",
                        OrderSetDeliveryAddressCustomTypeAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "type",
                        OrderSetDeliveryAddressCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", OrderSetDeliveryAddressCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void deliveryId() {
        OrderSetDeliveryAddressCustomTypeAction value = OrderSetDeliveryAddressCustomTypeAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        OrderSetDeliveryAddressCustomTypeAction value = OrderSetDeliveryAddressCustomTypeAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void type() {
        OrderSetDeliveryAddressCustomTypeAction value = OrderSetDeliveryAddressCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        OrderSetDeliveryAddressCustomTypeAction value = OrderSetDeliveryAddressCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
