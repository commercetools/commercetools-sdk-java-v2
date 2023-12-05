
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
public class ChangeAmountPlannedChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeAmountPlannedChangeBuilder builder) {
        ChangeAmountPlannedChange changeAmountPlannedChange = builder.buildUnchecked();
        Assertions.assertThat(changeAmountPlannedChange).isInstanceOf(ChangeAmountPlannedChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeAmountPlannedChange.builder().change("change") },
                new Object[] { ChangeAmountPlannedChange.builder()
                        .previousValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { ChangeAmountPlannedChange.builder()
                        .nextValue(new com.commercetools.history.models.common.MoneyImpl()) } };
    }

    @Test
    public void change() {
        ChangeAmountPlannedChange value = ChangeAmountPlannedChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAmountPlannedChange value = ChangeAmountPlannedChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void nextValue() {
        ChangeAmountPlannedChange value = ChangeAmountPlannedChange.of();
        value.setNextValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }
}
