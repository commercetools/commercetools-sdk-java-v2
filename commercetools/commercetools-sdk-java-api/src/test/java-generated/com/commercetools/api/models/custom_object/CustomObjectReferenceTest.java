
package com.commercetools.api.models.custom_object;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomObjectReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomObjectReferenceBuilder builder) {
        CustomObjectReference customObjectReference = builder.buildUnchecked();
        Assertions.assertThat(customObjectReference).isInstanceOf(CustomObjectReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        CustomObjectReference.builder()
                                .obj(new com.commercetools.api.models.custom_object.CustomObjectImpl()) },
                new Object[] { "id", CustomObjectReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        CustomObjectReference value = CustomObjectReference.of();
        value.setObj(new com.commercetools.api.models.custom_object.CustomObjectImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.custom_object.CustomObjectImpl());
    }

    @Test
    public void id() {
        CustomObjectReference value = CustomObjectReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
