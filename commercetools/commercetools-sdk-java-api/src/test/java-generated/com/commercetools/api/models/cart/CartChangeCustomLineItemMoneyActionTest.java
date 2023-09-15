
package com.commercetools.api.models.cart;

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
public class CartChangeCustomLineItemMoneyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartChangeCustomLineItemMoneyActionBuilder builder) {
        CartChangeCustomLineItemMoneyAction cartChangeCustomLineItemMoneyAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeCustomLineItemMoneyAction)
                .isInstanceOf(CartChangeCustomLineItemMoneyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartChangeCustomLineItemMoneyAction.builder().customLineItemId("customLineItemId") },
                new Object[] { CartChangeCustomLineItemMoneyAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { CartChangeCustomLineItemMoneyAction.builder()
                        .money(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void customLineItemId() {
        CartChangeCustomLineItemMoneyAction value = CartChangeCustomLineItemMoneyAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartChangeCustomLineItemMoneyAction value = CartChangeCustomLineItemMoneyAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void money() {
        CartChangeCustomLineItemMoneyAction value = CartChangeCustomLineItemMoneyAction.of();
        value.setMoney(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getMoney()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
