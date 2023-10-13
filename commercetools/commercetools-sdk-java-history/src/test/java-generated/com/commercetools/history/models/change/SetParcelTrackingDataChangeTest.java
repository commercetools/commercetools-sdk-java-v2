
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
public class SetParcelTrackingDataChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetParcelTrackingDataChangeBuilder builder) {
        SetParcelTrackingDataChange setParcelTrackingDataChange = builder.buildUnchecked();
        Assertions.assertThat(setParcelTrackingDataChange).isInstanceOf(SetParcelTrackingDataChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetParcelTrackingDataChange.builder().change("change") },
                new Object[] { SetParcelTrackingDataChange.builder()
                        .previousValue(new com.commercetools.history.models.common.TrackingDataImpl()) },
                new Object[] { SetParcelTrackingDataChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TrackingDataImpl()) },
                new Object[] { SetParcelTrackingDataChange.builder()
                        .parcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl()) } };
    }

    @Test
    public void change() {
        SetParcelTrackingDataChange value = SetParcelTrackingDataChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetParcelTrackingDataChange value = SetParcelTrackingDataChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TrackingDataImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TrackingDataImpl());
    }

    @Test
    public void nextValue() {
        SetParcelTrackingDataChange value = SetParcelTrackingDataChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TrackingDataImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TrackingDataImpl());
    }

    @Test
    public void parcel() {
        SetParcelTrackingDataChange value = SetParcelTrackingDataChange.of();
        value.setParcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
        Assertions.assertThat(value.getParcel())
                .isEqualTo(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
    }
}
