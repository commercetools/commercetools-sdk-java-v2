
package com.commercetools.history.models.change_value;

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
public class CustomFieldExpandedValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomFieldExpandedValueBuilder builder) {
        CustomFieldExpandedValue customFieldExpandedValue = builder.buildUnchecked();
        Assertions.assertThat(customFieldExpandedValue).isInstanceOf(CustomFieldExpandedValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomFieldExpandedValue.builder().name("name") },
                new Object[] { CustomFieldExpandedValue.builder().value("value") },
                new Object[] { CustomFieldExpandedValue.builder()
                        .label(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void name() {
        CustomFieldExpandedValue value = CustomFieldExpandedValue.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomFieldExpandedValue value = CustomFieldExpandedValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void label() {
        CustomFieldExpandedValue value = CustomFieldExpandedValue.of();
        value.setLabel(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
