
package com.commercetools.importapi.models.order_patches;

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
public class DeliveryDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryDraftBuilder builder) {
        DeliveryDraft deliveryDraft = builder.buildUnchecked();
        Assertions.assertThat(deliveryDraft).isInstanceOf(DeliveryDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DeliveryDraft.builder()
                        .items(Collections
                                .singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl())) },
                new Object[] {
                        DeliveryDraft.builder().address(new com.commercetools.importapi.models.common.AddressImpl()) },
                new Object[] { DeliveryDraft.builder()
                        .parcels(Collections.singletonList(
                            new com.commercetools.importapi.models.order_patches.DeliveryParcelDraftImpl())) } };
    }

    @Test
    public void items() {
        DeliveryDraft value = DeliveryDraft.of();
        value.setItems(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl()));
    }

    @Test
    public void address() {
        DeliveryDraft value = DeliveryDraft.of();
        value.setAddress(new com.commercetools.importapi.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress())
                .isEqualTo(new com.commercetools.importapi.models.common.AddressImpl());
    }

    @Test
    public void parcels() {
        DeliveryDraft value = DeliveryDraft.of();
        value.setParcels(
            Collections.singletonList(new com.commercetools.importapi.models.order_patches.DeliveryParcelDraftImpl()));
        Assertions.assertThat(value.getParcels())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.order_patches.DeliveryParcelDraftImpl()));
    }
}
