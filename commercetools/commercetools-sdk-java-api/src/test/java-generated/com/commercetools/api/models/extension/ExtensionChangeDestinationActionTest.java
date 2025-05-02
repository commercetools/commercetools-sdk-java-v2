
package com.commercetools.api.models.extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionChangeDestinationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionChangeDestinationActionBuilder builder) {
        ExtensionChangeDestinationAction extensionChangeDestinationAction = builder.buildUnchecked();
        Assertions.assertThat(extensionChangeDestinationAction).isInstanceOf(ExtensionChangeDestinationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "destination", ExtensionChangeDestinationAction.builder()
                .destination(new com.commercetools.api.models.extension.ExtensionDestinationImpl()) } };
    }

    @Test
    public void destination() {
        ExtensionChangeDestinationAction value = ExtensionChangeDestinationAction.of();
        value.setDestination(new com.commercetools.api.models.extension.ExtensionDestinationImpl());
        Assertions.assertThat(value.getDestination())
                .isEqualTo(new com.commercetools.api.models.extension.ExtensionDestinationImpl());
    }
}
