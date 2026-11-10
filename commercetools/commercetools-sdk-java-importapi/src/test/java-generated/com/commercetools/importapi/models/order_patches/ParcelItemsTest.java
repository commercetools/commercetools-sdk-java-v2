
package com.commercetools.importapi.models.order_patches;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelItemsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelItemsBuilder builder) {
        ParcelItems parcelItems = builder.buildUnchecked();
        Assertions.assertThat(parcelItems).isInstanceOf(ParcelItems.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "parcelId", ParcelItems.builder().parcelId("parcelId") },
                new Object[] { "items",
                        ParcelItems.builder()
                                .items(Collections.singletonList(
                                    new com.commercetools.importapi.models.orders.DeliveryItemImpl())) } };
    }

    @Test
    public void parcelId() {
        ParcelItems value = ParcelItems.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void items() {
        ParcelItems value = ParcelItems.of();
        value.setItems(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl()));
    }
}
