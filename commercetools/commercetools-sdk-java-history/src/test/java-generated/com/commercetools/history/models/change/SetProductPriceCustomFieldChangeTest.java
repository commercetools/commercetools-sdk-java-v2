
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
public class SetProductPriceCustomFieldChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetProductPriceCustomFieldChangeBuilder builder) {
        SetProductPriceCustomFieldChange setProductPriceCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setProductPriceCustomFieldChange).isInstanceOf(SetProductPriceCustomFieldChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetProductPriceCustomFieldChange.builder().change("change") },
                new Object[] { SetProductPriceCustomFieldChange.builder()
                        .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { SetProductPriceCustomFieldChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { SetProductPriceCustomFieldChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        SetProductPriceCustomFieldChange value = SetProductPriceCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetProductPriceCustomFieldChange value = SetProductPriceCustomFieldChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetProductPriceCustomFieldChange value = SetProductPriceCustomFieldChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void catalogData() {
        SetProductPriceCustomFieldChange value = SetProductPriceCustomFieldChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
