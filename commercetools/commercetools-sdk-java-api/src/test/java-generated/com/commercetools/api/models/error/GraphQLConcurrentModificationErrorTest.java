
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
public class GraphQLConcurrentModificationErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLConcurrentModificationErrorBuilder builder) {
        GraphQLConcurrentModificationError graphQLConcurrentModificationError = builder.buildUnchecked();
        Assertions.assertThat(graphQLConcurrentModificationError)
                .isInstanceOf(GraphQLConcurrentModificationError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GraphQLConcurrentModificationError.builder().currentVersion(4L) } };
    }

    @Test
    public void currentVersion() {
        GraphQLConcurrentModificationError value = GraphQLConcurrentModificationError.of();
        value.setCurrentVersion(4L);
        Assertions.assertThat(value.getCurrentVersion()).isEqualTo(4L);
    }
}
