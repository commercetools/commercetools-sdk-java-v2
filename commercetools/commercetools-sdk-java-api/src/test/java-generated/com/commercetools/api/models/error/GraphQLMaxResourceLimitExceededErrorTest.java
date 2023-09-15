
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
public class GraphQLMaxResourceLimitExceededErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLMaxResourceLimitExceededErrorBuilder builder) {
        GraphQLMaxResourceLimitExceededError graphQLMaxResourceLimitExceededError = builder.buildUnchecked();
        Assertions.assertThat(graphQLMaxResourceLimitExceededError)
                .isInstanceOf(GraphQLMaxResourceLimitExceededError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLMaxResourceLimitExceededError.builder()
                .exceededResource(com.commercetools.api.models.common.ReferenceTypeId.findEnum("associate-role")) } };
    }

    @Test
    public void exceededResource() {
        GraphQLMaxResourceLimitExceededError value = GraphQLMaxResourceLimitExceededError.of();
        value.setExceededResource(com.commercetools.api.models.common.ReferenceTypeId.findEnum("associate-role"));
        Assertions.assertThat(value.getExceededResource())
                .isEqualTo(com.commercetools.api.models.common.ReferenceTypeId.findEnum("associate-role"));
    }
}
