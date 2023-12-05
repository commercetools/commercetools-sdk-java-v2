
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
public class OrderStateTransitionMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderStateTransitionMessagePayloadBuilder builder) {
        OrderStateTransitionMessagePayload orderStateTransitionMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderStateTransitionMessagePayload)
                .isInstanceOf(OrderStateTransitionMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderStateTransitionMessagePayload.builder()
                        .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { OrderStateTransitionMessagePayload.builder()
                        .oldState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { OrderStateTransitionMessagePayload.builder().force(true) } };
    }

    @Test
    public void state() {
        OrderStateTransitionMessagePayload value = OrderStateTransitionMessagePayload.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void oldState() {
        OrderStateTransitionMessagePayload value = OrderStateTransitionMessagePayload.of();
        value.setOldState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getOldState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        OrderStateTransitionMessagePayload value = OrderStateTransitionMessagePayload.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
