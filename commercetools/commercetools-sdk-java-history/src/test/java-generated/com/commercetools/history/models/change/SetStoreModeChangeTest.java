
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
public class SetStoreModeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetStoreModeChangeBuilder builder) {
        SetStoreModeChange setStoreModeChange = builder.buildUnchecked();
        Assertions.assertThat(setStoreModeChange).isInstanceOf(SetStoreModeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetStoreModeChange.builder().change("change") },
                new Object[] {
                        SetStoreModeChange.builder()
                                .previousValue(com.commercetools.history.models.common.BusinessUnitStoreMode
                                        .findEnum("Explicit")) },
                new Object[] { SetStoreModeChange.builder()
                        .nextValue(
                            com.commercetools.history.models.common.BusinessUnitStoreMode.findEnum("Explicit")) } };
    }

    @Test
    public void change() {
        SetStoreModeChange value = SetStoreModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetStoreModeChange value = SetStoreModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.BusinessUnitStoreMode.findEnum("Explicit"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitStoreMode.findEnum("Explicit"));
    }

    @Test
    public void nextValue() {
        SetStoreModeChange value = SetStoreModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.BusinessUnitStoreMode.findEnum("Explicit"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitStoreMode.findEnum("Explicit"));
    }
}
