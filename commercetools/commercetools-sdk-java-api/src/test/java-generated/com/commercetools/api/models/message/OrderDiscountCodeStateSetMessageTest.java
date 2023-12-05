
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
public class OrderDiscountCodeStateSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderDiscountCodeStateSetMessageBuilder builder) {
        OrderDiscountCodeStateSetMessage orderDiscountCodeStateSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderDiscountCodeStateSetMessage).isInstanceOf(OrderDiscountCodeStateSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderDiscountCodeStateSetMessage.builder()
                        .discountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl()) },
                new Object[] { OrderDiscountCodeStateSetMessage.builder()
                        .state(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive")) },
                new Object[] { OrderDiscountCodeStateSetMessage.builder()
                        .oldState(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive")) } };
    }

    @Test
    public void discountCode() {
        OrderDiscountCodeStateSetMessage value = OrderDiscountCodeStateSetMessage.of();
        value.setDiscountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
    }

    @Test
    public void state() {
        OrderDiscountCodeStateSetMessage value = OrderDiscountCodeStateSetMessage.of();
        value.setState(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
    }

    @Test
    public void oldState() {
        OrderDiscountCodeStateSetMessage value = OrderDiscountCodeStateSetMessage.of();
        value.setOldState(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
        Assertions.assertThat(value.getOldState())
                .isEqualTo(com.commercetools.api.models.cart.DiscountCodeState.findEnum("NotActive"));
    }
}
