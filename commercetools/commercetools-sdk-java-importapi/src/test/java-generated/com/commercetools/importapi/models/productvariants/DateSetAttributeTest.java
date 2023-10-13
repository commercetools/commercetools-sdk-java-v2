
package com.commercetools.importapi.models.productvariants;

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
public class DateSetAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DateSetAttributeBuilder builder) {
        DateSetAttribute dateSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(dateSetAttribute).isInstanceOf(DateSetAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                DateSetAttribute.builder().value(Collections.singletonList(LocalDate.parse("2023-06-01"))) } };
    }

    @Test
    public void value() {
        DateSetAttribute value = DateSetAttribute.of();
        value.setValue(Collections.singletonList(LocalDate.parse("2023-06-01")));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(LocalDate.parse("2023-06-01")));
    }
}
