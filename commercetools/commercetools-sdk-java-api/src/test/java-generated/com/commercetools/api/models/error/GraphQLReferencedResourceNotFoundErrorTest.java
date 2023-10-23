
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
public class GraphQLReferencedResourceNotFoundErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLReferencedResourceNotFoundErrorBuilder builder) {
        GraphQLReferencedResourceNotFoundError graphQLReferencedResourceNotFoundError = builder.buildUnchecked();
        Assertions.assertThat(graphQLReferencedResourceNotFoundError)
                .isInstanceOf(GraphQLReferencedResourceNotFoundError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLReferencedResourceNotFoundError.builder()
                        .typeId(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow")) },
                new Object[] { GraphQLReferencedResourceNotFoundError.builder().id("id") },
                new Object[] { GraphQLReferencedResourceNotFoundError.builder().key("key") } };
    }

    @Test
    public void typeId() {
        GraphQLReferencedResourceNotFoundError value = GraphQLReferencedResourceNotFoundError.of();
        value.setTypeId(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
        Assertions.assertThat(value.getTypeId())
                .isEqualTo(com.commercetools.api.models.common.ReferenceTypeId.findEnum("approval-flow"));
    }

    @Test
    public void id() {
        GraphQLReferencedResourceNotFoundError value = GraphQLReferencedResourceNotFoundError.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        GraphQLReferencedResourceNotFoundError value = GraphQLReferencedResourceNotFoundError.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
