
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
public class ChangeIsActiveChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeIsActiveChangeBuilder builder) {
        ChangeIsActiveChange changeIsActiveChange = builder.buildUnchecked();
        Assertions.assertThat(changeIsActiveChange).isInstanceOf(ChangeIsActiveChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeIsActiveChange.builder().change("change") },
                new Object[] { ChangeIsActiveChange.builder().previousValue(true) },
                new Object[] { ChangeIsActiveChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        ChangeIsActiveChange value = ChangeIsActiveChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeIsActiveChange value = ChangeIsActiveChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeIsActiveChange value = ChangeIsActiveChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
