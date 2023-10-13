
package com.commercetools.importapi.models.customfields;

import java.time.ZonedDateTime;

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
public class DateTimeFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DateTimeFieldBuilder builder) {
        DateTimeField dateTimeField = builder.buildUnchecked();
        Assertions.assertThat(dateTimeField).isInstanceOf(DateTimeField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DateTimeField.builder().value(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void value() {
        DateTimeField value = DateTimeField.of();
        value.setValue(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValue()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
