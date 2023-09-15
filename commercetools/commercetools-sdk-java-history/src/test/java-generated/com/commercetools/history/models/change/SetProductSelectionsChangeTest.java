
package com.commercetools.history.models.change;

import java.util.Collections;

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
public class SetProductSelectionsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetProductSelectionsChangeBuilder builder) {
        SetProductSelectionsChange setProductSelectionsChange = builder.buildUnchecked();
        Assertions.assertThat(setProductSelectionsChange).isInstanceOf(SetProductSelectionsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetProductSelectionsChange.builder().change("change") },
                new Object[] { SetProductSelectionsChange.builder()
                        .previousValue(Collections.singletonList(
                            new com.commercetools.history.models.common.ProductSelectionSettingImpl())) },
                new Object[] { SetProductSelectionsChange.builder()
                        .nextValue(Collections.singletonList(
                            new com.commercetools.history.models.common.ProductSelectionSettingImpl())) } };
    }

    @Test
    public void change() {
        SetProductSelectionsChange value = SetProductSelectionsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetProductSelectionsChange value = SetProductSelectionsChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.ProductSelectionSettingImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.common.ProductSelectionSettingImpl()));
    }

    @Test
    public void nextValue() {
        SetProductSelectionsChange value = SetProductSelectionsChange.of();
        value.setNextValue(
            Collections.singletonList(new com.commercetools.history.models.common.ProductSelectionSettingImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.common.ProductSelectionSettingImpl()));
    }
}
