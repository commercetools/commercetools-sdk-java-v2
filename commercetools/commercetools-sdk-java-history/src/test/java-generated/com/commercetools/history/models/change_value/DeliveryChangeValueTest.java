
package com.commercetools.history.models.change_value;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryChangeValueBuilder builder) {
        DeliveryChangeValue deliveryChangeValue = builder.buildUnchecked();
        Assertions.assertThat(deliveryChangeValue).isInstanceOf(DeliveryChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "items",
                        DeliveryChangeValue.builder()
                                .items(Collections.singletonList(
                                    new com.commercetools.history.models.common.DeliveryItemImpl())) },
                new Object[] { "address",
                        DeliveryChangeValue.builder()
                                .address(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { "parcels", DeliveryChangeValue.builder()
                        .parcels(
                            Collections.singletonList(new com.commercetools.history.models.common.ParcelImpl())) } };
    }

    @Test
    public void items() {
        DeliveryChangeValue value = DeliveryChangeValue.of();
        value.setItems(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
    }

    @Test
    public void address() {
        DeliveryChangeValue value = DeliveryChangeValue.of();
        value.setAddress(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void parcels() {
        DeliveryChangeValue value = DeliveryChangeValue.of();
        value.setParcels(Collections.singletonList(new com.commercetools.history.models.common.ParcelImpl()));
        Assertions.assertThat(value.getParcels())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ParcelImpl()));
    }
}
