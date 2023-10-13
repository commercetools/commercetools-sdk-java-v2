
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
public class SetAddressCustomFieldChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetAddressCustomFieldChangeBuilder builder) {
        SetAddressCustomFieldChange setAddressCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setAddressCustomFieldChange).isInstanceOf(SetAddressCustomFieldChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetAddressCustomFieldChange.builder().change("change") },
                new Object[] { SetAddressCustomFieldChange.builder()
                        .address(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { SetAddressCustomFieldChange.builder().name("name") },
                new Object[] { SetAddressCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { SetAddressCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { SetAddressCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetAddressCustomFieldChange value = SetAddressCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void address() {
        SetAddressCustomFieldChange value = SetAddressCustomFieldChange.of();
        value.setAddress(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void name() {
        SetAddressCustomFieldChange value = SetAddressCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetAddressCustomFieldChange value = SetAddressCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void previousValue() {
        SetAddressCustomFieldChange value = SetAddressCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetAddressCustomFieldChange value = SetAddressCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
