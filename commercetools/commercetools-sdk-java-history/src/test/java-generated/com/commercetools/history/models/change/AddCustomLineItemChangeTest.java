
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
public class AddCustomLineItemChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddCustomLineItemChangeBuilder builder) {
        AddCustomLineItemChange addCustomLineItemChange = builder.buildUnchecked();
        Assertions.assertThat(addCustomLineItemChange).isInstanceOf(AddCustomLineItemChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddCustomLineItemChange.builder().change("change") },
                new Object[] { AddCustomLineItemChange.builder()
                        .previousValue(new com.commercetools.history.models.common.CustomLineItemImpl()) },
                new Object[] { AddCustomLineItemChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomLineItemImpl()) } };
    }

    @Test
    public void change() {
        AddCustomLineItemChange value = AddCustomLineItemChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddCustomLineItemChange value = AddCustomLineItemChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomLineItemImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomLineItemImpl());
    }

    @Test
    public void nextValue() {
        AddCustomLineItemChange value = AddCustomLineItemChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomLineItemImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomLineItemImpl());
    }
}
