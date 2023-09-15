
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
public class SetTextLineItemCustomFieldChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetTextLineItemCustomFieldChangeBuilder builder) {
        SetTextLineItemCustomFieldChange setTextLineItemCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setTextLineItemCustomFieldChange).isInstanceOf(SetTextLineItemCustomFieldChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetTextLineItemCustomFieldChange.builder().change("change") },
                new Object[] { SetTextLineItemCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { SetTextLineItemCustomFieldChange.builder().nextValue("nextValue") },
                new Object[] { SetTextLineItemCustomFieldChange.builder().name("name") },
                new Object[] { SetTextLineItemCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { SetTextLineItemCustomFieldChange.builder()
                        .textLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl()) } };
    }

    @Test
    public void change() {
        SetTextLineItemCustomFieldChange value = SetTextLineItemCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetTextLineItemCustomFieldChange value = SetTextLineItemCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetTextLineItemCustomFieldChange value = SetTextLineItemCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void name() {
        SetTextLineItemCustomFieldChange value = SetTextLineItemCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetTextLineItemCustomFieldChange value = SetTextLineItemCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void textLineItem() {
        SetTextLineItemCustomFieldChange value = SetTextLineItemCustomFieldChange.of();
        value.setTextLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
        Assertions.assertThat(value.getTextLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
    }
}
