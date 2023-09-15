
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
public class ChangeTargetChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTargetChangeBuilder builder) {
        ChangeTargetChange changeTargetChange = builder.buildUnchecked();
        Assertions.assertThat(changeTargetChange).isInstanceOf(ChangeTargetChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeTargetChange.builder().change("change") },
                new Object[] { ChangeTargetChange.builder()
                        .previousValue(
                            new com.commercetools.history.models.change_value.ChangeTargetChangeValueImpl()) },
                new Object[] { ChangeTargetChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.ChangeTargetChangeValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeTargetChange value = ChangeTargetChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTargetChange value = ChangeTargetChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.ChangeTargetChangeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ChangeTargetChangeValueImpl());
    }

    @Test
    public void nextValue() {
        ChangeTargetChange value = ChangeTargetChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.ChangeTargetChangeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ChangeTargetChangeValueImpl());
    }
}
