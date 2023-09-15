
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
public class ChangeTaxCalculationModeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTaxCalculationModeChangeBuilder builder) {
        ChangeTaxCalculationModeChange changeTaxCalculationModeChange = builder.buildUnchecked();
        Assertions.assertThat(changeTaxCalculationModeChange).isInstanceOf(ChangeTaxCalculationModeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeTaxCalculationModeChange.builder().change("change") },
                new Object[] {
                        ChangeTaxCalculationModeChange.builder()
                                .previousValue(com.commercetools.history.models.common.TaxCalculationMode
                                        .findEnum("LineItemLevel")) },
                new Object[] { ChangeTaxCalculationModeChange.builder()
                        .nextValue(
                            com.commercetools.history.models.common.TaxCalculationMode.findEnum("LineItemLevel")) } };
    }

    @Test
    public void change() {
        ChangeTaxCalculationModeChange value = ChangeTaxCalculationModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTaxCalculationModeChange value = ChangeTaxCalculationModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.TaxCalculationMode.findEnum("LineItemLevel"));
    }

    @Test
    public void nextValue() {
        ChangeTaxCalculationModeChange value = ChangeTaxCalculationModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.TaxCalculationMode.findEnum("LineItemLevel"));
    }
}
