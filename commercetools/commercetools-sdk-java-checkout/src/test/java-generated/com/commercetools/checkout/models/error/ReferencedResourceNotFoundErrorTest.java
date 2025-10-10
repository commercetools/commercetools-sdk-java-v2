
package com.commercetools.checkout.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReferencedResourceNotFoundErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReferencedResourceNotFoundErrorBuilder builder) {
        ReferencedResourceNotFoundError referencedResourceNotFoundError = builder.buildUnchecked();
        Assertions.assertThat(referencedResourceNotFoundError).isInstanceOf(ReferencedResourceNotFoundError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", ReferencedResourceNotFoundError.builder().message("message") },
                new Object[] { "typeId", ReferencedResourceNotFoundError.builder().typeId("typeId") },
                new Object[] { "id", ReferencedResourceNotFoundError.builder().id("id") },
                new Object[] { "key", ReferencedResourceNotFoundError.builder().key("key") } };
    }

    @Test
    public void message() {
        ReferencedResourceNotFoundError value = ReferencedResourceNotFoundError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void typeId() {
        ReferencedResourceNotFoundError value = ReferencedResourceNotFoundError.of();
        value.setTypeId("typeId");
        Assertions.assertThat(value.getTypeId()).isEqualTo("typeId");
    }

    @Test
    public void id() {
        ReferencedResourceNotFoundError value = ReferencedResourceNotFoundError.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ReferencedResourceNotFoundError value = ReferencedResourceNotFoundError.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
