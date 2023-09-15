
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
public class SetAttributeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetAttributeChangeBuilder builder) {
        SetAttributeChange setAttributeChange = builder.buildUnchecked();
        Assertions.assertThat(setAttributeChange).isInstanceOf(SetAttributeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetAttributeChange.builder().change("change") },
                new Object[] { SetAttributeChange.builder()
                        .previousValue(new com.commercetools.history.models.change_value.AttributeValueImpl()) },
                new Object[] { SetAttributeChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.AttributeValueImpl()) },
                new Object[] { SetAttributeChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        SetAttributeChange value = SetAttributeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAttributeChange value = SetAttributeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.AttributeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.AttributeValueImpl());
    }

    @Test
    public void nextValue() {
        SetAttributeChange value = SetAttributeChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.AttributeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.AttributeValueImpl());
    }

    @Test
    public void catalogData() {
        SetAttributeChange value = SetAttributeChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
