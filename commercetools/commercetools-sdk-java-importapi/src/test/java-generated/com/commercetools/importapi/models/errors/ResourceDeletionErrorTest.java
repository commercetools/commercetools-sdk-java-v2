
package com.commercetools.importapi.models.errors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ResourceDeletionErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ResourceDeletionErrorBuilder builder) {
        ResourceDeletionError resourceDeletionError = builder.buildUnchecked();
        Assertions.assertThat(resourceDeletionError).isInstanceOf(ResourceDeletionError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resource", ResourceDeletionError.builder().resource("resource") } };
    }

    @Test
    public void resource() {
        ResourceDeletionError value = ResourceDeletionError.of();
        value.setResource("resource");
        Assertions.assertThat(value.getResource()).isEqualTo("resource");
    }
}
