
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLExtensionBadResponseErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLExtensionBadResponseErrorBuilder builder) {
        GraphQLExtensionBadResponseError graphQLExtensionBadResponseError = builder.buildUnchecked();
        Assertions.assertThat(graphQLExtensionBadResponseError).isInstanceOf(GraphQLExtensionBadResponseError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "localizedMessage",
                        GraphQLExtensionBadResponseError.builder()
                                .localizedMessage(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "extensionExtraInfo",
                        GraphQLExtensionBadResponseError.builder().extensionExtraInfo("extensionExtraInfo") },
                new Object[] { "extensionErrors",
                        GraphQLExtensionBadResponseError.builder()
                                .extensionErrors(Collections
                                        .singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl())) },
                new Object[] { "extensionBody",
                        GraphQLExtensionBadResponseError.builder().extensionBody("extensionBody") },
                new Object[] { "extensionStatusCode",
                        GraphQLExtensionBadResponseError.builder().extensionStatusCode(3) },
                new Object[] { "extensionId", GraphQLExtensionBadResponseError.builder().extensionId("extensionId") },
                new Object[] { "extensionKey",
                        GraphQLExtensionBadResponseError.builder().extensionKey("extensionKey") } };
    }

    @Test
    public void localizedMessage() {
        GraphQLExtensionBadResponseError value = GraphQLExtensionBadResponseError.of();
        value.setLocalizedMessage(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLocalizedMessage())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void extensionExtraInfo() {
        GraphQLExtensionBadResponseError value = GraphQLExtensionBadResponseError.of();
        value.setExtensionExtraInfo("extensionExtraInfo");
        Assertions.assertThat(value.getExtensionExtraInfo()).isEqualTo("extensionExtraInfo");
    }

    @Test
    public void extensionErrors() {
        GraphQLExtensionBadResponseError value = GraphQLExtensionBadResponseError.of();
        value.setExtensionErrors(
            Collections.singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl()));
        Assertions.assertThat(value.getExtensionErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl()));
    }

    @Test
    public void extensionBody() {
        GraphQLExtensionBadResponseError value = GraphQLExtensionBadResponseError.of();
        value.setExtensionBody("extensionBody");
        Assertions.assertThat(value.getExtensionBody()).isEqualTo("extensionBody");
    }

    @Test
    public void extensionStatusCode() {
        GraphQLExtensionBadResponseError value = GraphQLExtensionBadResponseError.of();
        value.setExtensionStatusCode(3);
        Assertions.assertThat(value.getExtensionStatusCode()).isEqualTo(3);
    }

    @Test
    public void extensionId() {
        GraphQLExtensionBadResponseError value = GraphQLExtensionBadResponseError.of();
        value.setExtensionId("extensionId");
        Assertions.assertThat(value.getExtensionId()).isEqualTo("extensionId");
    }

    @Test
    public void extensionKey() {
        GraphQLExtensionBadResponseError value = GraphQLExtensionBadResponseError.of();
        value.setExtensionKey("extensionKey");
        Assertions.assertThat(value.getExtensionKey()).isEqualTo("extensionKey");
    }
}
