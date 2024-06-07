
package com.commercetools.importapi.models.orders;

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
        return new Object[][] { new Object[] { ItemState.builder().quantity(8L) }, new Object[] {
                ItemState.builder().state(new com.commercetools.importapi.models.common.StateKeyReferenceImpl()) } };
    }

    @Test
    public void quantity() {
        ItemState value = ItemState.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void state() {
        ItemState value = ItemState.of();
        value.setState(new com.commercetools.importapi.models.common.StateKeyReferenceImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.importapi.models.common.StateKeyReferenceImpl());
    }
}
