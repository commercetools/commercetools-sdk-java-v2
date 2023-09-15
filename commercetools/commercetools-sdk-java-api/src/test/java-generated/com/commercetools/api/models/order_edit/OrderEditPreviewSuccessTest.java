
package com.commercetools.api.models.order_edit;

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
public class OrderEditPreviewSuccessTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderEditPreviewSuccessBuilder builder) {
        OrderEditPreviewSuccess orderEditPreviewSuccess = builder.buildUnchecked();
        Assertions.assertThat(orderEditPreviewSuccess).isInstanceOf(OrderEditPreviewSuccess.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderEditPreviewSuccess.builder()
                        .preview(new com.commercetools.api.models.order_edit.StagedOrderImpl()) },
                new Object[] { OrderEditPreviewSuccess.builder()
                        .messagePayloads(Collections
                                .singletonList(new com.commercetools.api.models.message.MessagePayloadImpl())) } };
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
