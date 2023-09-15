
package com.commercetools.importapi.models.customfields;

import java.time.ZonedDateTime;
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
public class DateTimeSetFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DateTimeSetFieldBuilder builder) {
        DateTimeSetField dateTimeSetField = builder.buildUnchecked();
        Assertions.assertThat(dateTimeSetField).isInstanceOf(DateTimeSetField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DateTimeSetField.builder()
                .value(Collections.singletonList(ZonedDateTime.parse("2023-06-01T12:00Z"))) } };
    }

    @Test
    public void value() {
        DateTimeSetField value = DateTimeSetField.of();
        value.setValue(Collections.singletonList(ZonedDateTime.parse("2023-06-01T12:00Z")));
        Assertions.assertThat(value.getValue())
                .isEqualTo(Collections.singletonList(ZonedDateTime.parse("2023-06-01T12:00Z")));
    }
}
