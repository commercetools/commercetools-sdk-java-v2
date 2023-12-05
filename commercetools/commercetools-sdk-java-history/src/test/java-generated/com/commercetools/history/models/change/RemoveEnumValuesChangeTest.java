
package com.commercetools.history.models.change;

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
public class RemoveEnumValuesChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveEnumValuesChangeBuilder builder) {
        RemoveEnumValuesChange removeEnumValuesChange = builder.buildUnchecked();
        Assertions.assertThat(removeEnumValuesChange).isInstanceOf(RemoveEnumValuesChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveEnumValuesChange.builder().change("change") },
                new Object[] { RemoveEnumValuesChange.builder()
                        .previousValue(new com.commercetools.history.models.change_value.EnumValueImpl()) },
                new Object[] { RemoveEnumValuesChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        RemoveEnumValuesChange value = RemoveEnumValuesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveEnumValuesChange value = RemoveEnumValuesChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.EnumValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.EnumValueImpl());
    }

    @Test
    public void attributeName() {
        RemoveEnumValuesChange value = RemoveEnumValuesChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
