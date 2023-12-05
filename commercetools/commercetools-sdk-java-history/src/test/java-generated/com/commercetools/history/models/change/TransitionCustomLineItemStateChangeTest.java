
package com.commercetools.history.models.change;

import java.util.Collections;

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
public class TransitionCustomLineItemStateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TransitionCustomLineItemStateChangeBuilder builder) {
        TransitionCustomLineItemStateChange transitionCustomLineItemStateChange = builder.buildUnchecked();
        Assertions.assertThat(transitionCustomLineItemStateChange)
                .isInstanceOf(TransitionCustomLineItemStateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TransitionCustomLineItemStateChange.builder().change("change") },
                new Object[] {
                        TransitionCustomLineItemStateChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ItemStateImpl())) },
                new Object[] {
                        TransitionCustomLineItemStateChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ItemStateImpl())) },
                new Object[] { TransitionCustomLineItemStateChange.builder().lineItemId("lineItemId") },
                new Object[] { TransitionCustomLineItemStateChange.builder().stateId("stateId") } };
    }

    @Test
    public void change() {
        TransitionCustomLineItemStateChange value = TransitionCustomLineItemStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        TransitionCustomLineItemStateChange value = TransitionCustomLineItemStateChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
    }

    @Test
    public void nextValue() {
        TransitionCustomLineItemStateChange value = TransitionCustomLineItemStateChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
    }

    @Test
    public void lineItemId() {
        TransitionCustomLineItemStateChange value = TransitionCustomLineItemStateChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void stateId() {
        TransitionCustomLineItemStateChange value = TransitionCustomLineItemStateChange.of();
        value.setStateId("stateId");
        Assertions.assertThat(value.getStateId()).isEqualTo("stateId");
    }
}
