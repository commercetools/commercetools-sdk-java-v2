
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
public class ChangeTaxModeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTaxModeChangeBuilder builder) {
        ChangeTaxModeChange changeTaxModeChange = builder.buildUnchecked();
        Assertions.assertThat(changeTaxModeChange).isInstanceOf(ChangeTaxModeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeTaxModeChange.builder().change("change") },
                new Object[] { ChangeTaxModeChange.builder()
                        .previousValue(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) },
                new Object[] { ChangeTaxModeChange.builder()
                        .nextValue(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void change() {
        ChangeTaxModeChange value = ChangeTaxModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTaxModeChange value = ChangeTaxModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }

    @Test
    public void nextValue() {
        ChangeTaxModeChange value = ChangeTaxModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }
}
