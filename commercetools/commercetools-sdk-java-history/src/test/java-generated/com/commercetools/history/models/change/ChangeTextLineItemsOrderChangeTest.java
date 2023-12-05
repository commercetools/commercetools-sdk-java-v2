
package com.commercetools.history.models.change;

import java.util.Collections;

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
public class ChangeTextLineItemsOrderChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTextLineItemsOrderChangeBuilder builder) {
        ChangeTextLineItemsOrderChange changeTextLineItemsOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changeTextLineItemsOrderChange).isInstanceOf(ChangeTextLineItemsOrderChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeTextLineItemsOrderChange.builder().change("change") },
                new Object[] { ChangeTextLineItemsOrderChange.builder()
                        .previousValue(Collections.singletonList(
                            new com.commercetools.history.models.change_value.TextLineItemValueImpl())) },
                new Object[] { ChangeTextLineItemsOrderChange.builder()
                        .nextValue(Collections.singletonList(
                            new com.commercetools.history.models.change_value.TextLineItemValueImpl())) } };
    }

    @Test
    public void change() {
        ChangeTextLineItemsOrderChange value = ChangeTextLineItemsOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTextLineItemsOrderChange value = ChangeTextLineItemsOrderChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.change_value.TextLineItemValueImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.change_value.TextLineItemValueImpl()));
    }

    @Test
    public void nextValue() {
        ChangeTextLineItemsOrderChange value = ChangeTextLineItemsOrderChange.of();
        value.setNextValue(
            Collections.singletonList(new com.commercetools.history.models.change_value.TextLineItemValueImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.change_value.TextLineItemValueImpl()));
    }
}
