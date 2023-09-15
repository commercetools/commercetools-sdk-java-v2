
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
public class CustomLineItemStateTransitionMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomLineItemStateTransitionMessageBuilder builder) {
        CustomLineItemStateTransitionMessage customLineItemStateTransitionMessage = builder.buildUnchecked();
        Assertions.assertThat(customLineItemStateTransitionMessage)
                .isInstanceOf(CustomLineItemStateTransitionMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomLineItemStateTransitionMessage.builder().customLineItemId("customLineItemId") },
                new Object[] { CustomLineItemStateTransitionMessage.builder().customLineItemKey("customLineItemKey") },
                new Object[] { CustomLineItemStateTransitionMessage.builder()
                        .transitionDate(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { CustomLineItemStateTransitionMessage.builder().quantity(8L) },
                new Object[] { CustomLineItemStateTransitionMessage.builder()
                        .fromState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { CustomLineItemStateTransitionMessage.builder()
                        .toState(new com.commercetools.api.models.state.StateReferenceImpl()) } };
    }

    @Test
    public void customLineItemId() {
        CustomLineItemStateTransitionMessage value = CustomLineItemStateTransitionMessage.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CustomLineItemStateTransitionMessage value = CustomLineItemStateTransitionMessage.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void transitionDate() {
        CustomLineItemStateTransitionMessage value = CustomLineItemStateTransitionMessage.of();
        value.setTransitionDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getTransitionDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void quantity() {
        CustomLineItemStateTransitionMessage value = CustomLineItemStateTransitionMessage.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void fromState() {
        CustomLineItemStateTransitionMessage value = CustomLineItemStateTransitionMessage.of();
        value.setFromState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getFromState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void toState() {
        CustomLineItemStateTransitionMessage value = CustomLineItemStateTransitionMessage.of();
        value.setToState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getToState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }
}
