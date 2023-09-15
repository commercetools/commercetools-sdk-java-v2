
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
public class ChangeTaxRoundingModeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTaxRoundingModeChangeBuilder builder) {
        ChangeTaxRoundingModeChange changeTaxRoundingModeChange = builder.buildUnchecked();
        Assertions.assertThat(changeTaxRoundingModeChange).isInstanceOf(ChangeTaxRoundingModeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeTaxRoundingModeChange.builder().change("change") },
                new Object[] { ChangeTaxRoundingModeChange.builder()
                        .previousValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven")) },
                new Object[] { ChangeTaxRoundingModeChange.builder()
                        .nextValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven")) } };
    }

    @Test
    public void change() {
        ChangeTaxRoundingModeChange value = ChangeTaxRoundingModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTaxRoundingModeChange value = ChangeTaxRoundingModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void nextValue() {
        ChangeTaxRoundingModeChange value = ChangeTaxRoundingModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
    }
}
