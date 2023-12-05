
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
public class RemoveChannelRolesChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveChannelRolesChangeBuilder builder) {
        RemoveChannelRolesChange removeChannelRolesChange = builder.buildUnchecked();
        Assertions.assertThat(removeChannelRolesChange).isInstanceOf(RemoveChannelRolesChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveChannelRolesChange.builder().change("change") },
                new Object[] { RemoveChannelRolesChange.builder()
                        .previousValue(Collections.singletonList(
                            com.commercetools.history.models.common.ChannelRole.findEnum("InventorySupply"))) },
                new Object[] { RemoveChannelRolesChange.builder()
                        .nextValue(Collections.singletonList(
                            com.commercetools.history.models.common.ChannelRole.findEnum("InventorySupply"))) } };
    }

    @Test
    public void change() {
        RemoveChannelRolesChange value = RemoveChannelRolesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveChannelRolesChange value = RemoveChannelRolesChange.of();
        value.setPreviousValue(
            Collections.singletonList(com.commercetools.history.models.common.ChannelRole.findEnum("InventorySupply")));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.ChannelRole.findEnum("InventorySupply")));
    }

    @Test
    public void nextValue() {
        RemoveChannelRolesChange value = RemoveChannelRolesChange.of();
        value.setNextValue(
            Collections.singletonList(com.commercetools.history.models.common.ChannelRole.findEnum("InventorySupply")));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.ChannelRole.findEnum("InventorySupply")));
    }
}
