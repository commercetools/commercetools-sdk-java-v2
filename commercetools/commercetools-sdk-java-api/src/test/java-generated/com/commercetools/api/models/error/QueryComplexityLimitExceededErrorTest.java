
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
public class QueryComplexityLimitExceededErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QueryComplexityLimitExceededErrorBuilder builder) {
        QueryComplexityLimitExceededError queryComplexityLimitExceededError = builder.buildUnchecked();
        Assertions.assertThat(queryComplexityLimitExceededError).isInstanceOf(QueryComplexityLimitExceededError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { QueryComplexityLimitExceededError.builder().message("message") } };
    }

    @Test
    public void message() {
        QueryComplexityLimitExceededError value = QueryComplexityLimitExceededError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
