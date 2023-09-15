
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
public class SetVariantAvailabilityChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetVariantAvailabilityChangeBuilder builder) {
        SetVariantAvailabilityChange setVariantAvailabilityChange = builder.buildUnchecked();
        Assertions.assertThat(setVariantAvailabilityChange).isInstanceOf(SetVariantAvailabilityChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetVariantAvailabilityChange.builder().change("change") },
                new Object[] { SetVariantAvailabilityChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ProductVariantAvailabilityImpl()) },
                new Object[] { SetVariantAvailabilityChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ProductVariantAvailabilityImpl()) },
                new Object[] { SetVariantAvailabilityChange.builder().catalogData("catalogData") },
                new Object[] { SetVariantAvailabilityChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetVariantAvailabilityChange value = SetVariantAvailabilityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetVariantAvailabilityChange value = SetVariantAvailabilityChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ProductVariantAvailabilityImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductVariantAvailabilityImpl());
    }

    @Test
    public void nextValue() {
        SetVariantAvailabilityChange value = SetVariantAvailabilityChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ProductVariantAvailabilityImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductVariantAvailabilityImpl());
    }

    @Test
    public void catalogData() {
        SetVariantAvailabilityChange value = SetVariantAvailabilityChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        SetVariantAvailabilityChange value = SetVariantAvailabilityChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
