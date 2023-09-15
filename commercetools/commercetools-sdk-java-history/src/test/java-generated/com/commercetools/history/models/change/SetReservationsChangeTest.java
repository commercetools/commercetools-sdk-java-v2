
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
public class SetReservationsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetReservationsChangeBuilder builder) {
        SetReservationsChange setReservationsChange = builder.buildUnchecked();
        Assertions.assertThat(setReservationsChange).isInstanceOf(SetReservationsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetReservationsChange.builder().change("change") },
                new Object[] {
                        SetReservationsChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.ReservationImpl())) },
                new Object[] { SetReservationsChange.builder()
                        .nextValue(Collections
                                .singletonList(new com.commercetools.history.models.common.ReservationImpl())) } };
    }

    @Test
    public void change() {
        SetReservationsChange value = SetReservationsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetReservationsChange value = SetReservationsChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.ReservationImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReservationImpl()));
    }

    @Test
    public void nextValue() {
        SetReservationsChange value = SetReservationsChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ReservationImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReservationImpl()));
    }
}
