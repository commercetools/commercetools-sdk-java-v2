
package com.commercetools.history.models.common;

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
public class AttributeLocalizedEnumValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeLocalizedEnumValueBuilder builder) {
        AttributeLocalizedEnumValue attributeLocalizedEnumValue = builder.buildUnchecked();
        Assertions.assertThat(attributeLocalizedEnumValue).isInstanceOf(AttributeLocalizedEnumValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeLocalizedEnumValue.builder().key("key") },
                new Object[] { AttributeLocalizedEnumValue.builder()
                        .label(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void key() {
        AttributeLocalizedEnumValue value = AttributeLocalizedEnumValue.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        AttributeLocalizedEnumValue value = AttributeLocalizedEnumValue.of();
        value.setLabel(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
