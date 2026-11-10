
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportContainerDeletedEventDataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportContainerDeletedEventDataBuilder builder) {
        ImportContainerDeletedEventData importContainerDeletedEventData = builder.buildUnchecked();
        Assertions.assertThat(importContainerDeletedEventData).isInstanceOf(ImportContainerDeletedEventData.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ImportContainerDeletedEventData.builder().key("key") },
                new Object[] { "version", ImportContainerDeletedEventData.builder().version(2) } };
    }

    @Test
    public void key() {
        ImportContainerDeletedEventData value = ImportContainerDeletedEventData.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void version() {
        ImportContainerDeletedEventData value = ImportContainerDeletedEventData.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }
}
