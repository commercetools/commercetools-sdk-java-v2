
package com.commercetools.api.models.order_edit;

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
public class StagedOrderAddDeliveryActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderAddDeliveryActionBuilder builder) {
        StagedOrderAddDeliveryAction stagedOrderAddDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderAddDeliveryAction).isInstanceOf(StagedOrderAddDeliveryAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderAddDeliveryAction.builder().deliveryKey("deliveryKey") },
                new Object[] { StagedOrderAddDeliveryAction.builder().shippingKey("shippingKey") },
                new Object[] { StagedOrderAddDeliveryAction.builder()
                        .items(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { StagedOrderAddDeliveryAction.builder()
                        .address(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { StagedOrderAddDeliveryAction.builder()
                        .parcels(Collections.singletonList(new com.commercetools.api.models.order.ParcelDraftImpl())) },
                new Object[] { StagedOrderAddDeliveryAction.builder()
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
