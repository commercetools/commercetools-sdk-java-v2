
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
public class ChangeMasterVariantChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeMasterVariantChangeBuilder builder) {
        ChangeMasterVariantChange changeMasterVariantChange = builder.buildUnchecked();
        Assertions.assertThat(changeMasterVariantChange).isInstanceOf(ChangeMasterVariantChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeMasterVariantChange.builder().change("change") },
                new Object[] { ChangeMasterVariantChange.builder()
                        .previousValue(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { ChangeMasterVariantChange.builder()
                        .nextValue(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { ChangeMasterVariantChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        ChangeMasterVariantChange value = ChangeMasterVariantChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeMasterVariantChange value = ChangeMasterVariantChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.VariantImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.VariantImpl());
    }

    @Test
    public void nextValue() {
        ChangeMasterVariantChange value = ChangeMasterVariantChange.of();
        value.setNextValue(new com.commercetools.history.models.common.VariantImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.VariantImpl());
    }

    @Test
    public void catalogData() {
        ChangeMasterVariantChange value = ChangeMasterVariantChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
