
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
public class AddPropertyChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddPropertyChangeBuilder builder) {
        AddPropertyChange addPropertyChange = builder.buildUnchecked();
        Assertions.assertThat(addPropertyChange).isInstanceOf(AddPropertyChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddPropertyChange.builder().change("change") },
                new Object[] { AddPropertyChange.builder().nextValue("nextValue") },
                new Object[] { AddPropertyChange.builder().path("path") } };
    }

    @Test
    public void change() {
        AddPropertyChange value = AddPropertyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddPropertyChange value = AddPropertyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void path() {
        AddPropertyChange value = AddPropertyChange.of();
        value.setPath("path");
        Assertions.assertThat(value.getPath()).isEqualTo("path");
    }
}
