
package com.commercetools.api.models.extension;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionSetExpansionPathsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionSetExpansionPathsActionBuilder builder) {
        ExtensionSetExpansionPathsAction extensionSetExpansionPathsAction = builder.buildUnchecked();
        Assertions.assertThat(extensionSetExpansionPathsAction).isInstanceOf(ExtensionSetExpansionPathsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "expansionPaths", ExtensionSetExpansionPathsAction.builder()
                .expansionPaths(Collections.singletonList("expansionPaths")) } };
    }

    @Test
    public void expansionPaths() {
        ExtensionSetExpansionPathsAction value = ExtensionSetExpansionPathsAction.of();
        value.setExpansionPaths(Collections.singletonList("expansionPaths"));
        Assertions.assertThat(value.getExpansionPaths()).isEqualTo(Collections.singletonList("expansionPaths"));
    }
}
