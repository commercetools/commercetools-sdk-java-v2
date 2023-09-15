
package com.commercetools.importapi.models.common;

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
public class LocalizedEnumValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LocalizedEnumValueBuilder builder) {
        LocalizedEnumValue localizedEnumValue = builder.buildUnchecked();
        Assertions.assertThat(localizedEnumValue).isInstanceOf(LocalizedEnumValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { LocalizedEnumValue.builder().key("key") },
                new Object[] { LocalizedEnumValue.builder()
                        .label(new com.commercetools.importapi.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void key() {
        LocalizedEnumValue value = LocalizedEnumValue.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        LocalizedEnumValue value = LocalizedEnumValue.of();
        value.setLabel(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }
}
