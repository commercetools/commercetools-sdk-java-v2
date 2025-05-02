
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitRemoveStoreActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitRemoveStoreActionBuilder builder) {
        BusinessUnitRemoveStoreAction businessUnitRemoveStoreAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitRemoveStoreAction).isInstanceOf(BusinessUnitRemoveStoreAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "store", BusinessUnitRemoveStoreAction.builder()
                .store(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()) } };
    }

    @Test
    public void store() {
        BusinessUnitRemoveStoreAction value = BusinessUnitRemoveStoreAction.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }
}
