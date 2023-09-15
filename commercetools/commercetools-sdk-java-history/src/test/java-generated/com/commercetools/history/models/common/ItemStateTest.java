
package com.commercetools.history.models.common;

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
public class ItemStateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ItemStateBuilder builder) {
        ItemState itemState = builder.buildUnchecked();
        Assertions.assertThat(itemState).isInstanceOf(ItemState.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ItemState.builder().quantity(8) }, new Object[] {
                ItemState.builder().state(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void quantity() {
        ItemState value = ItemState.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }

    @Test
    public void state() {
        ItemState value = ItemState.of();
        value.setState(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
