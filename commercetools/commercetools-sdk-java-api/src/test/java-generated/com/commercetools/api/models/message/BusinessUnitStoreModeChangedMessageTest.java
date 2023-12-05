
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
public class BusinessUnitStoreModeChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitStoreModeChangedMessageBuilder builder) {
        BusinessUnitStoreModeChangedMessage businessUnitStoreModeChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitStoreModeChangedMessage)
                .isInstanceOf(BusinessUnitStoreModeChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitStoreModeChangedMessage.builder()
                        .stores(Collections
                                .singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl())) },
                new Object[] {
                        BusinessUnitStoreModeChangedMessage.builder()
                                .storeMode(com.commercetools.api.models.business_unit.BusinessUnitStoreMode
                                        .findEnum("Explicit")) },
                new Object[] { BusinessUnitStoreModeChangedMessage.builder()
                        .oldStores(Collections
                                .singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl())) },
                new Object[] { BusinessUnitStoreModeChangedMessage.builder()
                        .oldStoreMode(
                            com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit")) } };
    }

    @Test
    public void stores() {
        BusinessUnitStoreModeChangedMessage value = BusinessUnitStoreModeChangedMessage.of();
        value.setStores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
    }

    @Test
    public void storeMode() {
        BusinessUnitStoreModeChangedMessage value = BusinessUnitStoreModeChangedMessage.of();
        value.setStoreMode(com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit"));
        Assertions.assertThat(value.getStoreMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit"));
    }

    @Test
    public void oldStores() {
        BusinessUnitStoreModeChangedMessage value = BusinessUnitStoreModeChangedMessage.of();
        value.setOldStores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
        Assertions.assertThat(value.getOldStores())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
    }

    @Test
    public void oldStoreMode() {
        BusinessUnitStoreModeChangedMessage value = BusinessUnitStoreModeChangedMessage.of();
        value.setOldStoreMode(com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit"));
        Assertions.assertThat(value.getOldStoreMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit"));
    }
}
