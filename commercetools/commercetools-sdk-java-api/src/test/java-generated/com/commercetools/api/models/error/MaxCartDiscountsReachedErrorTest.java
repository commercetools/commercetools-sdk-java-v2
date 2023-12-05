
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
public class MaxCartDiscountsReachedErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MaxCartDiscountsReachedErrorBuilder builder) {
        MaxCartDiscountsReachedError maxCartDiscountsReachedError = builder.buildUnchecked();
        Assertions.assertThat(maxCartDiscountsReachedError).isInstanceOf(MaxCartDiscountsReachedError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MaxCartDiscountsReachedError.builder().message("message") } };
    }

    @Test
    public void message() {
        MaxCartDiscountsReachedError value = MaxCartDiscountsReachedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
