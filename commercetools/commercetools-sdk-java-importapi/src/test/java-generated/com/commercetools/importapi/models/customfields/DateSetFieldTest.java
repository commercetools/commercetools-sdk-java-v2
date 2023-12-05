
package com.commercetools.importapi.models.customfields;

import java.time.LocalDate;
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
public class DateSetFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DateSetFieldBuilder builder) {
        DateSetField dateSetField = builder.buildUnchecked();
        Assertions.assertThat(dateSetField).isInstanceOf(DateSetField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                DateSetField.builder().value(Collections.singletonList(LocalDate.parse("2023-06-01"))) } };
    }

    @Test
    public void value() {
        DateSetField value = DateSetField.of();
        value.setValue(Collections.singletonList(LocalDate.parse("2023-06-01")));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(LocalDate.parse("2023-06-01")));
    }
}
