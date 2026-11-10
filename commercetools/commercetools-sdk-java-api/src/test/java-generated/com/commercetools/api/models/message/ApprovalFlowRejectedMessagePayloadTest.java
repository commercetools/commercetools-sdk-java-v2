
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowRejectedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowRejectedMessagePayloadBuilder builder) {
        ApprovalFlowRejectedMessagePayload approvalFlowRejectedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowRejectedMessagePayload)
                .isInstanceOf(ApprovalFlowRejectedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "associate",
                        ApprovalFlowRejectedMessagePayload.builder()
                                .associate(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "rejectionReason",
                        ApprovalFlowRejectedMessagePayload.builder().rejectionReason("rejectionReason") },
                new Object[] { "order", ApprovalFlowRejectedMessagePayload.builder()
                        .order(new com.commercetools.api.models.order.OrderReferenceImpl()) } };
    }

    @Test
    public void associate() {
        ApprovalFlowRejectedMessagePayload value = ApprovalFlowRejectedMessagePayload.of();
        value.setAssociate(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void rejectionReason() {
        ApprovalFlowRejectedMessagePayload value = ApprovalFlowRejectedMessagePayload.of();
        value.setRejectionReason("rejectionReason");
        Assertions.assertThat(value.getRejectionReason()).isEqualTo("rejectionReason");
    }

    @Test
    public void order() {
        ApprovalFlowRejectedMessagePayload value = ApprovalFlowRejectedMessagePayload.of();
        value.setOrder(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }
}
