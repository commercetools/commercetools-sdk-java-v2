
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
public class ChangeOrderStateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeOrderStateChangeBuilder builder) {
        ChangeOrderStateChange changeOrderStateChange = builder.buildUnchecked();
        Assertions.assertThat(changeOrderStateChange).isInstanceOf(ChangeOrderStateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeOrderStateChange.builder().change("change") },
                new Object[] { ChangeOrderStateChange.builder()
                        .previousValue(com.commercetools.history.models.common.OrderState.findEnum("Open")) },
                new Object[] { ChangeOrderStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.OrderState.findEnum("Open")) } };
    }

    @Test
    public void change() {
        ChangeOrderStateChange value = ChangeOrderStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeOrderStateChange value = ChangeOrderStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.OrderState.findEnum("Open"));
    }

    @Test
    public void nextValue() {
        ChangeOrderStateChange value = ChangeOrderStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.OrderState.findEnum("Open"));
    }
}
