
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
public class SetCustomLineItemTaxCategoryChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetCustomLineItemTaxCategoryChangeBuilder builder) {
        SetCustomLineItemTaxCategoryChange setCustomLineItemTaxCategoryChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomLineItemTaxCategoryChange)
                .isInstanceOf(SetCustomLineItemTaxCategoryChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetCustomLineItemTaxCategoryChange.builder().change("change") },
                new Object[] { SetCustomLineItemTaxCategoryChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { SetCustomLineItemTaxCategoryChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { SetCustomLineItemTaxCategoryChange.builder()
                        .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetCustomLineItemTaxCategoryChange.builder().customLineItemId("customLineItemId") } };
    }

    @Test
    public void change() {
        SetCustomLineItemTaxCategoryChange value = SetCustomLineItemTaxCategoryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemTaxCategoryChange value = SetCustomLineItemTaxCategoryChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void nextValue() {
        SetCustomLineItemTaxCategoryChange value = SetCustomLineItemTaxCategoryChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void customLineItem() {
        SetCustomLineItemTaxCategoryChange value = SetCustomLineItemTaxCategoryChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemTaxCategoryChange value = SetCustomLineItemTaxCategoryChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }
}
