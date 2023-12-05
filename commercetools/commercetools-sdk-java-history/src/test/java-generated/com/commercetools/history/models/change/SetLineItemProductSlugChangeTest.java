
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
public class SetLineItemProductSlugChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetLineItemProductSlugChangeBuilder builder) {
        SetLineItemProductSlugChange setLineItemProductSlugChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemProductSlugChange).isInstanceOf(SetLineItemProductSlugChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetLineItemProductSlugChange.builder().change("change") },
                new Object[] { SetLineItemProductSlugChange.builder()
                        .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetLineItemProductSlugChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetLineItemProductSlugChange.builder()
                        .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { SetLineItemProductSlugChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetLineItemProductSlugChange value = SetLineItemProductSlugChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemProductSlugChange value = SetLineItemProductSlugChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemProductSlugChange value = SetLineItemProductSlugChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItem() {
        SetLineItemProductSlugChange value = SetLineItemProductSlugChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        SetLineItemProductSlugChange value = SetLineItemProductSlugChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
