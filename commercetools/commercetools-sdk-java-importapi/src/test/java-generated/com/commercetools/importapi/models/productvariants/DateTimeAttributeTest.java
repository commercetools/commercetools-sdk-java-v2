
package com.commercetools.importapi.models.productvariants;

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
public class DateTimeAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DateTimeAttributeBuilder builder) {
        DateTimeAttribute dateTimeAttribute = builder.buildUnchecked();
        Assertions.assertThat(dateTimeAttribute).isInstanceOf(DateTimeAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DateTimeAttribute.builder().value(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void value() {
        DateTimeAttribute value = DateTimeAttribute.of();
        value.setValue(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValue()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
