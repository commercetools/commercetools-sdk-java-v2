
package com.commercetools.api.models.customer;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetStoresActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetStoresActionBuilder builder) {
        CustomerSetStoresAction customerSetStoresAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetStoresAction).isInstanceOf(CustomerSetStoresAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stores",
                CustomerSetStoresAction.builder()
                        .stores(Collections.singletonList(
                            new com.commercetools.api.models.store.StoreResourceIdentifierImpl())) } };
    }

    @Test
    public void stores() {
        CustomerSetStoresAction value = CustomerSetStoresAction.of();
        value.setStores(
            Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
    }
}
