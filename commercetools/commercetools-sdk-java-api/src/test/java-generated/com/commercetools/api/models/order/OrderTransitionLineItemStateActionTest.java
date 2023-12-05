
package com.commercetools.api.models.order;

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
public class OrderTransitionLineItemStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderTransitionLineItemStateActionBuilder builder) {
        OrderTransitionLineItemStateAction orderTransitionLineItemStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderTransitionLineItemStateAction)
                .isInstanceOf(OrderTransitionLineItemStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderTransitionLineItemStateAction.builder().lineItemId("lineItemId") },
                new Object[] { OrderTransitionLineItemStateAction.builder().lineItemKey("lineItemKey") },
                new Object[] { OrderTransitionLineItemStateAction.builder().quantity(8L) },
                new Object[] { OrderTransitionLineItemStateAction.builder()
                        .fromState(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { OrderTransitionLineItemStateAction.builder()
                        .toState(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { OrderTransitionLineItemStateAction.builder()
                        .actualTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void lineItemId() {
        OrderTransitionLineItemStateAction value = OrderTransitionLineItemStateAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderTransitionLineItemStateAction value = OrderTransitionLineItemStateAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        OrderTransitionLineItemStateAction value = OrderTransitionLineItemStateAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void fromState() {
        OrderTransitionLineItemStateAction value = OrderTransitionLineItemStateAction.of();
        value.setFromState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getFromState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void toState() {
        OrderTransitionLineItemStateAction value = OrderTransitionLineItemStateAction.of();
        value.setToState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getToState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void actualTransitionDate() {
        OrderTransitionLineItemStateAction value = OrderTransitionLineItemStateAction.of();
        value.setActualTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getActualTransitionDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
