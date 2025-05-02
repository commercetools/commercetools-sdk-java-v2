
package com.commercetools.importapi.models.errors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ResourceNotFoundErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ResourceNotFoundErrorBuilder builder) {
        ResourceNotFoundError resourceNotFoundError = builder.buildUnchecked();
        Assertions.assertThat(resourceNotFoundError).isInstanceOf(ResourceNotFoundError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resource", ResourceNotFoundError.builder().resource("resource") } };
    }

    @Test
    public void resource() {
        ResourceNotFoundError value = ResourceNotFoundError.of();
        value.setResource("resource");
        Assertions.assertThat(value.getResource()).isEqualTo("resource");
    }
}
