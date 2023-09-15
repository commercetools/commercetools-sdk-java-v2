
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
public class CustomFieldLocalizedEnumValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomFieldLocalizedEnumValueBuilder builder) {
        CustomFieldLocalizedEnumValue customFieldLocalizedEnumValue = builder.buildUnchecked();
        Assertions.assertThat(customFieldLocalizedEnumValue).isInstanceOf(CustomFieldLocalizedEnumValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomFieldLocalizedEnumValue.builder().key("key") },
                new Object[] { CustomFieldLocalizedEnumValue.builder()
                        .label(new com.commercetools.importapi.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void key() {
        CustomFieldLocalizedEnumValue value = CustomFieldLocalizedEnumValue.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        CustomFieldLocalizedEnumValue value = CustomFieldLocalizedEnumValue.of();
        value.setLabel(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }
}
