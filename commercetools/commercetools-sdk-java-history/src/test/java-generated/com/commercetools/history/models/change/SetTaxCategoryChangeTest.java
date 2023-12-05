
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
public class SetTaxCategoryChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetTaxCategoryChangeBuilder builder) {
        SetTaxCategoryChange setTaxCategoryChange = builder.buildUnchecked();
        Assertions.assertThat(setTaxCategoryChange).isInstanceOf(SetTaxCategoryChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetTaxCategoryChange.builder().change("change") },
                new Object[] { SetTaxCategoryChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { SetTaxCategoryChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void change() {
        SetTaxCategoryChange value = SetTaxCategoryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetTaxCategoryChange value = SetTaxCategoryChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void nextValue() {
        SetTaxCategoryChange value = SetTaxCategoryChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
