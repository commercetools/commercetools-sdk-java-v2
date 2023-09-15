
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
public class DuplicateEnumValuesErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DuplicateEnumValuesErrorBuilder builder) {
        DuplicateEnumValuesError duplicateEnumValuesError = builder.buildUnchecked();
        Assertions.assertThat(duplicateEnumValuesError).isInstanceOf(DuplicateEnumValuesError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DuplicateEnumValuesError.builder().message("message") }, new Object[] {
                DuplicateEnumValuesError.builder().duplicates(Collections.singletonList("duplicates")) } };
    }

    @Test
    public void message() {
        DuplicateEnumValuesError value = DuplicateEnumValuesError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void duplicates() {
        DuplicateEnumValuesError value = DuplicateEnumValuesError.of();
        value.setDuplicates(Collections.singletonList("duplicates"));
        Assertions.assertThat(value.getDuplicates()).isEqualTo(Collections.singletonList("duplicates"));
    }
}
