
package com.commercetools.api.models.error;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class GraphQLExtensionBadResponseErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLExtensionBadResponseErrorBuilder builder) {
        GraphQLExtensionBadResponseError graphQLExtensionBadResponseError = builder.buildUnchecked();
        Assertions.assertThat(graphQLExtensionBadResponseError).isInstanceOf(GraphQLExtensionBadResponseError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLExtensionBadResponseError.builder()
                        .localizedMessage(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { GraphQLExtensionBadResponseError.builder().extensionExtraInfo("extensionExtraInfo") },
                new Object[] {
                        GraphQLExtensionBadResponseError.builder()
                                .extensionErrors(Collections
                                        .singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl())) },
                new Object[] { GraphQLExtensionBadResponseError.builder().extensionBody("extensionBody") },
                new Object[] { GraphQLExtensionBadResponseError.builder().extensionStatusCode(3) },
                new Object[] { GraphQLExtensionBadResponseError.builder().extensionId("extensionId") },
                new Object[] { GraphQLExtensionBadResponseError.builder().extensionKey("extensionKey") } };
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
