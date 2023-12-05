
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
public class AddOrderLineItemChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddOrderLineItemChangeBuilder builder) {
        AddOrderLineItemChange addOrderLineItemChange = builder.buildUnchecked();
        Assertions.assertThat(addOrderLineItemChange).isInstanceOf(AddOrderLineItemChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddOrderLineItemChange.builder().change("change") },
                new Object[] { AddOrderLineItemChange.builder()
                        .previousValue(new com.commercetools.history.models.common.LineItemImpl()) },
                new Object[] { AddOrderLineItemChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LineItemImpl()) } };
    }

    @Test
    public void change() {
        AddOrderLineItemChange value = AddOrderLineItemChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddOrderLineItemChange value = AddOrderLineItemChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LineItemImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LineItemImpl());
    }

    @Test
    public void nextValue() {
        AddOrderLineItemChange value = AddOrderLineItemChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LineItemImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LineItemImpl());
    }
}
