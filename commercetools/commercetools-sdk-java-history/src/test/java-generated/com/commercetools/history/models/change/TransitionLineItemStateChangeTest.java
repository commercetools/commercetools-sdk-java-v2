
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
public class TransitionLineItemStateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TransitionLineItemStateChangeBuilder builder) {
        TransitionLineItemStateChange transitionLineItemStateChange = builder.buildUnchecked();
        Assertions.assertThat(transitionLineItemStateChange).isInstanceOf(TransitionLineItemStateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TransitionLineItemStateChange.builder().change("change") },
                new Object[] {
                        TransitionLineItemStateChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ItemStateImpl())) },
                new Object[] {
                        TransitionLineItemStateChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ItemStateImpl())) },
                new Object[] { TransitionLineItemStateChange.builder().lineItemId("lineItemId") },
                new Object[] { TransitionLineItemStateChange.builder().stateId("stateId") } };
    }

    @Test
    public void change() {
        TransitionLineItemStateChange value = TransitionLineItemStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        TransitionLineItemStateChange value = TransitionLineItemStateChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
    }

    @Test
    public void nextValue() {
        TransitionLineItemStateChange value = TransitionLineItemStateChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
    }

    @Test
    public void lineItemId() {
        TransitionLineItemStateChange value = TransitionLineItemStateChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void stateId() {
        TransitionLineItemStateChange value = TransitionLineItemStateChange.of();
        value.setStateId("stateId");
        Assertions.assertThat(value.getStateId()).isEqualTo("stateId");
    }
}
