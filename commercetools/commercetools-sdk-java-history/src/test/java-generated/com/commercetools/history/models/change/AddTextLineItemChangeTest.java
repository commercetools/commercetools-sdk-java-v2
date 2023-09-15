
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
public class AddTextLineItemChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddTextLineItemChangeBuilder builder) {
        AddTextLineItemChange addTextLineItemChange = builder.buildUnchecked();
        Assertions.assertThat(addTextLineItemChange).isInstanceOf(AddTextLineItemChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddTextLineItemChange.builder().change("change") },
                new Object[] { AddTextLineItemChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TextLineItemImpl()) } };
    }

    @Test
    public void change() {
        AddTextLineItemChange value = AddTextLineItemChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddTextLineItemChange value = AddTextLineItemChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TextLineItemImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TextLineItemImpl());
    }
}
