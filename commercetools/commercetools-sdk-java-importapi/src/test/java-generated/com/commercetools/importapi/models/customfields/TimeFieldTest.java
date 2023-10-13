
package com.commercetools.importapi.models.customfields;

import java.time.LocalTime;

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
public class TimeFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TimeFieldBuilder builder) {
        TimeField timeField = builder.buildUnchecked();
        Assertions.assertThat(timeField).isInstanceOf(TimeField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TimeField.builder().value(LocalTime.parse("12:00")) } };
    }

    @Test
    public void value() {
        TimeField value = TimeField.of();
        value.setValue(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getValue()).isEqualTo(LocalTime.parse("12:00"));
    }
}
