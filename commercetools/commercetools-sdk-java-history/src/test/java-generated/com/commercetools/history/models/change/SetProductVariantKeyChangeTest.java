
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
public class SetProductVariantKeyChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetProductVariantKeyChangeBuilder builder) {
        SetProductVariantKeyChange setProductVariantKeyChange = builder.buildUnchecked();
        Assertions.assertThat(setProductVariantKeyChange).isInstanceOf(SetProductVariantKeyChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetProductVariantKeyChange.builder().change("change") },
                new Object[] { SetProductVariantKeyChange.builder().previousValue("previousValue") },
                new Object[] { SetProductVariantKeyChange.builder().nextValue("nextValue") },
                new Object[] { SetProductVariantKeyChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        SetProductVariantKeyChange value = SetProductVariantKeyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetProductVariantKeyChange value = SetProductVariantKeyChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetProductVariantKeyChange value = SetProductVariantKeyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void catalogData() {
        SetProductVariantKeyChange value = SetProductVariantKeyChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
