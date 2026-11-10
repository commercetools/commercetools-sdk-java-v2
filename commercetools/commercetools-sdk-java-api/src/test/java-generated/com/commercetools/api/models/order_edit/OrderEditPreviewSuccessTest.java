
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditPreviewSuccessTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditPreviewSuccessBuilder builder) {
        OrderEditPreviewSuccess orderEditPreviewSuccess = builder.buildUnchecked();
        Assertions.assertThat(orderEditPreviewSuccess).isInstanceOf(OrderEditPreviewSuccess.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "preview",
                        OrderEditPreviewSuccess.builder()
                                .preview(new com.commercetools.api.models.order_edit.StagedOrderImpl()) },
                new Object[] { "messagePayloads",
                        OrderEditPreviewSuccess.builder()
                                .messagePayloads(Collections.singletonList(
                                    new com.commercetools.api.models.message.MessagePayloadImpl())) } };
    }

    @Test
    public void preview() {
        OrderEditPreviewSuccess value = OrderEditPreviewSuccess.of();
        value.setPreview(new com.commercetools.api.models.order_edit.StagedOrderImpl());
        Assertions.assertThat(value.getPreview())
                .isEqualTo(new com.commercetools.api.models.order_edit.StagedOrderImpl());
    }

    @Test
    public void messagePayloads() {
        OrderEditPreviewSuccess value = OrderEditPreviewSuccess.of();
        value.setMessagePayloads(
            Collections.singletonList(new com.commercetools.api.models.message.MessagePayloadImpl()));
        Assertions.assertThat(value.getMessagePayloads())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.message.MessagePayloadImpl()));
    }
}
