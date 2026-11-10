
package com.commercetools.importapi.models.errors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ResourceCreationErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ResourceCreationErrorBuilder builder) {
        ResourceCreationError resourceCreationError = builder.buildUnchecked();
        Assertions.assertThat(resourceCreationError).isInstanceOf(ResourceCreationError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resource", ResourceCreationError.builder().resource("resource") } };
    }

    @Test
    public void resource() {
        ResourceCreationError value = ResourceCreationError.of();
        value.setResource("resource");
        Assertions.assertThat(value.getResource()).isEqualTo("resource");
    }
}
