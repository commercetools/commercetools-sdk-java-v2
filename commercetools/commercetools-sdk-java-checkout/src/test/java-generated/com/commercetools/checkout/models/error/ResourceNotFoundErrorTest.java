
package com.commercetools.checkout.models.error;

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
        return new Object[][] { new Object[] { "message", ResourceNotFoundError.builder().message("message") },
                new Object[] { "resourceIdentifier",
                        ResourceNotFoundError.builder().resourceIdentifier("resourceIdentifier") },
                new Object[] { "resourceId", ResourceNotFoundError.builder().resourceId("resourceId") } };
    }

    @Test
    public void message() {
        ResourceNotFoundError value = ResourceNotFoundError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void resourceIdentifier() {
        ResourceNotFoundError value = ResourceNotFoundError.of();
        value.setResourceIdentifier("resourceIdentifier");
        Assertions.assertThat(value.getResourceIdentifier()).isEqualTo("resourceIdentifier");
    }

    @Test
    public void resourceId() {
        ResourceNotFoundError value = ResourceNotFoundError.of();
        value.setResourceId("resourceId");
        Assertions.assertThat(value.getResourceId()).isEqualTo("resourceId");
    }
}
