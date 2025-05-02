
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionUpdateActionsFailedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionUpdateActionsFailedErrorBuilder builder) {
        ExtensionUpdateActionsFailedError extensionUpdateActionsFailedError = builder.buildUnchecked();
        Assertions.assertThat(extensionUpdateActionsFailedError).isInstanceOf(ExtensionUpdateActionsFailedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", ExtensionUpdateActionsFailedError.builder().message("message") },
                new Object[] { "localizedMessage",
                        ExtensionUpdateActionsFailedError.builder()
                                .localizedMessage(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "extensionExtraInfo",
                        ExtensionUpdateActionsFailedError.builder().extensionExtraInfo("extensionExtraInfo") },
                new Object[] { "extensionErrors", ExtensionUpdateActionsFailedError.builder()
                        .extensionErrors(
                            Collections.singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl())) } };
    }

    @Test
    public void message() {
        ExtensionUpdateActionsFailedError value = ExtensionUpdateActionsFailedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void localizedMessage() {
        ExtensionUpdateActionsFailedError value = ExtensionUpdateActionsFailedError.of();
        value.setLocalizedMessage(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLocalizedMessage())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void extensionExtraInfo() {
        ExtensionUpdateActionsFailedError value = ExtensionUpdateActionsFailedError.of();
        value.setExtensionExtraInfo("extensionExtraInfo");
        Assertions.assertThat(value.getExtensionExtraInfo()).isEqualTo("extensionExtraInfo");
    }

    @Test
    public void extensionErrors() {
        ExtensionUpdateActionsFailedError value = ExtensionUpdateActionsFailedError.of();
        value.setExtensionErrors(
            Collections.singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl()));
        Assertions.assertThat(value.getExtensionErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl()));
    }
}
