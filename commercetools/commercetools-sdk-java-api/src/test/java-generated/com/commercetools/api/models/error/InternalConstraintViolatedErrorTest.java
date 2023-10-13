
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
public class InternalConstraintViolatedErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InternalConstraintViolatedErrorBuilder builder) {
        InternalConstraintViolatedError internalConstraintViolatedError = builder.buildUnchecked();
        Assertions.assertThat(internalConstraintViolatedError).isInstanceOf(InternalConstraintViolatedError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InternalConstraintViolatedError.builder().message("message") } };
    }

    @Test
    public void message() {
        InternalConstraintViolatedError value = InternalConstraintViolatedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
