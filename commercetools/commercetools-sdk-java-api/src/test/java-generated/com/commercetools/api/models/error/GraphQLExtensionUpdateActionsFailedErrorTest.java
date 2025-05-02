
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLExtensionUpdateActionsFailedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLExtensionUpdateActionsFailedErrorBuilder builder) {
        GraphQLExtensionUpdateActionsFailedError graphQLExtensionUpdateActionsFailedError = builder.buildUnchecked();
        Assertions.assertThat(graphQLExtensionUpdateActionsFailedError)
                .isInstanceOf(GraphQLExtensionUpdateActionsFailedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "localizedMessage",
                        GraphQLExtensionUpdateActionsFailedError.builder()
                                .localizedMessage(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "extensionExtraInfo",
                        GraphQLExtensionUpdateActionsFailedError.builder().extensionExtraInfo("extensionExtraInfo") },
                new Object[] { "extensionErrors", GraphQLExtensionUpdateActionsFailedError.builder()
                        .extensionErrors(
                            Collections.singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl())) } };
    }

    @Test
    public void localizedMessage() {
        GraphQLExtensionUpdateActionsFailedError value = GraphQLExtensionUpdateActionsFailedError.of();
        value.setLocalizedMessage(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLocalizedMessage())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void extensionExtraInfo() {
        GraphQLExtensionUpdateActionsFailedError value = GraphQLExtensionUpdateActionsFailedError.of();
        value.setExtensionExtraInfo("extensionExtraInfo");
        Assertions.assertThat(value.getExtensionExtraInfo()).isEqualTo("extensionExtraInfo");
    }

    @Test
    public void extensionErrors() {
        GraphQLExtensionUpdateActionsFailedError value = GraphQLExtensionUpdateActionsFailedError.of();
        value.setExtensionErrors(
            Collections.singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl()));
        Assertions.assertThat(value.getExtensionErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl()));
    }
}
