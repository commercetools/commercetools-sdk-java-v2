
package com.commercetools.importapi.models.errors;

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
public class NewMasterVariantAdditionNotAllowedErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(NewMasterVariantAdditionNotAllowedErrorBuilder builder) {
        NewMasterVariantAdditionNotAllowedError newMasterVariantAdditionNotAllowedError = builder.buildUnchecked();
        Assertions.assertThat(newMasterVariantAdditionNotAllowedError)
                .isInstanceOf(NewMasterVariantAdditionNotAllowedError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { NewMasterVariantAdditionNotAllowedError.builder().message("message") } };
    }

    @Test
    public void message() {
        NewMasterVariantAdditionNotAllowedError value = NewMasterVariantAdditionNotAllowedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
