
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
public class SetMaxApplicationsPerCustomerChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetMaxApplicationsPerCustomerChangeBuilder builder) {
        SetMaxApplicationsPerCustomerChange setMaxApplicationsPerCustomerChange = builder.buildUnchecked();
        Assertions.assertThat(setMaxApplicationsPerCustomerChange)
                .isInstanceOf(SetMaxApplicationsPerCustomerChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetMaxApplicationsPerCustomerChange.builder().change("change") },
                new Object[] { SetMaxApplicationsPerCustomerChange.builder().previousValue(8) },
                new Object[] { SetMaxApplicationsPerCustomerChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        SetMaxApplicationsPerCustomerChange value = SetMaxApplicationsPerCustomerChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMaxApplicationsPerCustomerChange value = SetMaxApplicationsPerCustomerChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        SetMaxApplicationsPerCustomerChange value = SetMaxApplicationsPerCustomerChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
