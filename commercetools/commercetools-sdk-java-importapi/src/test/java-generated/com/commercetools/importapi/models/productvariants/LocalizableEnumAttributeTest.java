
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
public class LocalizableEnumAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LocalizableEnumAttributeBuilder builder) {
        LocalizableEnumAttribute localizableEnumAttribute = builder.buildUnchecked();
        Assertions.assertThat(localizableEnumAttribute).isInstanceOf(LocalizableEnumAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { LocalizableEnumAttribute.builder().value("value") } };
    }

    @Test
    public void value() {
        LocalizableEnumAttribute value = LocalizableEnumAttribute.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
