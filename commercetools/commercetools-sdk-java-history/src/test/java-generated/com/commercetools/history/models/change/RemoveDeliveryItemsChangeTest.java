
package com.commercetools.history.models.change;

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
public class RemoveDeliveryItemsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveDeliveryItemsChangeBuilder builder) {
        RemoveDeliveryItemsChange removeDeliveryItemsChange = builder.buildUnchecked();
        Assertions.assertThat(removeDeliveryItemsChange).isInstanceOf(RemoveDeliveryItemsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveDeliveryItemsChange.builder().change("change") },
                new Object[] { RemoveDeliveryItemsChange.builder()
                        .previousValue(new com.commercetools.history.models.common.DeliveryImpl()) } };
    }

    @Test
    public void change() {
        RemoveDeliveryItemsChange value = RemoveDeliveryItemsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveDeliveryItemsChange value = RemoveDeliveryItemsChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.DeliveryImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DeliveryImpl());
    }
}
