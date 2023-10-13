
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
public class GraphQLEditPreviewFailedErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLEditPreviewFailedErrorBuilder builder) {
        GraphQLEditPreviewFailedError graphQLEditPreviewFailedError = builder.buildUnchecked();
        Assertions.assertThat(graphQLEditPreviewFailedError).isInstanceOf(GraphQLEditPreviewFailedError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLEditPreviewFailedError.builder()
                .result(new com.commercetools.api.models.order_edit.OrderEditPreviewFailureImpl()) } };
    }

    @Test
    public void result() {
        GraphQLEditPreviewFailedError value = GraphQLEditPreviewFailedError.of();
        value.setResult(new com.commercetools.api.models.order_edit.OrderEditPreviewFailureImpl());
        Assertions.assertThat(value.getResult())
                .isEqualTo(new com.commercetools.api.models.order_edit.OrderEditPreviewFailureImpl());
    }
}
