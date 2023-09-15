
package com.commercetools.history.models.common;

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
                new Object[] { Delivery.builder().createdAt("createdAt") },
                new Object[] { Delivery.builder()
                        .items(Collections
                                .singletonList(new com.commercetools.history.models.common.DeliveryItemImpl())) },
                new Object[] { Delivery.builder()
                        .parcels(Collections.singletonList(new com.commercetools.history.models.common.ParcelImpl())) },
                new Object[] { Delivery.builder().address(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] {
                        Delivery.builder().custom(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
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
        value.setCreatedAt("createdAt");
        Assertions.assertThat(value.getCreatedAt()).isEqualTo("createdAt");
    }

    @Test
    public void items() {
        Delivery value = Delivery.of();
        value.setItems(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
    }

    @Test
    public void parcels() {
        Delivery value = Delivery.of();
        value.setParcels(Collections.singletonList(new com.commercetools.history.models.common.ParcelImpl()));
        Assertions.assertThat(value.getParcels())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ParcelImpl()));
    }

    @Test
    public void address() {
        Delivery value = Delivery.of();
        value.setAddress(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void custom() {
        Delivery value = Delivery.of();
        value.setCustom(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
