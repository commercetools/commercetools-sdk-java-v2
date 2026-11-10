
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreProductSelectionsChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreProductSelectionsChangedMessageBuilder builder) {
        StoreProductSelectionsChangedMessage storeProductSelectionsChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(storeProductSelectionsChangedMessage)
                .isInstanceOf(StoreProductSelectionsChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addedProductSelections",
                        StoreProductSelectionsChangedMessage.builder()
                                .addedProductSelections(Collections.singletonList(
                                    new com.commercetools.api.models.store.ProductSelectionSettingImpl())) },
                new Object[] { "removedProductSelections",
                        StoreProductSelectionsChangedMessage.builder()
                                .removedProductSelections(Collections.singletonList(
                                    new com.commercetools.api.models.store.ProductSelectionSettingImpl())) },
                new Object[] { "updatedProductSelections",
                        StoreProductSelectionsChangedMessage.builder()
                                .updatedProductSelections(Collections.singletonList(
                                    new com.commercetools.api.models.store.ProductSelectionSettingImpl())) } };
    }

    @Test
    public void addedProductSelections() {
        StoreProductSelectionsChangedMessage value = StoreProductSelectionsChangedMessage.of();
        value.setAddedProductSelections(
            Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
        Assertions.assertThat(value.getAddedProductSelections())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
    }

    @Test
    public void removedProductSelections() {
        StoreProductSelectionsChangedMessage value = StoreProductSelectionsChangedMessage.of();
        value.setRemovedProductSelections(
            Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
        Assertions.assertThat(value.getRemovedProductSelections())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
    }

    @Test
    public void updatedProductSelections() {
        StoreProductSelectionsChangedMessage value = StoreProductSelectionsChangedMessage.of();
        value.setUpdatedProductSelections(
            Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
        Assertions.assertThat(value.getUpdatedProductSelections())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl()));
    }
}
