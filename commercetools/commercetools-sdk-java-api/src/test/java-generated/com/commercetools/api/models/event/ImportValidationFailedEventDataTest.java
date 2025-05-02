
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportValidationFailedEventDataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportValidationFailedEventDataBuilder builder) {
        ImportValidationFailedEventData importValidationFailedEventData = builder.buildUnchecked();
        Assertions.assertThat(importValidationFailedEventData).isInstanceOf(ImportValidationFailedEventData.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ImportValidationFailedEventData.builder().id("id") },
                new Object[] { "version", ImportValidationFailedEventData.builder().version(2) },
                new Object[] { "importContainerKey",
                        ImportValidationFailedEventData.builder().importContainerKey("importContainerKey") } };
    }

    @Test
    public void id() {
        ImportValidationFailedEventData value = ImportValidationFailedEventData.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ImportValidationFailedEventData value = ImportValidationFailedEventData.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void importContainerKey() {
        ImportValidationFailedEventData value = ImportValidationFailedEventData.of();
        value.setImportContainerKey("importContainerKey");
        Assertions.assertThat(value.getImportContainerKey()).isEqualTo("importContainerKey");
    }
}
