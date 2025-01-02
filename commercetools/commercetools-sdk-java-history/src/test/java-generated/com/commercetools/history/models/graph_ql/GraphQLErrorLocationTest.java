
package com.commercetools.history.models.graph_ql;

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
public class GraphQLErrorLocationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLErrorLocationBuilder builder) {
        GraphQLErrorLocation graphQLErrorLocation = builder.buildUnchecked();
        Assertions.assertThat(graphQLErrorLocation).isInstanceOf(GraphQLErrorLocation.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLErrorLocation.builder().line(6L) },
                new Object[] { GraphQLErrorLocation.builder().column(2L) } };
    }

    @Test
    public void line() {
        GraphQLErrorLocation value = GraphQLErrorLocation.of();
        value.setLine(6L);
        Assertions.assertThat(value.getLine()).isEqualTo(6L);
    }

    @Test
    public void column() {
        GraphQLErrorLocation value = GraphQLErrorLocation.of();
        value.setColumn(2L);
        Assertions.assertThat(value.getColumn()).isEqualTo(2L);
    }
}
