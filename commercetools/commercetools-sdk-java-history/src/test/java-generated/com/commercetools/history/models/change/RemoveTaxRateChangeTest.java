
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
public class RemoveTaxRateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveTaxRateChangeBuilder builder) {
        RemoveTaxRateChange removeTaxRateChange = builder.buildUnchecked();
        Assertions.assertThat(removeTaxRateChange).isInstanceOf(RemoveTaxRateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveTaxRateChange.builder().change("change") },
                new Object[] { RemoveTaxRateChange.builder()
                        .previousValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { RemoveTaxRateChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TaxRateImpl()) } };
    }

    @Test
    public void change() {
        RemoveTaxRateChange value = RemoveTaxRateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveTaxRateChange value = RemoveTaxRateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void nextValue() {
        RemoveTaxRateChange value = RemoveTaxRateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }
}
