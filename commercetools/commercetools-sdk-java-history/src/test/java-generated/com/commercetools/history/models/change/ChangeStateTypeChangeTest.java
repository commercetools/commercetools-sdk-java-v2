
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
public class ChangeStateTypeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeStateTypeChangeBuilder builder) {
        ChangeStateTypeChange changeStateTypeChange = builder.buildUnchecked();
        Assertions.assertThat(changeStateTypeChange).isInstanceOf(ChangeStateTypeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeStateTypeChange.builder().change("change") },
                new Object[] { ChangeStateTypeChange.builder()
                        .previousValue(com.commercetools.history.models.common.StateTypeEnum.findEnum("OrderState")) },
                new Object[] { ChangeStateTypeChange.builder()
                        .nextValue(com.commercetools.history.models.common.StateTypeEnum.findEnum("OrderState")) } };
    }

    @Test
    public void change() {
        ChangeStateTypeChange value = ChangeStateTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeStateTypeChange value = ChangeStateTypeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.StateTypeEnum.findEnum("OrderState"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.StateTypeEnum.findEnum("OrderState"));
    }

    @Test
    public void nextValue() {
        ChangeStateTypeChange value = ChangeStateTypeChange.of();
        value.setNextValue(com.commercetools.history.models.common.StateTypeEnum.findEnum("OrderState"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.StateTypeEnum.findEnum("OrderState"));
    }
}
