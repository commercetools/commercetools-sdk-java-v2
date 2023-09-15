
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
public class SetCartPredicateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetCartPredicateChangeBuilder builder) {
        SetCartPredicateChange setCartPredicateChange = builder.buildUnchecked();
        Assertions.assertThat(setCartPredicateChange).isInstanceOf(SetCartPredicateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetCartPredicateChange.builder().change("change") },
                new Object[] { SetCartPredicateChange.builder().previousValue("previousValue") },
                new Object[] { SetCartPredicateChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetCartPredicateChange value = SetCartPredicateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCartPredicateChange value = SetCartPredicateChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetCartPredicateChange value = SetCartPredicateChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
