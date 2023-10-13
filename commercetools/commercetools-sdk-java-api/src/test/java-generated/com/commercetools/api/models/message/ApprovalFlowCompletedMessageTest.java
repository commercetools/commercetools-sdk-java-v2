
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
public class ApprovalFlowCompletedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalFlowCompletedMessageBuilder builder) {
        ApprovalFlowCompletedMessage approvalFlowCompletedMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowCompletedMessage).isInstanceOf(ApprovalFlowCompletedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalFlowCompletedMessage.builder()
                        .status(com.commercetools.api.models.approval_flow.ApprovalFlowStatus.findEnum("Pending")) },
                new Object[] { ApprovalFlowCompletedMessage.builder()
                        .order(new com.commercetools.api.models.order.OrderReferenceImpl()) } };
    }

    @Test
    public void status() {
        ApprovalFlowCompletedMessage value = ApprovalFlowCompletedMessage.of();
        value.setStatus(com.commercetools.api.models.approval_flow.ApprovalFlowStatus.findEnum("Pending"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.approval_flow.ApprovalFlowStatus.findEnum("Pending"));
    }

    @Test
    public void order() {
        ApprovalFlowCompletedMessage value = ApprovalFlowCompletedMessage.of();
        value.setOrder(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }
}
