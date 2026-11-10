
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreProductSelectionsChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreProductSelectionsChangedMessagePayloadBuilder builder) {
        StoreProductSelectionsChangedMessagePayload storeProductSelectionsChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(storeProductSelectionsChangedMessagePayload)
                .isInstanceOf(StoreProductSelectionsChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addedProductSelections",
                        StoreProductSelectionsChangedMessagePayload.builder()
                                .addedProductSelections(Collections.singletonList(
                                    new com.commercetools.api.models.store.ProductSelectionSettingImpl())) },
                new Object[] { "removedProductSelections",
                        StoreProductSelectionsChangedMessagePayload.builder()
                                .removedProductSelections(Collections.singletonList(
                                    new com.commercetools.api.models.store.ProductSelectionSettingImpl())) },
                new Object[] { "updatedProductSelections",
                        StoreProductSelectionsChangedMessagePayload.builder()
                                .updatedProductSelections(Collections.singletonList(
                                    new com.commercetools.api.models.store.ProductSelectionSettingImpl())) } };
    }

    @Test
    public void addedProductSelections() {
        StoreProductSelectionsChangedMessagePayload value = StoreProductSelectionsChangedMessagePayload.of();
        value.setAddedProductSelections(
            Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
        Assertions.assertThat(value.getAddedProductSelections())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
    }

    @Test
    public void removedProductSelections() {
        StoreProductSelectionsChangedMessagePayload value = StoreProductSelectionsChangedMessagePayload.of();
        value.setRemovedProductSelections(
            Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
        Assertions.assertThat(value.getRemovedProductSelections())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
    }

    @Test
    public void updatedProductSelections() {
        StoreProductSelectionsChangedMessagePayload value = StoreProductSelectionsChangedMessagePayload.of();
        value.setUpdatedProductSelections(
            Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
        Assertions.assertThat(value.getUpdatedProductSelections())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
    }
}
