
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
public class SetPermissionsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetPermissionsChangeBuilder builder) {
        SetPermissionsChange setPermissionsChange = builder.buildUnchecked();
        Assertions.assertThat(setPermissionsChange).isInstanceOf(SetPermissionsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetPermissionsChange.builder().change("change") },
                new Object[] { SetPermissionsChange.builder()
                        .previousValue(Collections.singletonList(
                            com.commercetools.history.models.common.Permission.findEnum("AddChildUnits"))) },
                new Object[] { SetPermissionsChange.builder()
                        .nextValue(Collections.singletonList(
                            com.commercetools.history.models.common.Permission.findEnum("AddChildUnits"))) } };
    }

    @Test
    public void change() {
        SetPermissionsChange value = SetPermissionsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetPermissionsChange value = SetPermissionsChange.of();
        value.setPreviousValue(
            Collections.singletonList(com.commercetools.history.models.common.Permission.findEnum("AddChildUnits")));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections
                        .singletonList(com.commercetools.history.models.common.Permission.findEnum("AddChildUnits")));
    }

    @Test
    public void nextValue() {
        SetPermissionsChange value = SetPermissionsChange.of();
        value.setNextValue(
            Collections.singletonList(com.commercetools.history.models.common.Permission.findEnum("AddChildUnits")));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections
                        .singletonList(com.commercetools.history.models.common.Permission.findEnum("AddChildUnits")));
    }
}
