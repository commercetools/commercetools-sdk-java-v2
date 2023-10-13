
package com.commercetools.api.models.graph_ql;

import java.util.Collections;

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
public class GraphQLResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLResponseBuilder builder) {
        GraphQLResponse graphQLResponse = builder.buildUnchecked();
        Assertions.assertThat(graphQLResponse).isInstanceOf(GraphQLResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLResponse.builder().data("data") }, new Object[] { GraphQLResponse
                .builder()
                .errors(Collections.singletonList(new com.commercetools.api.models.graph_ql.GraphQLErrorImpl())) } };
    }

    @Test
    public void data() {
        GraphQLResponse value = GraphQLResponse.of();
        value.setData("data");
        Assertions.assertThat(value.getData()).isEqualTo("data");
    }

    @Test
    public void errors() {
        GraphQLResponse value = GraphQLResponse.of();
        value.setErrors(Collections.singletonList(new com.commercetools.api.models.graph_ql.GraphQLErrorImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.graph_ql.GraphQLErrorImpl()));
    }
}
