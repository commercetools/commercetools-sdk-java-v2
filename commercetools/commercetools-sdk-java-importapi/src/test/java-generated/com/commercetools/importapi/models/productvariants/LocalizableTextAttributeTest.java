
package com.commercetools.importapi.models.productvariants;

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
public class LocalizableTextAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LocalizableTextAttributeBuilder builder) {
        LocalizableTextAttribute localizableTextAttribute = builder.buildUnchecked();
        Assertions.assertThat(localizableTextAttribute).isInstanceOf(LocalizableTextAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { LocalizableTextAttribute.builder()
                .value(new com.commercetools.importapi.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void value() {
        LocalizableTextAttribute value = LocalizableTextAttribute.of();
        value.setValue(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }
}
