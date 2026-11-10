
package com.commercetools.importapi.models.order_patches;

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
        return new Object[][] {
                new Object[] { "items",
                        DeliveryDraft.builder()
                                .items(Collections.singletonList(
                                    new com.commercetools.importapi.models.orders.DeliveryItemImpl())) },
                new Object[] { "address",
                        DeliveryDraft.builder().address(new com.commercetools.importapi.models.common.AddressImpl()) },
                new Object[] { "parcels", DeliveryDraft.builder()
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
