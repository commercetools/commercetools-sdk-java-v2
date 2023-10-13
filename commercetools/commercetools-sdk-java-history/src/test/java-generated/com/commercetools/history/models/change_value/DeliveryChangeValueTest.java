
package com.commercetools.history.models.change_value;

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
public class DeliveryChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryChangeValueBuilder builder) {
        DeliveryChangeValue deliveryChangeValue = builder.buildUnchecked();
        Assertions.assertThat(deliveryChangeValue).isInstanceOf(DeliveryChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DeliveryChangeValue.builder()
                        .items(Collections
                                .singletonList(new com.commercetools.history.models.common.DeliveryItemImpl())) },
                new Object[] { DeliveryChangeValue.builder()
                        .address(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { DeliveryChangeValue.builder()
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
