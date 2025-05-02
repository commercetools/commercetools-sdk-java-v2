
package com.commercetools.api.models.extension;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionUpdateBuilder builder) {
        ExtensionUpdate extensionUpdate = builder.buildUnchecked();
        Assertions.assertThat(extensionUpdate).isInstanceOf(ExtensionUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ExtensionUpdate.builder().version(2L) },
                new Object[] { "actions",
                        ExtensionUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.extension.ExtensionUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ExtensionUpdate value = ExtensionUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ExtensionUpdate value = ExtensionUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.extension.ExtensionUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.extension.ExtensionUpdateActionImpl()));
    }
}
