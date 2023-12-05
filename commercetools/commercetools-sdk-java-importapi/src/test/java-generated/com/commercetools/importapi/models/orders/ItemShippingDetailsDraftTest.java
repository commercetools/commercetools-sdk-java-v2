
package com.commercetools.importapi.models.orders;

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
public class ItemShippingDetailsDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ItemShippingDetailsDraftBuilder builder) {
        ItemShippingDetailsDraft itemShippingDetailsDraft = builder.buildUnchecked();
        Assertions.assertThat(itemShippingDetailsDraft).isInstanceOf(ItemShippingDetailsDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ItemShippingDetailsDraft.builder()
                .targets(Collections
                        .singletonList(new com.commercetools.importapi.models.orders.ItemShippingTargetImpl())) } };
    }

    @Test
    public void targets() {
        ItemShippingDetailsDraft value = ItemShippingDetailsDraft.of();
        value.setTargets(
            Collections.singletonList(new com.commercetools.importapi.models.orders.ItemShippingTargetImpl()));
        Assertions.assertThat(value.getTargets())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.orders.ItemShippingTargetImpl()));
    }
}
