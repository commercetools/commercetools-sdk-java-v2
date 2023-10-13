
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
public class ChangeCartPredicateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeCartPredicateChangeBuilder builder) {
        ChangeCartPredicateChange changeCartPredicateChange = builder.buildUnchecked();
        Assertions.assertThat(changeCartPredicateChange).isInstanceOf(ChangeCartPredicateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeCartPredicateChange.builder().change("change") },
                new Object[] { ChangeCartPredicateChange.builder().previousValue("previousValue") },
                new Object[] { ChangeCartPredicateChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ChangeCartPredicateChange value = ChangeCartPredicateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeCartPredicateChange value = ChangeCartPredicateChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeCartPredicateChange value = ChangeCartPredicateChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
