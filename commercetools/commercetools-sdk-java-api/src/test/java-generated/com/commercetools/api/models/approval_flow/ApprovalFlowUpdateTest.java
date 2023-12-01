
package com.commercetools.api.models.approval_flow;

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
public class ApprovalFlowUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalFlowUpdateBuilder builder) {
        ApprovalFlowUpdate approvalFlowUpdate = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowUpdate).isInstanceOf(ApprovalFlowUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalFlowUpdate.builder().version(2L) },
                new Object[] { ApprovalFlowUpdate.builder()
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
