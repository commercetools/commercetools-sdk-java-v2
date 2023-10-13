
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
public class AddStateRolesChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddStateRolesChangeBuilder builder) {
        AddStateRolesChange addStateRolesChange = builder.buildUnchecked();
        Assertions.assertThat(addStateRolesChange).isInstanceOf(AddStateRolesChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddStateRolesChange.builder().change("change") },
                new Object[] { AddStateRolesChange.builder()
                        .previousValue(Collections.singletonList(com.commercetools.history.models.common.StateRole
                                .findEnum("ReviewIncludedInStatistics"))) },
                new Object[] { AddStateRolesChange.builder()
                        .nextValue(Collections.singletonList(com.commercetools.history.models.common.StateRole
                                .findEnum("ReviewIncludedInStatistics"))) } };
    }

    @Test
    public void change() {
        AddStateRolesChange value = AddStateRolesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddStateRolesChange value = AddStateRolesChange.of();
        value.setPreviousValue(Collections.singletonList(
            com.commercetools.history.models.common.StateRole.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.StateRole.findEnum("ReviewIncludedInStatistics")));
    }

    @Test
    public void nextValue() {
        AddStateRolesChange value = AddStateRolesChange.of();
        value.setNextValue(Collections.singletonList(
            com.commercetools.history.models.common.StateRole.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.StateRole.findEnum("ReviewIncludedInStatistics")));
    }
}
