
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitStoreModeChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitStoreModeChangedMessagePayloadBuilder builder) {
        BusinessUnitStoreModeChangedMessagePayload businessUnitStoreModeChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitStoreModeChangedMessagePayload)
                .isInstanceOf(BusinessUnitStoreModeChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "stores",
                        BusinessUnitStoreModeChangedMessagePayload.builder()
                                .stores(Collections.singletonList(
                                    new com.commercetools.api.models.store.StoreKeyReferenceImpl())) },
                new Object[] { "storeMode",
                        BusinessUnitStoreModeChangedMessagePayload.builder()
                                .storeMode(com.commercetools.api.models.business_unit.BusinessUnitStoreMode
                                        .findEnum("Explicit")) },
                new Object[] { "oldStores",
                        BusinessUnitStoreModeChangedMessagePayload.builder()
                                .oldStores(Collections.singletonList(
                                    new com.commercetools.api.models.store.StoreKeyReferenceImpl())) },
                new Object[] { "oldStoreMode", BusinessUnitStoreModeChangedMessagePayload.builder()
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
