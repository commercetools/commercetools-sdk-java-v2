
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
public class GraphQLEnumKeyAlreadyExistsErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLEnumKeyAlreadyExistsErrorBuilder builder) {
        GraphQLEnumKeyAlreadyExistsError graphQLEnumKeyAlreadyExistsError = builder.buildUnchecked();
        Assertions.assertThat(graphQLEnumKeyAlreadyExistsError).isInstanceOf(GraphQLEnumKeyAlreadyExistsError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLEnumKeyAlreadyExistsError.builder().conflictingEnumKey("conflictingEnumKey") },
                new Object[] { GraphQLEnumKeyAlreadyExistsError.builder()
                        .conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void conflictingEnumKey() {
        GraphQLEnumKeyAlreadyExistsError value = GraphQLEnumKeyAlreadyExistsError.of();
        value.setConflictingEnumKey("conflictingEnumKey");
        Assertions.assertThat(value.getConflictingEnumKey()).isEqualTo("conflictingEnumKey");
    }

    @Test
    public void conflictingAttributeName() {
        GraphQLEnumKeyAlreadyExistsError value = GraphQLEnumKeyAlreadyExistsError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
