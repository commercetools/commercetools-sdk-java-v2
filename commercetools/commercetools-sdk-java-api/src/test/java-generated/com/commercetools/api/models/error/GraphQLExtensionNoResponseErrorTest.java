
package com.commercetools.api.models.error;

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
public class GraphQLExtensionNoResponseErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLExtensionNoResponseErrorBuilder builder) {
        GraphQLExtensionNoResponseError graphQLExtensionNoResponseError = builder.buildUnchecked();
        Assertions.assertThat(graphQLExtensionNoResponseError).isInstanceOf(GraphQLExtensionNoResponseError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLExtensionNoResponseError.builder().extensionId("extensionId") },
                new Object[] { GraphQLExtensionNoResponseError.builder().extensionKey("extensionKey") } };
    }

    @Test
    public void extensionId() {
        GraphQLExtensionNoResponseError value = GraphQLExtensionNoResponseError.of();
        value.setExtensionId("extensionId");
        Assertions.assertThat(value.getExtensionId()).isEqualTo("extensionId");
    }

    @Test
    public void extensionKey() {
        GraphQLExtensionNoResponseError value = GraphQLExtensionNoResponseError.of();
        value.setExtensionKey("extensionKey");
        Assertions.assertThat(value.getExtensionKey()).isEqualTo("extensionKey");
    }
}
