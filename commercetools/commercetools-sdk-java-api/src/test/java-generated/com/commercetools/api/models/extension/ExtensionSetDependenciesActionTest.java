
package com.commercetools.api.models.extension;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionSetDependenciesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionSetDependenciesActionBuilder builder) {
        ExtensionSetDependenciesAction extensionSetDependenciesAction = builder.buildUnchecked();
        Assertions.assertThat(extensionSetDependenciesAction).isInstanceOf(ExtensionSetDependenciesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "dependencies",
                ExtensionSetDependenciesAction.builder()
                        .dependencies(Collections.singletonList(
                            new com.commercetools.api.models.extension.ExtensionResourceIdentifierImpl())) } };
    }

    @Test
    public void dependencies() {
        ExtensionSetDependenciesAction value = ExtensionSetDependenciesAction.of();
        value.setDependencies(
            Collections.singletonList(new com.commercetools.api.models.extension.ExtensionResourceIdentifierImpl()));
        Assertions.assertThat(value.getDependencies())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.extension.ExtensionResourceIdentifierImpl()));
    }
}
