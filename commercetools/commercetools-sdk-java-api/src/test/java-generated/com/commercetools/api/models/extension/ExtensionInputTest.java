
package com.commercetools.api.models.extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionInputTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionInputBuilder builder) {
        ExtensionInput extensionInput = builder.buildUnchecked();
        Assertions.assertThat(extensionInput).isInstanceOf(ExtensionInput.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "action",
                        ExtensionInput.builder()
                                .action(com.commercetools.api.models.extension.ExtensionAction.findEnum("Create")) },
                new Object[] { "resource",
                        ExtensionInput.builder().resource(new com.commercetools.api.models.common.ReferenceImpl()) } };
    }

    @Test
    public void action() {
        ExtensionInput value = ExtensionInput.of();
        value.setAction(com.commercetools.api.models.extension.ExtensionAction.findEnum("Create"));
        Assertions.assertThat(value.getAction())
                .isEqualTo(com.commercetools.api.models.extension.ExtensionAction.findEnum("Create"));
    }

    @Test
    public void resource() {
        ExtensionInput value = ExtensionInput.of();
        value.setResource(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getResource()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }
}
