
package com.commercetools.importapi.models.customfields;

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
public class LocalizedEnumSetFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LocalizedEnumSetFieldBuilder builder) {
        LocalizedEnumSetField localizedEnumSetField = builder.buildUnchecked();
        Assertions.assertThat(localizedEnumSetField).isInstanceOf(LocalizedEnumSetField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { LocalizedEnumSetField.builder().value(Collections.singletonList("value")) } };
    }

    @Test
    public void value() {
        LocalizedEnumSetField value = LocalizedEnumSetField.of();
        value.setValue(Collections.singletonList("value"));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList("value"));
    }
}
