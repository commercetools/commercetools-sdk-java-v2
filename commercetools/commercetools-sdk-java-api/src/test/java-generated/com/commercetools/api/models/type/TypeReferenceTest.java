
package com.commercetools.api.models.type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TypeReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TypeReferenceBuilder builder) {
        TypeReference typeReference = builder.buildUnchecked();
        Assertions.assertThat(typeReference).isInstanceOf(TypeReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", TypeReference.builder().id("id") },
                new Object[] { "obj", TypeReference.builder().obj(new com.commercetools.api.models.type.TypeImpl()) } };
    }

    @Test
    public void id() {
        TypeReference value = TypeReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void obj() {
        TypeReference value = TypeReference.of();
        value.setObj(new com.commercetools.api.models.type.TypeImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.type.TypeImpl());
    }
}
