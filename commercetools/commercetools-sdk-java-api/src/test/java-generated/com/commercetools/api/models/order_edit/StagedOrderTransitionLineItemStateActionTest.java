
package com.commercetools.api.models.order_edit;

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
public class StagedOrderTransitionLineItemStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderTransitionLineItemStateActionBuilder builder) {
        StagedOrderTransitionLineItemStateAction stagedOrderTransitionLineItemStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderTransitionLineItemStateAction)
                .isInstanceOf(StagedOrderTransitionLineItemStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderTransitionLineItemStateAction.builder().lineItemId("lineItemId") },
                new Object[] { StagedOrderTransitionLineItemStateAction.builder().lineItemKey("lineItemKey") },
                new Object[] { StagedOrderTransitionLineItemStateAction.builder().quantity(8L) },
                new Object[] { StagedOrderTransitionLineItemStateAction.builder()
                        .fromState(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { StagedOrderTransitionLineItemStateAction.builder()
                        .toState(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { StagedOrderTransitionLineItemStateAction.builder()
                        .actualTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void lineItemId() {
        StagedOrderTransitionLineItemStateAction value = StagedOrderTransitionLineItemStateAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        StagedOrderTransitionLineItemStateAction value = StagedOrderTransitionLineItemStateAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        StagedOrderTransitionLineItemStateAction value = StagedOrderTransitionLineItemStateAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void fromState() {
        StagedOrderTransitionLineItemStateAction value = StagedOrderTransitionLineItemStateAction.of();
        value.setFromState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getFromState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void toState() {
        StagedOrderTransitionLineItemStateAction value = StagedOrderTransitionLineItemStateAction.of();
        value.setToState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getToState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void actualTransitionDate() {
        StagedOrderTransitionLineItemStateAction value = StagedOrderTransitionLineItemStateAction.of();
        value.setActualTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getActualTransitionDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
