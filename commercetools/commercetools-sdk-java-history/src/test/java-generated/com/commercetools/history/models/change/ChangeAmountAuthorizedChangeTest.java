
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
public class ChangeAmountAuthorizedChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeAmountAuthorizedChangeBuilder builder) {
        ChangeAmountAuthorizedChange changeAmountAuthorizedChange = builder.buildUnchecked();
        Assertions.assertThat(changeAmountAuthorizedChange).isInstanceOf(ChangeAmountAuthorizedChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeAmountAuthorizedChange.builder().change("change") },
                new Object[] { ChangeAmountAuthorizedChange.builder()
                        .previousValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { ChangeAmountAuthorizedChange.builder()
                        .nextValue(new com.commercetools.history.models.common.MoneyImpl()) } };
    }

    @Test
    public void change() {
        ChangeAmountAuthorizedChange value = ChangeAmountAuthorizedChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAmountAuthorizedChange value = ChangeAmountAuthorizedChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void nextValue() {
        ChangeAmountAuthorizedChange value = ChangeAmountAuthorizedChange.of();
        value.setNextValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }
}
