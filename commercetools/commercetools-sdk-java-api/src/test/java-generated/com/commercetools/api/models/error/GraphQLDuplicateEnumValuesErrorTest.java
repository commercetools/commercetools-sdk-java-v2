
package com.commercetools.api.models.error;

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
public class GraphQLDuplicateEnumValuesErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLDuplicateEnumValuesErrorBuilder builder) {
        GraphQLDuplicateEnumValuesError graphQLDuplicateEnumValuesError = builder.buildUnchecked();
        Assertions.assertThat(graphQLDuplicateEnumValuesError).isInstanceOf(GraphQLDuplicateEnumValuesError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                GraphQLDuplicateEnumValuesError.builder().duplicates(Collections.singletonList("duplicates")) } };
    }

    @Test
    public void duplicates() {
        GraphQLDuplicateEnumValuesError value = GraphQLDuplicateEnumValuesError.of();
        value.setDuplicates(Collections.singletonList("duplicates"));
        Assertions.assertThat(value.getDuplicates()).isEqualTo(Collections.singletonList("duplicates"));
    }
}
