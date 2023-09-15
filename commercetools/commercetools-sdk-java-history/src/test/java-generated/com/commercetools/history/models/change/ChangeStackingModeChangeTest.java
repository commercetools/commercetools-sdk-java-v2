
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
public class ChangeStackingModeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeStackingModeChangeBuilder builder) {
        ChangeStackingModeChange changeStackingModeChange = builder.buildUnchecked();
        Assertions.assertThat(changeStackingModeChange).isInstanceOf(ChangeStackingModeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeStackingModeChange.builder().change("change") },
                new Object[] { ChangeStackingModeChange.builder()
                        .previousValue(com.commercetools.history.models.common.StackingMode.findEnum("Stacking")) },
                new Object[] { ChangeStackingModeChange.builder()
                        .nextValue(com.commercetools.history.models.common.StackingMode.findEnum("Stacking")) } };
    }

    @Test
    public void change() {
        ChangeStackingModeChange value = ChangeStackingModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeStackingModeChange value = ChangeStackingModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.StackingMode.findEnum("Stacking"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.StackingMode.findEnum("Stacking"));
    }

    @Test
    public void nextValue() {
        ChangeStackingModeChange value = ChangeStackingModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.StackingMode.findEnum("Stacking"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.StackingMode.findEnum("Stacking"));
    }
}
