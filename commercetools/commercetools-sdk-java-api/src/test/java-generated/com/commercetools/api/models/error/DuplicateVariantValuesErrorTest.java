
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
public class DuplicateVariantValuesErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DuplicateVariantValuesErrorBuilder builder) {
        DuplicateVariantValuesError duplicateVariantValuesError = builder.buildUnchecked();
        Assertions.assertThat(duplicateVariantValuesError).isInstanceOf(DuplicateVariantValuesError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DuplicateVariantValuesError.builder().message("message") },
                new Object[] { DuplicateVariantValuesError.builder()
                        .variantValues(new com.commercetools.api.models.error.VariantValuesImpl()) } };
    }

    @Test
    public void message() {
        DuplicateVariantValuesError value = DuplicateVariantValuesError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void variantValues() {
        DuplicateVariantValuesError value = DuplicateVariantValuesError.of();
        value.setVariantValues(new com.commercetools.api.models.error.VariantValuesImpl());
        Assertions.assertThat(value.getVariantValues())
                .isEqualTo(new com.commercetools.api.models.error.VariantValuesImpl());
    }
}
