
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitStoreAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitStoreAddedMessagePayloadBuilder builder) {
        BusinessUnitStoreAddedMessagePayload businessUnitStoreAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitStoreAddedMessagePayload)
                .isInstanceOf(BusinessUnitStoreAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "store", BusinessUnitStoreAddedMessagePayload.builder()
                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) } };
    }

    @Test
    public void store() {
        BusinessUnitStoreAddedMessagePayload value = BusinessUnitStoreAddedMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }
}
