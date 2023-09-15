
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
public class GraphQLDuplicateFieldWithConflictingResourceErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLDuplicateFieldWithConflictingResourceErrorBuilder builder) {
        GraphQLDuplicateFieldWithConflictingResourceError graphQLDuplicateFieldWithConflictingResourceError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLDuplicateFieldWithConflictingResourceError)
                .isInstanceOf(GraphQLDuplicateFieldWithConflictingResourceError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLDuplicateFieldWithConflictingResourceError.builder().field("field") },
                new Object[] {
                        GraphQLDuplicateFieldWithConflictingResourceError.builder().duplicateValue("duplicateValue") },
                new Object[] { GraphQLDuplicateFieldWithConflictingResourceError.builder()
                        .conflictingResource(new com.commercetools.api.models.common.ReferenceImpl()) } };
    }

    @Test
    public void field() {
        GraphQLDuplicateFieldWithConflictingResourceError value = GraphQLDuplicateFieldWithConflictingResourceError
                .of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void duplicateValue() {
        GraphQLDuplicateFieldWithConflictingResourceError value = GraphQLDuplicateFieldWithConflictingResourceError
                .of();
        value.setDuplicateValue("duplicateValue");
        Assertions.assertThat(value.getDuplicateValue()).isEqualTo("duplicateValue");
    }

    @Test
    public void conflictingResource() {
        GraphQLDuplicateFieldWithConflictingResourceError value = GraphQLDuplicateFieldWithConflictingResourceError
                .of();
        value.setConflictingResource(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getConflictingResource())
                .isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }
}
