
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
public class StagedOrderTransitionCustomLineItemStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderTransitionCustomLineItemStateActionBuilder builder) {
        StagedOrderTransitionCustomLineItemStateAction stagedOrderTransitionCustomLineItemStateAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderTransitionCustomLineItemStateAction)
                .isInstanceOf(StagedOrderTransitionCustomLineItemStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        StagedOrderTransitionCustomLineItemStateAction.builder().customLineItemId("customLineItemId") },
                new Object[] { StagedOrderTransitionCustomLineItemStateAction.builder()
                        .customLineItemKey("customLineItemKey") },
                new Object[] { StagedOrderTransitionCustomLineItemStateAction.builder().quantity(8L) },
                new Object[] { StagedOrderTransitionCustomLineItemStateAction.builder()
                        .fromState(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { StagedOrderTransitionCustomLineItemStateAction.builder()
                        .toState(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { StagedOrderTransitionCustomLineItemStateAction.builder()
                        .actualTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void customLineItemId() {
        StagedOrderTransitionCustomLineItemStateAction value = StagedOrderTransitionCustomLineItemStateAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        StagedOrderTransitionCustomLineItemStateAction value = StagedOrderTransitionCustomLineItemStateAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void quantity() {
        StagedOrderTransitionCustomLineItemStateAction value = StagedOrderTransitionCustomLineItemStateAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void fromState() {
        StagedOrderTransitionCustomLineItemStateAction value = StagedOrderTransitionCustomLineItemStateAction.of();
        value.setFromState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getFromState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void toState() {
        StagedOrderTransitionCustomLineItemStateAction value = StagedOrderTransitionCustomLineItemStateAction.of();
        value.setToState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getToState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void actualTransitionDate() {
        StagedOrderTransitionCustomLineItemStateAction value = StagedOrderTransitionCustomLineItemStateAction.of();
        value.setActualTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getActualTransitionDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
