
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
public class AddProductSelectionChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddProductSelectionChangeBuilder builder) {
        AddProductSelectionChange addProductSelectionChange = builder.buildUnchecked();
        Assertions.assertThat(addProductSelectionChange).isInstanceOf(AddProductSelectionChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddProductSelectionChange.builder().change("change") },
                new Object[] { AddProductSelectionChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ProductSelectionSettingImpl()) },
                new Object[] { AddProductSelectionChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ProductSelectionSettingImpl()) } };
    }

    @Test
    public void change() {
        AddProductSelectionChange value = AddProductSelectionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddProductSelectionChange value = AddProductSelectionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ProductSelectionSettingImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductSelectionSettingImpl());
    }

    @Test
    public void nextValue() {
        AddProductSelectionChange value = AddProductSelectionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ProductSelectionSettingImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductSelectionSettingImpl());
    }
}
