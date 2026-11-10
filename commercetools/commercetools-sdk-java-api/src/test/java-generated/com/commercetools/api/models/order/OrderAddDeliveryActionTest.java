
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderAddDeliveryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderAddDeliveryActionBuilder builder) {
        OrderAddDeliveryAction orderAddDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(orderAddDeliveryAction).isInstanceOf(OrderAddDeliveryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryKey", OrderAddDeliveryAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "shippingKey", OrderAddDeliveryAction.builder().shippingKey("shippingKey") },
                new Object[] { "items",
                        OrderAddDeliveryAction.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { "address",
                        OrderAddDeliveryAction.builder()
                                .address(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { "parcels",
                        OrderAddDeliveryAction.builder()
                                .parcels(Collections
                                        .singletonList(new com.commercetools.api.models.order.ParcelDraftImpl())) },
                new Object[] { "custom", OrderAddDeliveryAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void deliveryKey() {
        OrderAddDeliveryAction value = OrderAddDeliveryAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void shippingKey() {
        OrderAddDeliveryAction value = OrderAddDeliveryAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void items() {
        OrderAddDeliveryAction value = OrderAddDeliveryAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void address() {
        OrderAddDeliveryAction value = OrderAddDeliveryAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void parcels() {
        OrderAddDeliveryAction value = OrderAddDeliveryAction.of();
        value.setParcels(Collections.singletonList(new com.commercetools.api.models.order.ParcelDraftImpl()));
        Assertions.assertThat(value.getParcels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ParcelDraftImpl()));
    }

    @Test
    public void custom() {
        OrderAddDeliveryAction value = OrderAddDeliveryAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
