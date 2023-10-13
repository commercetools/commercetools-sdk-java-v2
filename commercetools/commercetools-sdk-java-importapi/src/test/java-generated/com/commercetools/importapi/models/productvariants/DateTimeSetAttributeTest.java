
package com.commercetools.importapi.models.productvariants;

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
public class DateTimeSetAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DateTimeSetAttributeBuilder builder) {
        DateTimeSetAttribute dateTimeSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(dateTimeSetAttribute).isInstanceOf(DateTimeSetAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DateTimeSetAttribute.builder()
                .value(Collections.singletonList(ZonedDateTime.parse("2023-06-01T12:00Z"))) } };
    }

    @Test
    public void value() {
        DateTimeSetAttribute value = DateTimeSetAttribute.of();
        value.setValue(Collections.singletonList(ZonedDateTime.parse("2023-06-01T12:00Z")));
        Assertions.assertThat(value.getValue())
                .isEqualTo(Collections.singletonList(ZonedDateTime.parse("2023-06-01T12:00Z")));
    }
}
