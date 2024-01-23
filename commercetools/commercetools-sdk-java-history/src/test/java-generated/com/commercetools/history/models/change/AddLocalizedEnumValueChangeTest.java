
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
public class AddLocalizedEnumValueChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddLocalizedEnumValueChangeBuilder builder) {
        AddLocalizedEnumValueChange addLocalizedEnumValueChange = builder.buildUnchecked();
        Assertions.assertThat(addLocalizedEnumValueChange).isInstanceOf(AddLocalizedEnumValueChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddLocalizedEnumValueChange.builder().change("change") },
                new Object[] { AddLocalizedEnumValueChange.builder()
                        .nextValue(new com.commercetools.history.models.common.AttributeLocalizedEnumValueImpl()) },
                new Object[] { AddLocalizedEnumValueChange.builder().fieldName("fieldName") },
                new Object[] { AddLocalizedEnumValueChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        AddLocalizedEnumValueChange value = AddLocalizedEnumValueChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddLocalizedEnumValueChange value = AddLocalizedEnumValueChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AttributeLocalizedEnumValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AttributeLocalizedEnumValueImpl());
    }

    @Test
    public void fieldName() {
        AddLocalizedEnumValueChange value = AddLocalizedEnumValueChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }

    @Test
    public void attributeName() {
        AddLocalizedEnumValueChange value = AddLocalizedEnumValueChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
