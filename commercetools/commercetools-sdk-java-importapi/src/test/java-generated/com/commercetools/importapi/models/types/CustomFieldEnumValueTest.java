
package com.commercetools.importapi.models.types;

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
public class CustomFieldEnumValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomFieldEnumValueBuilder builder) {
        CustomFieldEnumValue customFieldEnumValue = builder.buildUnchecked();
        Assertions.assertThat(customFieldEnumValue).isInstanceOf(CustomFieldEnumValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomFieldEnumValue.builder().key("key") },
                new Object[] { CustomFieldEnumValue.builder().label("label") } };
    }

    @Test
    public void key() {
        CustomFieldEnumValue value = CustomFieldEnumValue.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        CustomFieldEnumValue value = CustomFieldEnumValue.of();
        value.setLabel("label");
        Assertions.assertThat(value.getLabel()).isEqualTo("label");
    }
}
