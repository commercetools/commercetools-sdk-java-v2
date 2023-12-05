
package com.commercetools.api.models.message;

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
public class LineItemStateTransitionMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LineItemStateTransitionMessagePayloadBuilder builder) {
        LineItemStateTransitionMessagePayload lineItemStateTransitionMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(lineItemStateTransitionMessagePayload)
                .isInstanceOf(LineItemStateTransitionMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { LineItemStateTransitionMessagePayload.builder().lineItemId("lineItemId") },
                new Object[] { LineItemStateTransitionMessagePayload.builder().lineItemKey("lineItemKey") },
                new Object[] { LineItemStateTransitionMessagePayload.builder()
                        .transitionDate(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { LineItemStateTransitionMessagePayload.builder().quantity(8L) },
                new Object[] { LineItemStateTransitionMessagePayload.builder()
                        .fromState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { LineItemStateTransitionMessagePayload.builder()
                        .toState(new com.commercetools.api.models.state.StateReferenceImpl()) } };
    }

    @Test
    public void lineItemId() {
        LineItemStateTransitionMessagePayload value = LineItemStateTransitionMessagePayload.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        LineItemStateTransitionMessagePayload value = LineItemStateTransitionMessagePayload.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void transitionDate() {
        LineItemStateTransitionMessagePayload value = LineItemStateTransitionMessagePayload.of();
        value.setTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getTransitionDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void quantity() {
        LineItemStateTransitionMessagePayload value = LineItemStateTransitionMessagePayload.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void fromState() {
        LineItemStateTransitionMessagePayload value = LineItemStateTransitionMessagePayload.of();
        value.setFromState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getFromState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void toState() {
        LineItemStateTransitionMessagePayload value = LineItemStateTransitionMessagePayload.of();
        value.setToState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getToState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }
}
