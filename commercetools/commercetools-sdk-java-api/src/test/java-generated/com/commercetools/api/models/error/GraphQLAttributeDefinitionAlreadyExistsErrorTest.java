
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
public class GraphQLAttributeDefinitionAlreadyExistsErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLAttributeDefinitionAlreadyExistsErrorBuilder builder) {
        GraphQLAttributeDefinitionAlreadyExistsError graphQLAttributeDefinitionAlreadyExistsError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLAttributeDefinitionAlreadyExistsError)
                .isInstanceOf(GraphQLAttributeDefinitionAlreadyExistsError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLAttributeDefinitionAlreadyExistsError.builder()
                        .conflictingProductTypeId("conflictingProductTypeId") },
                new Object[] { GraphQLAttributeDefinitionAlreadyExistsError.builder()
                        .conflictingProductTypeName("conflictingProductTypeName") },
                new Object[] { GraphQLAttributeDefinitionAlreadyExistsError.builder()
                        .conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void conflictingProductTypeId() {
        GraphQLAttributeDefinitionAlreadyExistsError value = GraphQLAttributeDefinitionAlreadyExistsError.of();
        value.setConflictingProductTypeId("conflictingProductTypeId");
        Assertions.assertThat(value.getConflictingProductTypeId()).isEqualTo("conflictingProductTypeId");
    }

    @Test
    public void conflictingProductTypeName() {
        GraphQLAttributeDefinitionAlreadyExistsError value = GraphQLAttributeDefinitionAlreadyExistsError.of();
        value.setConflictingProductTypeName("conflictingProductTypeName");
        Assertions.assertThat(value.getConflictingProductTypeName()).isEqualTo("conflictingProductTypeName");
    }

    @Test
    public void conflictingAttributeName() {
        GraphQLAttributeDefinitionAlreadyExistsError value = GraphQLAttributeDefinitionAlreadyExistsError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
