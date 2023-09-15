
package com.commercetools.api.models.message;

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
public class StoreProductSelectionsChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreProductSelectionsChangedMessagePayloadBuilder builder) {
        StoreProductSelectionsChangedMessagePayload storeProductSelectionsChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(storeProductSelectionsChangedMessagePayload)
                .isInstanceOf(StoreProductSelectionsChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreProductSelectionsChangedMessagePayload.builder()
                        .addedProductSelections(Collections
                                .singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl())) },
                new Object[] { StoreProductSelectionsChangedMessagePayload.builder()
                        .removedProductSelections(Collections
                                .singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl())) },
                new Object[] { StoreProductSelectionsChangedMessagePayload.builder()
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
