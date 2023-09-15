
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
public class ChangeBuyerAssignableChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeBuyerAssignableChangeBuilder builder) {
        ChangeBuyerAssignableChange changeBuyerAssignableChange = builder.buildUnchecked();
        Assertions.assertThat(changeBuyerAssignableChange).isInstanceOf(ChangeBuyerAssignableChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeBuyerAssignableChange.builder().change("change") },
                new Object[] { ChangeBuyerAssignableChange.builder().previousValue(true) },
                new Object[] { ChangeBuyerAssignableChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        ChangeBuyerAssignableChange value = ChangeBuyerAssignableChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeBuyerAssignableChange value = ChangeBuyerAssignableChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeBuyerAssignableChange value = ChangeBuyerAssignableChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
