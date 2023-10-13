
package com.commercetools.importapi.models.customfields;

import java.time.LocalDate;

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
public class DateFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DateFieldBuilder builder) {
        DateField dateField = builder.buildUnchecked();
        Assertions.assertThat(dateField).isInstanceOf(DateField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DateField.builder().value(LocalDate.parse("2023-06-01")) } };
    }

    @Test
    public void value() {
        DateField value = DateField.of();
        value.setValue(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getValue()).isEqualTo(LocalDate.parse("2023-06-01"));
    }
}
