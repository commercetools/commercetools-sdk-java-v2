
package com.commercetools.history.models.graph_ql;

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
public class GraphQLErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLErrorBuilder builder) {
        GraphQLError graphQLError = builder.buildUnchecked();
        Assertions.assertThat(graphQLError).isInstanceOf(GraphQLError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLError.builder().message("message") },
                new Object[] { GraphQLError.builder()
                        .locations(Collections.singletonList(
                            new com.commercetools.history.models.graph_ql.GraphQLErrorLocationImpl())) },
                new Object[] { GraphQLError.builder().path(Collections.singletonList("path")) },
                new Object[] { GraphQLError.builder().extensions("extensions") } };
    }

    @Test
    public void message() {
        GraphQLError value = GraphQLError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void locations() {
        GraphQLError value = GraphQLError.of();
        value.setLocations(
            Collections.singletonList(new com.commercetools.history.models.graph_ql.GraphQLErrorLocationImpl()));
        Assertions.assertThat(value.getLocations())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.graph_ql.GraphQLErrorLocationImpl()));
    }

    @Test
    public void path() {
        GraphQLError value = GraphQLError.of();
        value.setPath(Collections.singletonList("path"));
        Assertions.assertThat(value.getPath()).isEqualTo(Collections.singletonList("path"));
    }

    @Test
    public void extensions() {
        GraphQLError value = GraphQLError.of();
        value.setExtensions("extensions");
        Assertions.assertThat(value.getExtensions()).isEqualTo("extensions");
    }
}
