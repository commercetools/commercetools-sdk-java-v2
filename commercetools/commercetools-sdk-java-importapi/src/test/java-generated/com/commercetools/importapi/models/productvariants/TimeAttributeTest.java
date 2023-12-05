
package com.commercetools.importapi.models.productvariants;

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
public class TimeAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TimeAttributeBuilder builder) {
        TimeAttribute timeAttribute = builder.buildUnchecked();
        Assertions.assertThat(timeAttribute).isInstanceOf(TimeAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TimeAttribute.builder().value(LocalTime.parse("12:00")) } };
    }

    @Test
    public void value() {
        TimeAttribute value = TimeAttribute.of();
        value.setValue(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getValue()).isEqualTo(LocalTime.parse("12:00"));
    }
}
