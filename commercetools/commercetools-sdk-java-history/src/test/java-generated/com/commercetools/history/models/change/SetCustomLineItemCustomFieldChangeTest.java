
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
public class SetCustomLineItemCustomFieldChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetCustomLineItemCustomFieldChangeBuilder builder) {
        SetCustomLineItemCustomFieldChange setCustomLineItemCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomLineItemCustomFieldChange)
                .isInstanceOf(SetCustomLineItemCustomFieldChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetCustomLineItemCustomFieldChange.builder().change("change") },
                new Object[] { SetCustomLineItemCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { SetCustomLineItemCustomFieldChange.builder().nextValue("nextValue") },
                new Object[] { SetCustomLineItemCustomFieldChange.builder().name("name") },
                new Object[] { SetCustomLineItemCustomFieldChange.builder()
                        .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetCustomLineItemCustomFieldChange.builder().customLineItemId("customLineItemId") } };
    }

    @Test
    public void change() {
        SetCustomLineItemCustomFieldChange value = SetCustomLineItemCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemCustomFieldChange value = SetCustomLineItemCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetCustomLineItemCustomFieldChange value = SetCustomLineItemCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void name() {
        SetCustomLineItemCustomFieldChange value = SetCustomLineItemCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customLineItem() {
        SetCustomLineItemCustomFieldChange value = SetCustomLineItemCustomFieldChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemCustomFieldChange value = SetCustomLineItemCustomFieldChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }
}
