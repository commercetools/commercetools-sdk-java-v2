
package com.commercetools.importapi.models.customfields;

import java.time.LocalTime;
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
public class TimeSetFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TimeSetFieldBuilder builder) {
        TimeSetField timeSetField = builder.buildUnchecked();
        Assertions.assertThat(timeSetField).isInstanceOf(TimeSetField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { TimeSetField.builder().value(Collections.singletonList(LocalTime.parse("12:00"))) } };
    }

    @Test
    public void value() {
        TimeSetField value = TimeSetField.of();
        value.setValue(Collections.singletonList(LocalTime.parse("12:00")));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(LocalTime.parse("12:00")));
    }
}
