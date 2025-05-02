
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionBadResponseErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionBadResponseErrorBuilder builder) {
        ExtensionBadResponseError extensionBadResponseError = builder.buildUnchecked();
        Assertions.assertThat(extensionBadResponseError).isInstanceOf(ExtensionBadResponseError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", ExtensionBadResponseError.builder().message("message") },
                new Object[] { "localizedMessage",
                        ExtensionBadResponseError.builder()
                                .localizedMessage(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "extensionExtraInfo",
                        ExtensionBadResponseError.builder().extensionExtraInfo("extensionExtraInfo") },
                new Object[] { "extensionErrors",
                        ExtensionBadResponseError.builder()
                                .extensionErrors(Collections
                                        .singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl())) },
                new Object[] { "extensionBody", ExtensionBadResponseError.builder().extensionBody("extensionBody") },
                new Object[] { "extensionStatusCode", ExtensionBadResponseError.builder().extensionStatusCode(3) },
                new Object[] { "extensionId", ExtensionBadResponseError.builder().extensionId("extensionId") },
                new Object[] { "extensionKey", ExtensionBadResponseError.builder().extensionKey("extensionKey") } };
    }

    @Test
    public void message() {
        ExtensionBadResponseError value = ExtensionBadResponseError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void localizedMessage() {
        ExtensionBadResponseError value = ExtensionBadResponseError.of();
        value.setLocalizedMessage(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLocalizedMessage())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void extensionExtraInfo() {
        ExtensionBadResponseError value = ExtensionBadResponseError.of();
        value.setExtensionExtraInfo("extensionExtraInfo");
        Assertions.assertThat(value.getExtensionExtraInfo()).isEqualTo("extensionExtraInfo");
    }

    @Test
    public void extensionErrors() {
        ExtensionBadResponseError value = ExtensionBadResponseError.of();
        value.setExtensionErrors(
            Collections.singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl()));
        Assertions.assertThat(value.getExtensionErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl()));
    }

    @Test
    public void extensionBody() {
        ExtensionBadResponseError value = ExtensionBadResponseError.of();
        value.setExtensionBody("extensionBody");
        Assertions.assertThat(value.getExtensionBody()).isEqualTo("extensionBody");
    }

    @Test
    public void extensionStatusCode() {
        ExtensionBadResponseError value = ExtensionBadResponseError.of();
        value.setExtensionStatusCode(3);
        Assertions.assertThat(value.getExtensionStatusCode()).isEqualTo(3);
    }

    @Test
    public void extensionId() {
        ExtensionBadResponseError value = ExtensionBadResponseError.of();
        value.setExtensionId("extensionId");
        Assertions.assertThat(value.getExtensionId()).isEqualTo("extensionId");
    }

    @Test
    public void extensionKey() {
        ExtensionBadResponseError value = ExtensionBadResponseError.of();
        value.setExtensionKey("extensionKey");
        Assertions.assertThat(value.getExtensionKey()).isEqualTo("extensionKey");
    }
}
