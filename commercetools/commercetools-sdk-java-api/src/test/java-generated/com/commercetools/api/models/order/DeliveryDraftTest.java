
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryDraftBuilder builder) {
        DeliveryDraft deliveryDraft = builder.buildUnchecked();
        Assertions.assertThat(deliveryDraft).isInstanceOf(DeliveryDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", DeliveryDraft.builder().key("key") }, new Object[] { "items",
                DeliveryDraft.builder()
                        .items(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { "parcels",
                        DeliveryDraft.builder()
                                .parcels(Collections
                                        .singletonList(new com.commercetools.api.models.order.ParcelDraftImpl())) },
                new Object[] { "address",
                        DeliveryDraft.builder().address(new com.commercetools.api.models.common.AddressDraftImpl()) },
                new Object[] { "custom", DeliveryDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        DeliveryDraft value = DeliveryDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void items() {
        DeliveryDraft value = DeliveryDraft.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void parcels() {
        DeliveryDraft value = DeliveryDraft.of();
        value.setParcels(Collections.singletonList(new com.commercetools.api.models.order.ParcelDraftImpl()));
        Assertions.assertThat(value.getParcels())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ParcelDraftImpl()));
    }

    @Test
    public void address() {
        DeliveryDraft value = DeliveryDraft.of();
        value.setAddress(new com.commercetools.api.models.common.AddressDraftImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressDraftImpl());
    }

    @Test
    public void custom() {
        DeliveryDraft value = DeliveryDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
