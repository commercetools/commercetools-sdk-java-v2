
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
public class ChangeGroupsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeGroupsChangeBuilder builder) {
        ChangeGroupsChange changeGroupsChange = builder.buildUnchecked();
        Assertions.assertThat(changeGroupsChange).isInstanceOf(ChangeGroupsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeGroupsChange.builder().change("change") },
                new Object[] { ChangeGroupsChange.builder().previousValue(Collections.singletonList("previousValue")) },
                new Object[] { ChangeGroupsChange.builder().nextValue(Collections.singletonList("nextValue")) } };
    }

    @Test
    public void change() {
        ChangeGroupsChange value = ChangeGroupsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeGroupsChange value = ChangeGroupsChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        ChangeGroupsChange value = ChangeGroupsChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }
}
