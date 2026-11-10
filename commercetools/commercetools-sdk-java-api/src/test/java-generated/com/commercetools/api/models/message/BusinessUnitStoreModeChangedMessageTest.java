
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitStoreModeChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitStoreModeChangedMessageBuilder builder) {
        BusinessUnitStoreModeChangedMessage businessUnitStoreModeChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitStoreModeChangedMessage)
                .isInstanceOf(BusinessUnitStoreModeChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "stores",
                        BusinessUnitStoreModeChangedMessage.builder()
                                .stores(Collections.singletonList(
                                    new com.commercetools.api.models.store.StoreKeyReferenceImpl())) },
                new Object[] { "storeMode",
                        BusinessUnitStoreModeChangedMessage.builder()
                                .storeMode(com.commercetools.api.models.business_unit.BusinessUnitStoreMode
                                        .findEnum("Explicit")) },
                new Object[] { "oldStores",
                        BusinessUnitStoreModeChangedMessage.builder()
                                .oldStores(Collections.singletonList(
                                    new com.commercetools.api.models.store.StoreKeyReferenceImpl())) },
                new Object[] { "oldStoreMode", BusinessUnitStoreModeChangedMessage.builder()
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
