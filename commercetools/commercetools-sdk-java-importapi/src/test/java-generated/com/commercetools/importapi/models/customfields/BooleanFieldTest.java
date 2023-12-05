
package com.commercetools.importapi.models.customfields;

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
public class BooleanFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BooleanFieldBuilder builder) {
        BooleanField booleanField = builder.buildUnchecked();
        Assertions.assertThat(booleanField).isInstanceOf(BooleanField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BooleanField.builder().value(true) } };
    }

    @Test
    public void value() {
        BooleanField value = BooleanField.of();
        value.setValue(true);
        Assertions.assertThat(value.getValue()).isEqualTo(true);
    }
}
