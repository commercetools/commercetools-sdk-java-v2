
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetReservationsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetReservationsChangeBuilder builder) {
        SetReservationsChange setReservationsChange = builder.buildUnchecked();
        Assertions.assertThat(setReservationsChange).isInstanceOf(SetReservationsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetReservationsChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetReservationsChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.ReservationImpl())) },
                new Object[] { "nextValue",
                        SetReservationsChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.ReservationImpl())) },
                new Object[] { "addedItems",
                        SetReservationsChange.builder()
                                .addedItems(Collections.singletonList(
                                    new com.commercetools.history.models.common.ReservationImpl())) },
                new Object[] { "removedItems",
                        SetReservationsChange.builder()
                                .removedItems(Collections.singletonList(
                                    new com.commercetools.history.models.common.ReservationImpl())) } };
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

    @Test
    public void addedItems() {
        SetReservationsChange value = SetReservationsChange.of();
        value.setAddedItems(Collections.singletonList(new com.commercetools.history.models.common.ReservationImpl()));
        Assertions.assertThat(value.getAddedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReservationImpl()));
    }

    @Test
    public void removedItems() {
        SetReservationsChange value = SetReservationsChange.of();
        value.setRemovedItems(Collections.singletonList(new com.commercetools.history.models.common.ReservationImpl()));
        Assertions.assertThat(value.getRemovedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReservationImpl()));
    }
}
