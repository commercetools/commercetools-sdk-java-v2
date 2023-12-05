
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
public class GraphQLAttributeDefinitionTypeConflictErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLAttributeDefinitionTypeConflictErrorBuilder builder) {
        GraphQLAttributeDefinitionTypeConflictError graphQLAttributeDefinitionTypeConflictError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLAttributeDefinitionTypeConflictError)
                .isInstanceOf(GraphQLAttributeDefinitionTypeConflictError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLAttributeDefinitionTypeConflictError.builder()
                        .conflictingProductTypeId("conflictingProductTypeId") },
                new Object[] { GraphQLAttributeDefinitionTypeConflictError.builder()
                        .conflictingProductTypeName("conflictingProductTypeName") },
                new Object[] { GraphQLAttributeDefinitionTypeConflictError.builder()
                        .conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void conflictingProductTypeId() {
        GraphQLAttributeDefinitionTypeConflictError value = GraphQLAttributeDefinitionTypeConflictError.of();
        value.setConflictingProductTypeId("conflictingProductTypeId");
        Assertions.assertThat(value.getConflictingProductTypeId()).isEqualTo("conflictingProductTypeId");
    }

    @Test
    public void conflictingProductTypeName() {
        GraphQLAttributeDefinitionTypeConflictError value = GraphQLAttributeDefinitionTypeConflictError.of();
        value.setConflictingProductTypeName("conflictingProductTypeName");
        Assertions.assertThat(value.getConflictingProductTypeName()).isEqualTo("conflictingProductTypeName");
    }

    @Test
    public void conflictingAttributeName() {
        GraphQLAttributeDefinitionTypeConflictError value = GraphQLAttributeDefinitionTypeConflictError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
