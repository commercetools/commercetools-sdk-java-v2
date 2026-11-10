
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitStoreRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitStoreRemovedMessagePayloadBuilder builder) {
        BusinessUnitStoreRemovedMessagePayload businessUnitStoreRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitStoreRemovedMessagePayload)
                .isInstanceOf(BusinessUnitStoreRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "store", BusinessUnitStoreRemovedMessagePayload.builder()
                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) } };
    }

    @Test
    public void store() {
        BusinessUnitStoreRemovedMessagePayload value = BusinessUnitStoreRemovedMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }
}
