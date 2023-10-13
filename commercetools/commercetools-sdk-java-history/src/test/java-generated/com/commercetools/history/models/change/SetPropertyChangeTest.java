
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
public class SetPropertyChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetPropertyChangeBuilder builder) {
        SetPropertyChange setPropertyChange = builder.buildUnchecked();
        Assertions.assertThat(setPropertyChange).isInstanceOf(SetPropertyChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetPropertyChange.builder().change("change") },
                new Object[] { SetPropertyChange.builder().previousValue("previousValue") },
                new Object[] { SetPropertyChange.builder().nextValue("nextValue") },
                new Object[] { SetPropertyChange.builder().path("path") } };
    }

    @Test
    public void change() {
        SetPropertyChange value = SetPropertyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetPropertyChange value = SetPropertyChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetPropertyChange value = SetPropertyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void path() {
        SetPropertyChange value = SetPropertyChange.of();
        value.setPath("path");
        Assertions.assertThat(value.getPath()).isEqualTo("path");
    }
}
