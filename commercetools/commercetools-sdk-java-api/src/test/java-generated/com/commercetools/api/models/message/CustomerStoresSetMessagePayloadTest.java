
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerStoresSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerStoresSetMessagePayloadBuilder builder) {
        CustomerStoresSetMessagePayload customerStoresSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerStoresSetMessagePayload).isInstanceOf(CustomerStoresSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "stores",
                        CustomerStoresSetMessagePayload.builder()
                                .stores(Collections.singletonList(
                                    new com.commercetools.api.models.store.StoreKeyReferenceImpl())) },
                new Object[] { "oldStores",
                        CustomerStoresSetMessagePayload.builder()
                                .oldStores(Collections.singletonList(
                                    new com.commercetools.api.models.store.StoreKeyReferenceImpl())) } };
    }

    @Test
    public void stores() {
        CustomerStoresSetMessagePayload value = CustomerStoresSetMessagePayload.of();
        value.setStores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
    }

    @Test
    public void oldStores() {
        CustomerStoresSetMessagePayload value = CustomerStoresSetMessagePayload.of();
        value.setOldStores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
        Assertions.assertThat(value.getOldStores())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
    }
}
