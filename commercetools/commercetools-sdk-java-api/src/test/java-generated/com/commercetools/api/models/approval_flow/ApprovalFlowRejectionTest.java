
package com.commercetools.api.models.approval_flow;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowRejectionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowRejectionBuilder builder) {
        ApprovalFlowRejection approvalFlowRejection = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowRejection).isInstanceOf(ApprovalFlowRejection.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "rejecter",
                        ApprovalFlowRejection.builder()
                                .rejecter(new com.commercetools.api.models.business_unit.AssociateImpl()) },
                new Object[] { "rejectedAt",
                        ApprovalFlowRejection.builder().rejectedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "reason", ApprovalFlowRejection.builder().reason("reason") } };
    }

    @Test
    public void rejecter() {
        ApprovalFlowRejection value = ApprovalFlowRejection.of();
        value.setRejecter(new com.commercetools.api.models.business_unit.AssociateImpl());
        Assertions.assertThat(value.getRejecter())
                .isEqualTo(new com.commercetools.api.models.business_unit.AssociateImpl());
    }

    @Test
    public void rejectedAt() {
        ApprovalFlowRejection value = ApprovalFlowRejection.of();
        value.setRejectedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getRejectedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void reason() {
        ApprovalFlowRejection value = ApprovalFlowRejection.of();
        value.setReason("reason");
        Assertions.assertThat(value.getReason()).isEqualTo("reason");
    }
}
