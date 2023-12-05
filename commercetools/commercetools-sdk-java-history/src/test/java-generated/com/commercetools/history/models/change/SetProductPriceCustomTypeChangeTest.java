
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
public class SetProductPriceCustomTypeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetProductPriceCustomTypeChangeBuilder builder) {
        SetProductPriceCustomTypeChange setProductPriceCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setProductPriceCustomTypeChange).isInstanceOf(SetProductPriceCustomTypeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetProductPriceCustomTypeChange.builder().change("change") },
                new Object[] { SetProductPriceCustomTypeChange.builder()
                        .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { SetProductPriceCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { SetProductPriceCustomTypeChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        SetProductPriceCustomTypeChange value = SetProductPriceCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetProductPriceCustomTypeChange value = SetProductPriceCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetProductPriceCustomTypeChange value = SetProductPriceCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void catalogData() {
        SetProductPriceCustomTypeChange value = SetProductPriceCustomTypeChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
