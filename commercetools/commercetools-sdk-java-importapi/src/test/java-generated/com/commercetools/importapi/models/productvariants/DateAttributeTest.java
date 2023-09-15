
package com.commercetools.importapi.models.productvariants;

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
public class DateAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DateAttributeBuilder builder) {
        DateAttribute dateAttribute = builder.buildUnchecked();
        Assertions.assertThat(dateAttribute).isInstanceOf(DateAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DateAttribute.builder().value(LocalDate.parse("2023-06-01")) } };
    }

    @Test
    public void value() {
        DateAttribute value = DateAttribute.of();
        value.setValue(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getValue()).isEqualTo(LocalDate.parse("2023-06-01"));
    }
}
