
package com.commercetools.api.models.extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionReferenceBuilder builder) {
        ExtensionReference extensionReference = builder.buildUnchecked();
        Assertions.assertThat(extensionReference).isInstanceOf(ExtensionReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ExtensionReference.builder().id("id") }, new Object[] { "obj",
                ExtensionReference.builder().obj(new com.commercetools.api.models.extension.ExtensionImpl()) } };
    }

    @Test
    public void id() {
        ExtensionReference value = ExtensionReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void obj() {
        ExtensionReference value = ExtensionReference.of();
        value.setObj(new com.commercetools.api.models.extension.ExtensionImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.extension.ExtensionImpl());
    }
}
