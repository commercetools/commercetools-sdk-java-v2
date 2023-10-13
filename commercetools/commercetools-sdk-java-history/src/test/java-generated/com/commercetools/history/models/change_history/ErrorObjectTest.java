
package com.commercetools.history.models.change_history;

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
public class ErrorObjectTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ErrorObjectBuilder builder) {
        ErrorObject errorObject = builder.buildUnchecked();
        Assertions.assertThat(errorObject).isInstanceOf(ErrorObject.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ErrorObject.builder().code("code") },
                new Object[] { ErrorObject.builder().message("message") } };
    }

    @Test
    public void code() {
        ErrorObject value = ErrorObject.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }

    @Test
    public void message() {
        ErrorObject value = ErrorObject.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
