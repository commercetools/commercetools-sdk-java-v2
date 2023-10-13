
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
public class DuplicateFieldErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DuplicateFieldErrorBuilder builder) {
        DuplicateFieldError duplicateFieldError = builder.buildUnchecked();
        Assertions.assertThat(duplicateFieldError).isInstanceOf(DuplicateFieldError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DuplicateFieldError.builder().message("message") },
                new Object[] { DuplicateFieldError.builder().field("field") },
                new Object[] { DuplicateFieldError.builder().duplicateValue("duplicateValue") } };
    }

    @Test
    public void message() {
        DuplicateFieldError value = DuplicateFieldError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void field() {
        DuplicateFieldError value = DuplicateFieldError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void duplicateValue() {
        DuplicateFieldError value = DuplicateFieldError.of();
        value.setDuplicateValue("duplicateValue");
        Assertions.assertThat(value.getDuplicateValue()).isEqualTo("duplicateValue");
    }
}
