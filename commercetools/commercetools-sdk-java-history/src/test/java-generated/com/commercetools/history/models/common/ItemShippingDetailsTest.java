
package com.commercetools.history.models.common;

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
public class ItemShippingDetailsTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ItemShippingDetailsBuilder builder) {
        ItemShippingDetails itemShippingDetails = builder.buildUnchecked();
        Assertions.assertThat(itemShippingDetails).isInstanceOf(ItemShippingDetails.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ItemShippingDetails.builder()
                        .targets(Collections
                                .singletonList(new com.commercetools.history.models.common.ItemShippingTargetImpl())) },
                new Object[] { ItemShippingDetails.builder().valid(true) } };
    }

    @Test
    public void targets() {
        ItemShippingDetails value = ItemShippingDetails.of();
        value.setTargets(
            Collections.singletonList(new com.commercetools.history.models.common.ItemShippingTargetImpl()));
        Assertions.assertThat(value.getTargets())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.common.ItemShippingTargetImpl()));
    }

    @Test
    public void valid() {
        ItemShippingDetails value = ItemShippingDetails.of();
        value.setValid(true);
        Assertions.assertThat(value.getValid()).isEqualTo(true);
    }
}
