
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
public class ChangeDescriptionChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeDescriptionChangeBuilder builder) {
        ChangeDescriptionChange changeDescriptionChange = builder.buildUnchecked();
        Assertions.assertThat(changeDescriptionChange).isInstanceOf(ChangeDescriptionChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeDescriptionChange.builder().change("change") },
                new Object[] { ChangeDescriptionChange.builder().previousValue("previousValue") },
                new Object[] { ChangeDescriptionChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ChangeDescriptionChange value = ChangeDescriptionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeDescriptionChange value = ChangeDescriptionChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeDescriptionChange value = ChangeDescriptionChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
