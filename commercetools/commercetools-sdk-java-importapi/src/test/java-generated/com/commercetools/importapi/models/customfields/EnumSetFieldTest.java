
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
public class EnumSetFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(EnumSetFieldBuilder builder) {
        EnumSetField enumSetField = builder.buildUnchecked();
        Assertions.assertThat(enumSetField).isInstanceOf(EnumSetField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { EnumSetField.builder().value(Collections.singletonList("value")) } };
    }

    @Test
    public void value() {
        EnumSetField value = EnumSetField.of();
        value.setValue(Collections.singletonList("value"));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList("value"));
    }
}
