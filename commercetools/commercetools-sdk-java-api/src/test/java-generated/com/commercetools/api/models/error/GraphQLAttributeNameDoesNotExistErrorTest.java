
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
public class GraphQLAttributeNameDoesNotExistErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLAttributeNameDoesNotExistErrorBuilder builder) {
        GraphQLAttributeNameDoesNotExistError graphQLAttributeNameDoesNotExistError = builder.buildUnchecked();
        Assertions.assertThat(graphQLAttributeNameDoesNotExistError)
                .isInstanceOf(GraphQLAttributeNameDoesNotExistError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                GraphQLAttributeNameDoesNotExistError.builder().invalidAttributeName("invalidAttributeName") } };
    }

    @Test
    public void invalidAttributeName() {
        GraphQLAttributeNameDoesNotExistError value = GraphQLAttributeNameDoesNotExistError.of();
        value.setInvalidAttributeName("invalidAttributeName");
        Assertions.assertThat(value.getInvalidAttributeName()).isEqualTo("invalidAttributeName");
    }
}
