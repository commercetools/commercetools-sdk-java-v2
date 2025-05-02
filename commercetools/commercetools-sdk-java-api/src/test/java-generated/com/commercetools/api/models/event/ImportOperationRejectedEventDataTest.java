
package com.commercetools.api.models.event;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportOperationRejectedEventDataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportOperationRejectedEventDataBuilder builder) {
        ImportOperationRejectedEventData importOperationRejectedEventData = builder.buildUnchecked();
        Assertions.assertThat(importOperationRejectedEventData).isInstanceOf(ImportOperationRejectedEventData.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ImportOperationRejectedEventData.builder().id("id") } };
    }

    @Test
    public void id() {
        ImportOperationRejectedEventData value = ImportOperationRejectedEventData.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
