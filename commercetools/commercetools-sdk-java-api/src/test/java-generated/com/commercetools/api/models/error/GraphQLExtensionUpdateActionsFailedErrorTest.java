
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
public class GraphQLExtensionUpdateActionsFailedErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLExtensionUpdateActionsFailedErrorBuilder builder) {
        GraphQLExtensionUpdateActionsFailedError graphQLExtensionUpdateActionsFailedError = builder.buildUnchecked();
        Assertions.assertThat(graphQLExtensionUpdateActionsFailedError)
                .isInstanceOf(GraphQLExtensionUpdateActionsFailedError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLExtensionUpdateActionsFailedError.builder()
                        .localizedMessage(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] {
                        GraphQLExtensionUpdateActionsFailedError.builder().extensionExtraInfo("extensionExtraInfo") },
                new Object[] { GraphQLExtensionUpdateActionsFailedError.builder()
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
