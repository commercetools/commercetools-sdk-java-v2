
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
public class BusinessUnitStoreModeChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitStoreModeChangedMessagePayloadBuilder builder) {
        BusinessUnitStoreModeChangedMessagePayload businessUnitStoreModeChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitStoreModeChangedMessagePayload)
                .isInstanceOf(BusinessUnitStoreModeChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitStoreModeChangedMessagePayload.builder()
                        .stores(Collections
                                .singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl())) },
                new Object[] {
                        BusinessUnitStoreModeChangedMessagePayload.builder()
                                .storeMode(com.commercetools.api.models.business_unit.BusinessUnitStoreMode
                                        .findEnum("Explicit")) },
                new Object[] { BusinessUnitStoreModeChangedMessagePayload.builder()
                        .oldStores(Collections
                                .singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl())) },
                new Object[] { BusinessUnitStoreModeChangedMessagePayload.builder()
                        .oldStoreMode(
                            com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit")) } };
    }

    @Test
    public void stores() {
        BusinessUnitStoreModeChangedMessagePayload value = BusinessUnitStoreModeChangedMessagePayload.of();
        value.setStores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
    }

    @Test
    public void storeMode() {
        BusinessUnitStoreModeChangedMessagePayload value = BusinessUnitStoreModeChangedMessagePayload.of();
        value.setStoreMode(com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit"));
        Assertions.assertThat(value.getStoreMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit"));
    }

    @Test
    public void oldStores() {
        BusinessUnitStoreModeChangedMessagePayload value = BusinessUnitStoreModeChangedMessagePayload.of();
        value.setOldStores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
        Assertions.assertThat(value.getOldStores())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
    }

    @Test
    public void oldStoreMode() {
        BusinessUnitStoreModeChangedMessagePayload value = BusinessUnitStoreModeChangedMessagePayload.of();
        value.setOldStoreMode(com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit"));
        Assertions.assertThat(value.getOldStoreMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit"));
    }
}
