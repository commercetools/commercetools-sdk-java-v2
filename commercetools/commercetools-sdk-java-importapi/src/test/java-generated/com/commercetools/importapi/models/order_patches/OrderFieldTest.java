
package com.commercetools.importapi.models.order_patches;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderFieldTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderFieldBuilder builder) {
        OrderField orderField = builder.buildUnchecked();
        Assertions.assertThat(orderField).isInstanceOf(OrderField.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addReturnInfo",
                        OrderField.builder()
                                .addReturnInfo(new com.commercetools.importapi.models.order_patches.ReturnInfoImpl()) },
                new Object[] { "addParcelToDelivery",
                        OrderField.builder()
                                .addParcelToDelivery(
                                    new com.commercetools.importapi.models.order_patches.DeliveryParcelImpl()) },
                new Object[] { "addDeliveries",
                        OrderField.builder()
                                .addDeliveries(Collections.singletonList(
                                    new com.commercetools.importapi.models.order_patches.DeliveryDraftImpl())) },
                new Object[] { "removeDelivery",
                        OrderField.builder()
                                .removeDelivery(
                                    new com.commercetools.importapi.models.order_patches.RemoveDeliveryDraftImpl()) },
                new Object[] { "removeParcelFromDelivery", OrderField.builder()
                        .removeParcelFromDelivery(
                            new com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraftImpl()) },
                new Object[] { "setDeliveryAddress",
                        OrderField.builder()
                                .setDeliveryAddress(
                                    new com.commercetools.importapi.models.order_patches.DeliveryAddressDraftImpl()) },
                new Object[] { "setParcelMeasurements", OrderField.builder()
                        .setParcelMeasurements(
                            new com.commercetools.importapi.models.order_patches.ParcelMeasurementDraftImpl()) },
                new Object[] { "setParcelTrackingData",
                        OrderField.builder()
                                .setParcelTrackingData(
                                    new com.commercetools.importapi.models.order_patches.ParcelTrackingDataImpl()) },
                new Object[] { "setParcelItems",
                        OrderField.builder()
                                .setParcelItems(Collections.singletonList(
                                    new com.commercetools.importapi.models.order_patches.ParcelItemsImpl())) } };
    }

    @Test
    public void addReturnInfo() {
        OrderField value = OrderField.of();
        value.setAddReturnInfo(new com.commercetools.importapi.models.order_patches.ReturnInfoImpl());
        Assertions.assertThat(value.getAddReturnInfo())
                .isEqualTo(new com.commercetools.importapi.models.order_patches.ReturnInfoImpl());
    }

    @Test
    public void addParcelToDelivery() {
        OrderField value = OrderField.of();
        value.setAddParcelToDelivery(new com.commercetools.importapi.models.order_patches.DeliveryParcelImpl());
        Assertions.assertThat(value.getAddParcelToDelivery())
                .isEqualTo(new com.commercetools.importapi.models.order_patches.DeliveryParcelImpl());
    }

    @Test
    public void addDeliveries() {
        OrderField value = OrderField.of();
        value.setAddDeliveries(
            Collections.singletonList(new com.commercetools.importapi.models.order_patches.DeliveryDraftImpl()));
        Assertions.assertThat(value.getAddDeliveries())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.order_patches.DeliveryDraftImpl()));
    }

    @Test
    public void removeDelivery() {
        OrderField value = OrderField.of();
        value.setRemoveDelivery(new com.commercetools.importapi.models.order_patches.RemoveDeliveryDraftImpl());
        Assertions.assertThat(value.getRemoveDelivery())
                .isEqualTo(new com.commercetools.importapi.models.order_patches.RemoveDeliveryDraftImpl());
    }

    @Test
    public void removeParcelFromDelivery() {
        OrderField value = OrderField.of();
        value.setRemoveParcelFromDelivery(
            new com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraftImpl());
        Assertions.assertThat(value.getRemoveParcelFromDelivery())
                .isEqualTo(new com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraftImpl());
    }

    @Test
    public void setDeliveryAddress() {
        OrderField value = OrderField.of();
        value.setSetDeliveryAddress(new com.commercetools.importapi.models.order_patches.DeliveryAddressDraftImpl());
        Assertions.assertThat(value.getSetDeliveryAddress())
                .isEqualTo(new com.commercetools.importapi.models.order_patches.DeliveryAddressDraftImpl());
    }

    @Test
    public void setParcelMeasurements() {
        OrderField value = OrderField.of();
        value.setSetParcelMeasurements(
            new com.commercetools.importapi.models.order_patches.ParcelMeasurementDraftImpl());
        Assertions.assertThat(value.getSetParcelMeasurements())
                .isEqualTo(new com.commercetools.importapi.models.order_patches.ParcelMeasurementDraftImpl());
    }

    @Test
    public void setParcelTrackingData() {
        OrderField value = OrderField.of();
        value.setSetParcelTrackingData(new com.commercetools.importapi.models.order_patches.ParcelTrackingDataImpl());
        Assertions.assertThat(value.getSetParcelTrackingData())
                .isEqualTo(new com.commercetools.importapi.models.order_patches.ParcelTrackingDataImpl());
    }

    @Test
    public void setParcelItems() {
        OrderField value = OrderField.of();
        value.setSetParcelItems(
            Collections.singletonList(new com.commercetools.importapi.models.order_patches.ParcelItemsImpl()));
        Assertions.assertThat(value.getSetParcelItems())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.order_patches.ParcelItemsImpl()));
    }
}
