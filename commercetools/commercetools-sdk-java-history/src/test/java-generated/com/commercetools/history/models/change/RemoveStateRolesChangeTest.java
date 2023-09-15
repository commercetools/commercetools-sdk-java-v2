
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
public class RemoveStateRolesChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveStateRolesChangeBuilder builder) {
        RemoveStateRolesChange removeStateRolesChange = builder.buildUnchecked();
        Assertions.assertThat(removeStateRolesChange).isInstanceOf(RemoveStateRolesChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveStateRolesChange.builder().change("change") },
                new Object[] { RemoveStateRolesChange.builder()
                        .previousValue(Collections.singletonList(com.commercetools.history.models.common.StateRole
                                .findEnum("ReviewIncludedInStatistics"))) },
                new Object[] { RemoveStateRolesChange.builder()
                        .nextValue(Collections.singletonList(com.commercetools.history.models.common.StateRole
                                .findEnum("ReviewIncludedInStatistics"))) } };
    }

    @Test
    public void change() {
        RemoveStateRolesChange value = RemoveStateRolesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveStateRolesChange value = RemoveStateRolesChange.of();
        value.setPreviousValue(Collections.singletonList(
            com.commercetools.history.models.common.StateRole.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.StateRole.findEnum("ReviewIncludedInStatistics")));
    }

    @Test
    public void nextValue() {
        RemoveStateRolesChange value = RemoveStateRolesChange.of();
        value.setNextValue(Collections.singletonList(
            com.commercetools.history.models.common.StateRole.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.StateRole.findEnum("ReviewIncludedInStatistics")));
    }
}
