
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
public class SetChannelRolesChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetChannelRolesChangeBuilder builder) {
        SetChannelRolesChange setChannelRolesChange = builder.buildUnchecked();
        Assertions.assertThat(setChannelRolesChange).isInstanceOf(SetChannelRolesChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetChannelRolesChange.builder().change("change") },
                new Object[] { SetChannelRolesChange.builder()
                        .previousValue(Collections.singletonList(
                            com.commercetools.history.models.common.ChannelRole.findEnum("InventorySupply"))) },
                new Object[] { SetChannelRolesChange.builder()
                        .nextValue(Collections.singletonList(
                            com.commercetools.history.models.common.ChannelRole.findEnum("InventorySupply"))) } };
    }

    @Test
    public void change() {
        SetChannelRolesChange value = SetChannelRolesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetChannelRolesChange value = SetChannelRolesChange.of();
        value.setPreviousValue(
            Collections.singletonList(com.commercetools.history.models.common.ChannelRole.findEnum("InventorySupply")));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.ChannelRole.findEnum("InventorySupply")));
    }

    @Test
    public void nextValue() {
        SetChannelRolesChange value = SetChannelRolesChange.of();
        value.setNextValue(
            Collections.singletonList(com.commercetools.history.models.common.ChannelRole.findEnum("InventorySupply")));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.ChannelRole.findEnum("InventorySupply")));
    }
}
