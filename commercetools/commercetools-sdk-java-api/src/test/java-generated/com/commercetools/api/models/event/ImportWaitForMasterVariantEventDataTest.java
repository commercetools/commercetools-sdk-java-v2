
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportWaitForMasterVariantEventDataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportWaitForMasterVariantEventDataBuilder builder) {
        ImportWaitForMasterVariantEventData importWaitForMasterVariantEventData = builder.buildUnchecked();
        Assertions.assertThat(importWaitForMasterVariantEventData)
                .isInstanceOf(ImportWaitForMasterVariantEventData.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ImportWaitForMasterVariantEventData.builder().id("id") },
                new Object[] { "version", ImportWaitForMasterVariantEventData.builder().version(2) },
                new Object[] { "importContainerKey",
                        ImportWaitForMasterVariantEventData.builder().importContainerKey("importContainerKey") } };
    }

    @Test
    public void id() {
        ImportWaitForMasterVariantEventData value = ImportWaitForMasterVariantEventData.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ImportWaitForMasterVariantEventData value = ImportWaitForMasterVariantEventData.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void importContainerKey() {
        ImportWaitForMasterVariantEventData value = ImportWaitForMasterVariantEventData.of();
        value.setImportContainerKey("importContainerKey");
        Assertions.assertThat(value.getImportContainerKey()).isEqualTo("importContainerKey");
    }
}
