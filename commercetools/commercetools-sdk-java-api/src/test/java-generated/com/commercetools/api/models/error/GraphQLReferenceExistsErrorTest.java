
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
public class GraphQLReferenceExistsErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLReferenceExistsErrorBuilder builder) {
        GraphQLReferenceExistsError graphQLReferenceExistsError = builder.buildUnchecked();
        Assertions.assertThat(graphQLReferenceExistsError).isInstanceOf(GraphQLReferenceExistsError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLReferenceExistsError.builder()
                .referencedBy(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow")) } };
    }

    @Test
    public void referencedBy() {
        GraphQLReferenceExistsError value = GraphQLReferenceExistsError.of();
        value.setReferencedBy(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
        Assertions.assertThat(value.getReferencedBy())
                .isEqualTo(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
    }
}
