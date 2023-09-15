
package com.commercetools.history.models.common;

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
public class ReservationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReservationBuilder builder) {
        Reservation reservation = builder.buildUnchecked();
        Assertions.assertThat(reservation).isInstanceOf(Reservation.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Reservation.builder().quantity(8) },
                new Object[] {
                        Reservation.builder().owner(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { Reservation.builder().createdAt("createdAt") },
                new Object[] { Reservation.builder().checkoutStartedAt("checkoutStartedAt") } };
    }

    @Test
    public void quantity() {
        Reservation value = Reservation.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }

    @Test
    public void owner() {
        Reservation value = Reservation.of();
        value.setOwner(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getOwner()).isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void createdAt() {
        Reservation value = Reservation.of();
        value.setCreatedAt("createdAt");
        Assertions.assertThat(value.getCreatedAt()).isEqualTo("createdAt");
    }

    @Test
    public void checkoutStartedAt() {
        Reservation value = Reservation.of();
        value.setCheckoutStartedAt("checkoutStartedAt");
        Assertions.assertThat(value.getCheckoutStartedAt()).isEqualTo("checkoutStartedAt");
    }
}
