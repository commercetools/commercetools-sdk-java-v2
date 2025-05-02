
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowApprovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowApprovedMessagePayloadBuilder builder) {
        ApprovalFlowApprovedMessagePayload approvalFlowApprovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowApprovedMessagePayload)
                .isInstanceOf(ApprovalFlowApprovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "associate",
                        ApprovalFlowApprovedMessagePayload.builder()
                                .associate(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "order", ApprovalFlowApprovedMessagePayload.builder()
                        .order(new com.commercetools.api.models.order.OrderReferenceImpl()) } };
    }

    @Test
    public void associate() {
        ApprovalFlowApprovedMessagePayload value = ApprovalFlowApprovedMessagePayload.of();
        value.setAssociate(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void order() {
        ApprovalFlowApprovedMessagePayload value = ApprovalFlowApprovedMessagePayload.of();
        value.setOrder(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }
}
