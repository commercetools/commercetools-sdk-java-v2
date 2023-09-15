
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
public class LocalizedStringFieldTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LocalizedStringFieldBuilder builder) {
        LocalizedStringField localizedStringField = builder.buildUnchecked();
        Assertions.assertThat(localizedStringField).isInstanceOf(LocalizedStringField.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { LocalizedStringField.builder()
                .value(new com.commercetools.importapi.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void value() {
        LocalizedStringField value = LocalizedStringField.of();
        value.setValue(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }
}
