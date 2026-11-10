
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderAddDeliveryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderAddDeliveryActionBuilder builder) {
        StagedOrderAddDeliveryAction stagedOrderAddDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderAddDeliveryAction).isInstanceOf(StagedOrderAddDeliveryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryKey", StagedOrderAddDeliveryAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "shippingKey", StagedOrderAddDeliveryAction.builder().shippingKey("shippingKey") },
                new Object[] { "items",
                        StagedOrderAddDeliveryAction.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { "address",
                        StagedOrderAddDeliveryAction.builder()
                                .address(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { "parcels",
                        StagedOrderAddDeliveryAction.builder()
                                .parcels(Collections
                                        .singletonList(new com.commercetools.api.models.order.ParcelDraftImpl())) },
                new Object[] { "custom", StagedOrderAddDeliveryAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void deliveryKey() {
        StagedOrderAddDeliveryAction value = StagedOrderAddDeliveryAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void shippingKey() {
        StagedOrderAddDeliveryAction value = StagedOrderAddDeliveryAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void items() {
        StagedOrderAddDeliveryAction value = StagedOrderAddDeliveryAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void address() {
        StagedOrderAddDeliveryAction value = StagedOrderAddDeliveryAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void parcels() {
        StagedOrderAddDeliveryAction value = StagedOrderAddDeliveryAction.of();
        value.setParcels(Collections.singletonList(new com.commercetools.api.models.order.ParcelDraftImpl()));
        Assertions.assertThat(value.getParcels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ParcelDraftImpl()));
    }

    @Test
    public void custom() {
        StagedOrderAddDeliveryAction value = StagedOrderAddDeliveryAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
