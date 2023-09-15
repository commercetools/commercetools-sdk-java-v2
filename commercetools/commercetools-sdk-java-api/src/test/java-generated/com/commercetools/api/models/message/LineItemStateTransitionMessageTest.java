
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
public class LineItemStateTransitionMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LineItemStateTransitionMessageBuilder builder) {
        LineItemStateTransitionMessage lineItemStateTransitionMessage = builder.buildUnchecked();
        Assertions.assertThat(lineItemStateTransitionMessage).isInstanceOf(LineItemStateTransitionMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { LineItemStateTransitionMessage.builder().lineItemId("lineItemId") },
                new Object[] { LineItemStateTransitionMessage.builder().lineItemKey("lineItemKey") },
                new Object[] { LineItemStateTransitionMessage.builder()
                        .transitionDate(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { LineItemStateTransitionMessage.builder().quantity(8L) },
                new Object[] { LineItemStateTransitionMessage.builder()
                        .fromState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { LineItemStateTransitionMessage.builder()
                        .toState(new com.commercetools.api.models.state.StateReferenceImpl()) } };
    }

    @Test
    public void lineItemId() {
        LineItemStateTransitionMessage value = LineItemStateTransitionMessage.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        LineItemStateTransitionMessage value = LineItemStateTransitionMessage.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void transitionDate() {
        LineItemStateTransitionMessage value = LineItemStateTransitionMessage.of();
        value.setTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getTransitionDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void quantity() {
        LineItemStateTransitionMessage value = LineItemStateTransitionMessage.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void fromState() {
        LineItemStateTransitionMessage value = LineItemStateTransitionMessage.of();
        value.setFromState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getFromState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void toState() {
        LineItemStateTransitionMessage value = LineItemStateTransitionMessage.of();
        value.setToState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getToState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }
}
