
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
public class SetParcelItemsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetParcelItemsChangeBuilder builder) {
        SetParcelItemsChange setParcelItemsChange = builder.buildUnchecked();
        Assertions.assertThat(setParcelItemsChange).isInstanceOf(SetParcelItemsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetParcelItemsChange.builder().change("change") },
                new Object[] { SetParcelItemsChange.builder()
                        .previousValue(Collections
                                .singletonList(new com.commercetools.history.models.common.DeliveryItemImpl())) },
                new Object[] { SetParcelItemsChange.builder()
                        .nextValue(Collections
                                .singletonList(new com.commercetools.history.models.common.DeliveryItemImpl())) },
                new Object[] { SetParcelItemsChange.builder()
                        .parcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl()) } };
    }

    @Test
    public void change() {
        SetParcelItemsChange value = SetParcelItemsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetParcelItemsChange value = SetParcelItemsChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
    }

    @Test
    public void nextValue() {
        SetParcelItemsChange value = SetParcelItemsChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
    }

    @Test
    public void parcel() {
        SetParcelItemsChange value = SetParcelItemsChange.of();
        value.setParcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
        Assertions.assertThat(value.getParcel())
                .isEqualTo(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
    }
}
