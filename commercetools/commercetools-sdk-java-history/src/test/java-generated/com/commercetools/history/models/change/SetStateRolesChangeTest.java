
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
public class SetStateRolesChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetStateRolesChangeBuilder builder) {
        SetStateRolesChange setStateRolesChange = builder.buildUnchecked();
        Assertions.assertThat(setStateRolesChange).isInstanceOf(SetStateRolesChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetStateRolesChange.builder().change("change") },
                new Object[] { SetStateRolesChange.builder()
                        .previousValue(Collections.singletonList(com.commercetools.history.models.common.StateRoleEnum
                                .findEnum("ReviewIncludedInStatistics"))) },
                new Object[] { SetStateRolesChange.builder()
                        .nextValue(Collections.singletonList(com.commercetools.history.models.common.StateRoleEnum
                                .findEnum("ReviewIncludedInStatistics"))) } };
    }

    @Test
    public void change() {
        SetStateRolesChange value = SetStateRolesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetStateRolesChange value = SetStateRolesChange.of();
        value.setPreviousValue(Collections.singletonList(
            com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
    }

    @Test
    public void nextValue() {
        SetStateRolesChange value = SetStateRolesChange.of();
        value.setNextValue(Collections.singletonList(
            com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
    }
}
