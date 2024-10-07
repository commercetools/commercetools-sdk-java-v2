
package com.commercetools.importapi.models.errors;

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
public class InvalidFieldsUpdateErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InvalidFieldsUpdateErrorBuilder builder) {
        InvalidFieldsUpdateError invalidFieldsUpdateError = builder.buildUnchecked();
        Assertions.assertThat(invalidFieldsUpdateError).isInstanceOf(InvalidFieldsUpdateError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InvalidFieldsUpdateError.builder().message("message") },
                new Object[] { InvalidFieldsUpdateError.builder().fields(Collections.singletonList("fields")) } };
    }

    @Test
    public void message() {
        InvalidFieldsUpdateError value = InvalidFieldsUpdateError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void fields() {
        InvalidFieldsUpdateError value = InvalidFieldsUpdateError.of();
        value.setFields(Collections.singletonList("fields"));
        Assertions.assertThat(value.getFields()).isEqualTo(Collections.singletonList("fields"));
    }
}
