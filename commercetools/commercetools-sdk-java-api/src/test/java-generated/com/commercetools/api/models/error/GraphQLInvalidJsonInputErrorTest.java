
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
public class GraphQLInvalidJsonInputErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLInvalidJsonInputErrorBuilder builder) {
        GraphQLInvalidJsonInputError graphQLInvalidJsonInputError = builder.buildUnchecked();
        Assertions.assertThat(graphQLInvalidJsonInputError).isInstanceOf(GraphQLInvalidJsonInputError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLInvalidJsonInputError.builder().detailedErrorMessage("detailedErrorMessage") } };
    }

    @Test
    public void detailedErrorMessage() {
        GraphQLInvalidJsonInputError value = GraphQLInvalidJsonInputError.of();
        value.setDetailedErrorMessage("detailedErrorMessage");
        Assertions.assertThat(value.getDetailedErrorMessage()).isEqualTo("detailedErrorMessage");
    }
}
