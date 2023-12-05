
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
public class GraphQLEnumKeyDoesNotExistErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLEnumKeyDoesNotExistErrorBuilder builder) {
        GraphQLEnumKeyDoesNotExistError graphQLEnumKeyDoesNotExistError = builder.buildUnchecked();
        Assertions.assertThat(graphQLEnumKeyDoesNotExistError).isInstanceOf(GraphQLEnumKeyDoesNotExistError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLEnumKeyDoesNotExistError.builder().conflictingEnumKey("conflictingEnumKey") },
                new Object[] { GraphQLEnumKeyDoesNotExistError.builder()
                        .conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void conflictingEnumKey() {
        GraphQLEnumKeyDoesNotExistError value = GraphQLEnumKeyDoesNotExistError.of();
        value.setConflictingEnumKey("conflictingEnumKey");
        Assertions.assertThat(value.getConflictingEnumKey()).isEqualTo("conflictingEnumKey");
    }

    @Test
    public void conflictingAttributeName() {
        GraphQLEnumKeyDoesNotExistError value = GraphQLEnumKeyDoesNotExistError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
