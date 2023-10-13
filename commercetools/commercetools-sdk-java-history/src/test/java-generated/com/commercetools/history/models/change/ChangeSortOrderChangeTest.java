
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
public class ChangeSortOrderChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeSortOrderChangeBuilder builder) {
        ChangeSortOrderChange changeSortOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changeSortOrderChange).isInstanceOf(ChangeSortOrderChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeSortOrderChange.builder().change("change") },
                new Object[] { ChangeSortOrderChange.builder().previousValue("previousValue") },
                new Object[] { ChangeSortOrderChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ChangeSortOrderChange value = ChangeSortOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeSortOrderChange value = ChangeSortOrderChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeSortOrderChange value = ChangeSortOrderChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
