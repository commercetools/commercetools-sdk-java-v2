
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportResourceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportResourceBuilder builder) {
        ImportResource importResource = builder.buildUnchecked();
        Assertions.assertThat(importResource).isInstanceOf(ImportResource.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ImportResource.builder().key("key") } };
    }

    @Test
    public void key() {
        ImportResource value = ImportResource.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
