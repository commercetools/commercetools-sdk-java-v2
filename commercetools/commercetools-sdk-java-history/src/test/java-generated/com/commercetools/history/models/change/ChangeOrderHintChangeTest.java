
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
public class ChangeOrderHintChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeOrderHintChangeBuilder builder) {
        ChangeOrderHintChange changeOrderHintChange = builder.buildUnchecked();
        Assertions.assertThat(changeOrderHintChange).isInstanceOf(ChangeOrderHintChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeOrderHintChange.builder().change("change") },
                new Object[] { ChangeOrderHintChange.builder().previousValue("previousValue") },
                new Object[] { ChangeOrderHintChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ChangeOrderHintChange value = ChangeOrderHintChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeOrderHintChange value = ChangeOrderHintChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeOrderHintChange value = ChangeOrderHintChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
