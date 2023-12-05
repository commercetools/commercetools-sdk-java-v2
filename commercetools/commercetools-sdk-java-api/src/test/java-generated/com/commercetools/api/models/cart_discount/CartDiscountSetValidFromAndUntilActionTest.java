
package com.commercetools.api.models.cart_discount;

import java.time.ZonedDateTime;

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
public class CartDiscountSetValidFromAndUntilActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountSetValidFromAndUntilActionBuilder builder) {
        CartDiscountSetValidFromAndUntilAction cartDiscountSetValidFromAndUntilAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountSetValidFromAndUntilAction)
                .isInstanceOf(CartDiscountSetValidFromAndUntilAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartDiscountSetValidFromAndUntilAction.builder()
                        .validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { CartDiscountSetValidFromAndUntilAction.builder()
                        .validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validFrom() {
        CartDiscountSetValidFromAndUntilAction value = CartDiscountSetValidFromAndUntilAction.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        CartDiscountSetValidFromAndUntilAction value = CartDiscountSetValidFromAndUntilAction.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
