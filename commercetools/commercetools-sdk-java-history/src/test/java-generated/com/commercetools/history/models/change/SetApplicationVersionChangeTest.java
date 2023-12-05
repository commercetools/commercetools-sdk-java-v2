
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
public class SetApplicationVersionChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetApplicationVersionChangeBuilder builder) {
        SetApplicationVersionChange setApplicationVersionChange = builder.buildUnchecked();
        Assertions.assertThat(setApplicationVersionChange).isInstanceOf(SetApplicationVersionChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetApplicationVersionChange.builder().change("change") },
                new Object[] { SetApplicationVersionChange.builder().previousValue(8) },
                new Object[] { SetApplicationVersionChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        SetApplicationVersionChange value = SetApplicationVersionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetApplicationVersionChange value = SetApplicationVersionChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        SetApplicationVersionChange value = SetApplicationVersionChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
