
package com.commercetools.api.models.extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionSetAdditionalContextActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionSetAdditionalContextActionBuilder builder) {
        ExtensionSetAdditionalContextAction extensionSetAdditionalContextAction = builder.buildUnchecked();
        Assertions.assertThat(extensionSetAdditionalContextAction)
                .isInstanceOf(ExtensionSetAdditionalContextAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "additionalContext",
                ExtensionSetAdditionalContextAction.builder()
                        .additionalContext(
                            new com.commercetools.api.models.extension.ExtensionAdditionalContextDraftImpl()) } };
    }

    @Test
    public void additionalContext() {
        ExtensionSetAdditionalContextAction value = ExtensionSetAdditionalContextAction.of();
        value.setAdditionalContext(new com.commercetools.api.models.extension.ExtensionAdditionalContextDraftImpl());
        Assertions.assertThat(value.getAdditionalContext())
                .isEqualTo(new com.commercetools.api.models.extension.ExtensionAdditionalContextDraftImpl());
    }
}
