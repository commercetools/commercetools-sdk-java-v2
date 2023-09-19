
package com.commercetools.api.models.message;

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
public class ApprovalFlowCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalFlowCreatedMessageBuilder builder) {
        ApprovalFlowCreatedMessage approvalFlowCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowCreatedMessage).isInstanceOf(ApprovalFlowCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalFlowCreatedMessage.builder()
                .approvalFlow(new com.commercetools.api.models.approval_flow.ApprovalFlowImpl()) } };
    }

    @Test
    public void approvalFlow() {
        ApprovalFlowCreatedMessage value = ApprovalFlowCreatedMessage.of();
        value.setApprovalFlow(new com.commercetools.api.models.approval_flow.ApprovalFlowImpl());
        Assertions.assertThat(value.getApprovalFlow())
                .isEqualTo(new com.commercetools.api.models.approval_flow.ApprovalFlowImpl());
    }
}
