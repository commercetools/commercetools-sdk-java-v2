
package com.commercetools.api.models.business_unit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitSetStoreModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitSetStoreModeActionBuilder builder) {
        BusinessUnitSetStoreModeAction businessUnitSetStoreModeAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSetStoreModeAction).isInstanceOf(BusinessUnitSetStoreModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "storeMode",
                        BusinessUnitSetStoreModeAction.builder()
                                .storeMode(com.commercetools.api.models.business_unit.BusinessUnitStoreMode
                                        .findEnum("Explicit")) },
                new Object[] { "stores",
                        BusinessUnitSetStoreModeAction.builder()
                                .stores(Collections.singletonList(
                                    new com.commercetools.api.models.store.StoreResourceIdentifierImpl())) } };
    }

    @Test
    public void storeMode() {
        BusinessUnitSetStoreModeAction value = BusinessUnitSetStoreModeAction.of();
        value.setStoreMode(com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit"));
        Assertions.assertThat(value.getStoreMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitStoreMode.findEnum("Explicit"));
    }

    @Test
    public void stores() {
        BusinessUnitSetStoreModeAction value = BusinessUnitSetStoreModeAction.of();
        value.setStores(
            Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
    }
}
