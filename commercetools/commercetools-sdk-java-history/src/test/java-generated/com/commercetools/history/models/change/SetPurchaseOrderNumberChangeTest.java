
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
public class SetPurchaseOrderNumberChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetPurchaseOrderNumberChangeBuilder builder) {
        SetPurchaseOrderNumberChange setPurchaseOrderNumberChange = builder.buildUnchecked();
        Assertions.assertThat(setPurchaseOrderNumberChange).isInstanceOf(SetPurchaseOrderNumberChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetPurchaseOrderNumberChange.builder().change("change") },
                new Object[] { SetPurchaseOrderNumberChange.builder().previousValue("previousValue") },
                new Object[] { SetPurchaseOrderNumberChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetPurchaseOrderNumberChange value = SetPurchaseOrderNumberChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetPurchaseOrderNumberChange value = SetPurchaseOrderNumberChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetPurchaseOrderNumberChange value = SetPurchaseOrderNumberChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
