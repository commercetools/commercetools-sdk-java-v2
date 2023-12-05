
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
public class LocalizedEnumFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LocalizedEnumFieldBuilder builder) {
        LocalizedEnumField localizedEnumField = builder.buildUnchecked();
        Assertions.assertThat(localizedEnumField).isInstanceOf(LocalizedEnumField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { LocalizedEnumField.builder().value("value") } };
    }

    @Test
    public void value() {
        LocalizedEnumField value = LocalizedEnumField.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
