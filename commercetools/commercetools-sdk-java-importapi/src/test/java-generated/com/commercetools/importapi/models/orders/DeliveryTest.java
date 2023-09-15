
package com.commercetools.importapi.models.orders;

import java.time.ZonedDateTime;
import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class DeliveryTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryBuilder builder) {
        Delivery delivery = builder.buildUnchecked();
        Assertions.assertThat(delivery).isInstanceOf(Delivery.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Delivery.builder().id("id") },
                new Object[] { Delivery.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { Delivery.builder()
                        .items(Collections
                                .singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl())) },
                new Object[] {
                        Delivery.builder()
                                .parcels(Collections
                                        .singletonList(new com.commercetools.importapi.models.orders.ParcelImpl())) },
                new Object[] {
                        Delivery.builder().address(new com.commercetools.importapi.models.common.AddressImpl()) } };
    }

    @Test
    public void id() {
        Delivery value = Delivery.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void createdAt() {
        Delivery value = Delivery.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void items() {
        Delivery value = Delivery.of();
        value.setItems(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl()));
    }

    @Test
    public void parcels() {
        Delivery value = Delivery.of();
        value.setParcels(Collections.singletonList(new com.commercetools.importapi.models.orders.ParcelImpl()));
        Assertions.assertThat(value.getParcels())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.orders.ParcelImpl()));
    }

    @Test
    public void address() {
        Delivery value = Delivery.of();
        value.setAddress(new com.commercetools.importapi.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress())
                .isEqualTo(new com.commercetools.importapi.models.common.AddressImpl());
    }
}
