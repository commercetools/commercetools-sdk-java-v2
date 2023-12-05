
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
public class SetOrderLineItemCustomFieldChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetOrderLineItemCustomFieldChangeBuilder builder) {
        SetOrderLineItemCustomFieldChange setOrderLineItemCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setOrderLineItemCustomFieldChange).isInstanceOf(SetOrderLineItemCustomFieldChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetOrderLineItemCustomFieldChange.builder().change("change") },
                new Object[] { SetOrderLineItemCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { SetOrderLineItemCustomFieldChange.builder().nextValue("nextValue") },
                new Object[] { SetOrderLineItemCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { SetOrderLineItemCustomFieldChange.builder().name("name") },
                new Object[] { SetOrderLineItemCustomFieldChange.builder()
                        .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetOrderLineItemCustomFieldChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void customTypeId() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void name() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void lineItem() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
