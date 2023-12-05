
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
public class SetParcelMeasurementsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetParcelMeasurementsChangeBuilder builder) {
        SetParcelMeasurementsChange setParcelMeasurementsChange = builder.buildUnchecked();
        Assertions.assertThat(setParcelMeasurementsChange).isInstanceOf(SetParcelMeasurementsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetParcelMeasurementsChange.builder().change("change") },
                new Object[] { SetParcelMeasurementsChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ParcelMeasurementsImpl()) },
                new Object[] { SetParcelMeasurementsChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ParcelMeasurementsImpl()) },
                new Object[] { SetParcelMeasurementsChange.builder()
                        .parcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl()) } };
    }

    @Test
    public void change() {
        SetParcelMeasurementsChange value = SetParcelMeasurementsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetParcelMeasurementsChange value = SetParcelMeasurementsChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ParcelMeasurementsImpl());
    }

    @Test
    public void nextValue() {
        SetParcelMeasurementsChange value = SetParcelMeasurementsChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ParcelMeasurementsImpl());
    }

    @Test
    public void parcel() {
        SetParcelMeasurementsChange value = SetParcelMeasurementsChange.of();
        value.setParcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
        Assertions.assertThat(value.getParcel())
                .isEqualTo(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
    }
}
