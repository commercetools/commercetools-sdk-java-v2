
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
public class ChangeValueChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeValueChangeBuilder builder) {
        ChangeValueChange changeValueChange = builder.buildUnchecked();
        Assertions.assertThat(changeValueChange).isInstanceOf(ChangeValueChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeValueChange.builder().change("change") },
                new Object[] { ChangeValueChange.builder()
                        .previousValue(
                            new com.commercetools.history.models.change_value.ChangeValueChangeValueImpl()) },
                new Object[] { ChangeValueChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.ChangeValueChangeValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeValueChange value = ChangeValueChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeValueChange value = ChangeValueChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.ChangeValueChangeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ChangeValueChangeValueImpl());
    }

    @Test
    public void nextValue() {
        ChangeValueChange value = ChangeValueChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.ChangeValueChangeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ChangeValueChangeValueImpl());
    }
}
