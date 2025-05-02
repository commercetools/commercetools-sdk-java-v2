
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryImportRequestBuilder builder) {
        InventoryImportRequest inventoryImportRequest = builder.buildUnchecked();
        Assertions.assertThat(inventoryImportRequest).isInstanceOf(InventoryImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources",
                InventoryImportRequest.builder()
                        .resources(Collections.singletonList(
                            new com.commercetools.importapi.models.inventories.InventoryImportImpl())) } };
    }

    @Test
    public void resources() {
        InventoryImportRequest value = InventoryImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.inventories.InventoryImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.inventories.InventoryImportImpl()));
    }
}
