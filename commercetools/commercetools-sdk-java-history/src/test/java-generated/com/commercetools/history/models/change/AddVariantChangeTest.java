
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
public class AddVariantChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddVariantChangeBuilder builder) {
        AddVariantChange addVariantChange = builder.buildUnchecked();
        Assertions.assertThat(addVariantChange).isInstanceOf(AddVariantChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddVariantChange.builder().change("change") },
                new Object[] { AddVariantChange.builder()
                        .previousValue(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { AddVariantChange.builder()
                        .nextValue(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { AddVariantChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        AddVariantChange value = AddVariantChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddVariantChange value = AddVariantChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.VariantImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.VariantImpl());
    }

    @Test
    public void nextValue() {
        AddVariantChange value = AddVariantChange.of();
        value.setNextValue(new com.commercetools.history.models.common.VariantImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.VariantImpl());
    }

    @Test
    public void catalogData() {
        AddVariantChange value = AddVariantChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
