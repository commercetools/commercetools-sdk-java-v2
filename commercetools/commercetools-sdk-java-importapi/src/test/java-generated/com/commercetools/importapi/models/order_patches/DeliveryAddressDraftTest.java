
package com.commercetools.importapi.models.order_patches;

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
public class DeliveryAddressDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryAddressDraftBuilder builder) {
        DeliveryAddressDraft deliveryAddressDraft = builder.buildUnchecked();
        Assertions.assertThat(deliveryAddressDraft).isInstanceOf(DeliveryAddressDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DeliveryAddressDraft.builder().deliveryId("deliveryId") }, new Object[] {
                DeliveryAddressDraft.builder().address(new com.commercetools.importapi.models.common.AddressImpl()) } };
    }

    @Test
    public void deliveryId() {
        DeliveryAddressDraft value = DeliveryAddressDraft.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void address() {
        DeliveryAddressDraft value = DeliveryAddressDraft.of();
        value.setAddress(new com.commercetools.importapi.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress())
                .isEqualTo(new com.commercetools.importapi.models.common.AddressImpl());
    }
}
