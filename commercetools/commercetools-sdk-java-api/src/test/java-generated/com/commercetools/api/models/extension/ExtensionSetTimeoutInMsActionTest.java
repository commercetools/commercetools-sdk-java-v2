
package com.commercetools.api.models.extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionSetTimeoutInMsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionSetTimeoutInMsActionBuilder builder) {
        ExtensionSetTimeoutInMsAction extensionSetTimeoutInMsAction = builder.buildUnchecked();
        Assertions.assertThat(extensionSetTimeoutInMsAction).isInstanceOf(ExtensionSetTimeoutInMsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "timeoutInMs", ExtensionSetTimeoutInMsAction.builder().timeoutInMs(6) } };
    }

    @Test
    public void timeoutInMs() {
        ExtensionSetTimeoutInMsAction value = ExtensionSetTimeoutInMsAction.of();
        value.setTimeoutInMs(6);
        Assertions.assertThat(value.getTimeoutInMs()).isEqualTo(6);
    }
}
