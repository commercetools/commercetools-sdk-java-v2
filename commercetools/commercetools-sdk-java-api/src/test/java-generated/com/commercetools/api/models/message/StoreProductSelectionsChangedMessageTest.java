
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
public class StoreProductSelectionsChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreProductSelectionsChangedMessageBuilder builder) {
        StoreProductSelectionsChangedMessage storeProductSelectionsChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(storeProductSelectionsChangedMessage)
                .isInstanceOf(StoreProductSelectionsChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreProductSelectionsChangedMessage.builder()
                        .addedProductSelections(Collections
                                .singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl())) },
                new Object[] { StoreProductSelectionsChangedMessage.builder()
                        .removedProductSelections(Collections
                                .singletonList(new com.commercetools.api.models.store.ProductSelectionSettingImpl())) },
                new Object[] { StoreProductSelectionsChangedMessage.builder()
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
