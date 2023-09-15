
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
public class InvalidJsonInputErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InvalidJsonInputErrorBuilder builder) {
        InvalidJsonInputError invalidJsonInputError = builder.buildUnchecked();
        Assertions.assertThat(invalidJsonInputError).isInstanceOf(InvalidJsonInputError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InvalidJsonInputError.builder().message("message") },
                new Object[] { InvalidJsonInputError.builder().detailedErrorMessage("detailedErrorMessage") } };
    }

    @Test
    public void message() {
        InvalidJsonInputError value = InvalidJsonInputError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void detailedErrorMessage() {
        InvalidJsonInputError value = InvalidJsonInputError.of();
        value.setDetailedErrorMessage("detailedErrorMessage");
        Assertions.assertThat(value.getDetailedErrorMessage()).isEqualTo("detailedErrorMessage");
    }
}
