
package com.commercetools.api.models.message;

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
public class OrderDiscountCodeStateSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderDiscountCodeStateSetMessagePayloadBuilder builder) {
        OrderDiscountCodeStateSetMessagePayload orderDiscountCodeStateSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderDiscountCodeStateSetMessagePayload)
                .isInstanceOf(OrderDiscountCodeStateSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderDiscountCodeStateSetMessagePayload.builder()
                        .discountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl()) },
                new Object[] { OrderDiscountCodeStateSetMessagePayload.builder()
                        .state(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive")) },
                new Object[] { OrderDiscountCodeStateSetMessagePayload.builder()
                        .oldState(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive")) } };
    }

    @Test
    public void discountCode() {
        OrderDiscountCodeStateSetMessagePayload value = OrderDiscountCodeStateSetMessagePayload.of();
        value.setDiscountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
    }

    @Test
    public void state() {
        OrderDiscountCodeStateSetMessagePayload value = OrderDiscountCodeStateSetMessagePayload.of();
        value.setState(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
    }

    @Test
    public void oldState() {
        OrderDiscountCodeStateSetMessagePayload value = OrderDiscountCodeStateSetMessagePayload.of();
        value.setOldState(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
        Assertions.assertThat(value.getOldState())
                .isEqualTo(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
    }
}
