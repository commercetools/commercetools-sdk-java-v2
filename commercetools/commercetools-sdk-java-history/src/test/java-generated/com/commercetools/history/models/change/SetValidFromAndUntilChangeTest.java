
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
public class SetValidFromAndUntilChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetValidFromAndUntilChangeBuilder builder) {
        SetValidFromAndUntilChange setValidFromAndUntilChange = builder.buildUnchecked();
        Assertions.assertThat(setValidFromAndUntilChange).isInstanceOf(SetValidFromAndUntilChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetValidFromAndUntilChange.builder().change("change") },
                new Object[] { SetValidFromAndUntilChange.builder()
                        .previousValue(
                            new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl()) },
                new Object[] { SetValidFromAndUntilChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl()) } };
    }

    @Test
    public void change() {
        SetValidFromAndUntilChange value = SetValidFromAndUntilChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetValidFromAndUntilChange value = SetValidFromAndUntilChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl());
    }

    @Test
    public void nextValue() {
        SetValidFromAndUntilChange value = SetValidFromAndUntilChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ValidFromAndUntilValueImpl());
    }
}
