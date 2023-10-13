
package com.commercetools.history.models.change;

import java.util.Collections;

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
public class SetCountriesChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetCountriesChangeBuilder builder) {
        SetCountriesChange setCountriesChange = builder.buildUnchecked();
        Assertions.assertThat(setCountriesChange).isInstanceOf(SetCountriesChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetCountriesChange.builder().change("change") },
                new Object[] { SetCountriesChange.builder()
                        .previousValue(Collections
                                .singletonList(new com.commercetools.history.models.common.StoreCountryImpl())) },
                new Object[] { SetCountriesChange.builder()
                        .nextValue(Collections
                                .singletonList(new com.commercetools.history.models.common.StoreCountryImpl())) } };
    }

    @Test
    public void change() {
        SetCountriesChange value = SetCountriesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCountriesChange value = SetCountriesChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.StoreCountryImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.StoreCountryImpl()));
    }

    @Test
    public void nextValue() {
        SetCountriesChange value = SetCountriesChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.StoreCountryImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.StoreCountryImpl()));
    }
}
