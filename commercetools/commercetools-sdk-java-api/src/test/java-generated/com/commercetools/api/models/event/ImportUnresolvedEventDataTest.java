
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportUnresolvedEventDataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportUnresolvedEventDataBuilder builder) {
        ImportUnresolvedEventData importUnresolvedEventData = builder.buildUnchecked();
        Assertions.assertThat(importUnresolvedEventData).isInstanceOf(ImportUnresolvedEventData.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ImportUnresolvedEventData.builder().id("id") },
                new Object[] { "version", ImportUnresolvedEventData.builder().version(2) },
                new Object[] { "importContainerKey",
                        ImportUnresolvedEventData.builder().importContainerKey("importContainerKey") } };
    }

    @Test
    public void id() {
        ImportUnresolvedEventData value = ImportUnresolvedEventData.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ImportUnresolvedEventData value = ImportUnresolvedEventData.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void importContainerKey() {
        ImportUnresolvedEventData value = ImportUnresolvedEventData.of();
        value.setImportContainerKey("importContainerKey");
        Assertions.assertThat(value.getImportContainerKey()).isEqualTo("importContainerKey");
    }
}
