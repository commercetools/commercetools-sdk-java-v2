
package com.commercetools.api.models.approval_flow;

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
public class ApprovalFlowRejectActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalFlowRejectActionBuilder builder) {
        ApprovalFlowRejectAction approvalFlowRejectAction = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowRejectAction).isInstanceOf(ApprovalFlowRejectAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalFlowRejectAction.builder().reason("reason") } };
    }

    @Test
    public void reason() {
        ApprovalFlowRejectAction value = ApprovalFlowRejectAction.of();
        value.setReason("reason");
        Assertions.assertThat(value.getReason()).isEqualTo("reason");
    }
}
