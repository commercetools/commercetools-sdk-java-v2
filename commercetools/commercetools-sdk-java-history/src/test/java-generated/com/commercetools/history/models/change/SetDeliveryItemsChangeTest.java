
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
public class SetDeliveryItemsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetDeliveryItemsChangeBuilder builder) {
        SetDeliveryItemsChange setDeliveryItemsChange = builder.buildUnchecked();
        Assertions.assertThat(setDeliveryItemsChange).isInstanceOf(SetDeliveryItemsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetDeliveryItemsChange.builder().change("change") },
                new Object[] { SetDeliveryItemsChange.builder()
                        .previousValue(Collections
                                .singletonList(new com.commercetools.history.models.common.DeliveryItemImpl())) },
                new Object[] { SetDeliveryItemsChange.builder()
                        .nextValue(Collections
                                .singletonList(new com.commercetools.history.models.common.DeliveryItemImpl())) },
                new Object[] { SetDeliveryItemsChange.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void change() {
        SetDeliveryItemsChange value = SetDeliveryItemsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDeliveryItemsChange value = SetDeliveryItemsChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
    }

    @Test
    public void nextValue() {
        SetDeliveryItemsChange value = SetDeliveryItemsChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
    }

    @Test
    public void deliveryId() {
        SetDeliveryItemsChange value = SetDeliveryItemsChange.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
