
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
public class RemoveBillingAddressIdChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveBillingAddressIdChangeBuilder builder) {
        RemoveBillingAddressIdChange removeBillingAddressIdChange = builder.buildUnchecked();
        Assertions.assertThat(removeBillingAddressIdChange).isInstanceOf(RemoveBillingAddressIdChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveBillingAddressIdChange.builder().change("change") },
                new Object[] { RemoveBillingAddressIdChange.builder()
                        .previousValue(Collections.singletonList("previousValue")) },
                new Object[] {
                        RemoveBillingAddressIdChange.builder().nextValue(Collections.singletonList("nextValue")) },
                new Object[] { RemoveBillingAddressIdChange.builder()
                        .address(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        RemoveBillingAddressIdChange value = RemoveBillingAddressIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveBillingAddressIdChange value = RemoveBillingAddressIdChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        RemoveBillingAddressIdChange value = RemoveBillingAddressIdChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }

    @Test
    public void address() {
        RemoveBillingAddressIdChange value = RemoveBillingAddressIdChange.of();
        value.setAddress(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
