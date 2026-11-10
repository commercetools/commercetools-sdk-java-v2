
package com.commercetools.api.models.approval_flow;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalFlowUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalFlowUpdateBuilder builder) {
        ApprovalFlowUpdate approvalFlowUpdate = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowUpdate).isInstanceOf(ApprovalFlowUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ApprovalFlowUpdate.builder().version(2L) },
                new Object[] { "actions",
                        ApprovalFlowUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.approval_flow.ApprovalFlowUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ApprovalFlowUpdate value = ApprovalFlowUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ApprovalFlowUpdate value = ApprovalFlowUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.approval_flow.ApprovalFlowUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.approval_flow.ApprovalFlowUpdateActionImpl()));
    }
}
