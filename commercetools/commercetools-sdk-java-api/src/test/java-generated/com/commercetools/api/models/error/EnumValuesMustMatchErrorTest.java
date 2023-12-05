
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
public class EnumValuesMustMatchErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(EnumValuesMustMatchErrorBuilder builder) {
        EnumValuesMustMatchError enumValuesMustMatchError = builder.buildUnchecked();
        Assertions.assertThat(enumValuesMustMatchError).isInstanceOf(EnumValuesMustMatchError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { EnumValuesMustMatchError.builder().message("message") } };
    }

    @Test
    public void message() {
        EnumValuesMustMatchError value = EnumValuesMustMatchError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
