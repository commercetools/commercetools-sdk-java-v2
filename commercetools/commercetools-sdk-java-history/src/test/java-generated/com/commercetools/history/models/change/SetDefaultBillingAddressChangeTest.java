
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
public class SetDefaultBillingAddressChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetDefaultBillingAddressChangeBuilder builder) {
        SetDefaultBillingAddressChange setDefaultBillingAddressChange = builder.buildUnchecked();
        Assertions.assertThat(setDefaultBillingAddressChange).isInstanceOf(SetDefaultBillingAddressChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetDefaultBillingAddressChange.builder().change("change") },
                new Object[] { SetDefaultBillingAddressChange.builder()
                        .previousValue(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { SetDefaultBillingAddressChange.builder()
                        .nextValue(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        SetDefaultBillingAddressChange value = SetDefaultBillingAddressChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDefaultBillingAddressChange value = SetDefaultBillingAddressChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void nextValue() {
        SetDefaultBillingAddressChange value = SetDefaultBillingAddressChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
