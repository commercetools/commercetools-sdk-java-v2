
package com.commercetools.importapi.models.errors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ResourceUpdateErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ResourceUpdateErrorBuilder builder) {
        ResourceUpdateError resourceUpdateError = builder.buildUnchecked();
        Assertions.assertThat(resourceUpdateError).isInstanceOf(ResourceUpdateError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resource", ResourceUpdateError.builder().resource("resource") } };
    }

    @Test
    public void resource() {
        ResourceUpdateError value = ResourceUpdateError.of();
        value.setResource("resource");
        Assertions.assertThat(value.getResource()).isEqualTo("resource");
    }
}
