
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
public class InvalidFieldErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InvalidFieldErrorBuilder builder) {
        InvalidFieldError invalidFieldError = builder.buildUnchecked();
        Assertions.assertThat(invalidFieldError).isInstanceOf(InvalidFieldError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InvalidFieldError.builder().message("message") },
                new Object[] { InvalidFieldError.builder().field("field") },
                new Object[] { InvalidFieldError.builder().invalidValue("invalidValue") }, new Object[] {
                        InvalidFieldError.builder().allowedValues(Collections.singletonList("allowedValues")) } };
    }

    @Test
    public void message() {
        InvalidFieldError value = InvalidFieldError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void field() {
        InvalidFieldError value = InvalidFieldError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void invalidValue() {
        InvalidFieldError value = InvalidFieldError.of();
        value.setInvalidValue("invalidValue");
        Assertions.assertThat(value.getInvalidValue()).isEqualTo("invalidValue");
    }

    @Test
    public void allowedValues() {
        InvalidFieldError value = InvalidFieldError.of();
        value.setAllowedValues(Collections.singletonList("allowedValues"));
        Assertions.assertThat(value.getAllowedValues()).isEqualTo(Collections.singletonList("allowedValues"));
    }
}
