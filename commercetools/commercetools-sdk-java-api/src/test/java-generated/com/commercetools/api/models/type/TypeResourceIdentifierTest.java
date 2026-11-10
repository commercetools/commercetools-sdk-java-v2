
package com.commercetools.api.models.type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeResourceIdentifierBuilder builder) {
        TypeResourceIdentifier typeResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(typeResourceIdentifier).isInstanceOf(TypeResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", TypeResourceIdentifier.builder().id("id") },
                new Object[] { "key", TypeResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        TypeResourceIdentifier value = TypeResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        TypeResourceIdentifier value = TypeResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
