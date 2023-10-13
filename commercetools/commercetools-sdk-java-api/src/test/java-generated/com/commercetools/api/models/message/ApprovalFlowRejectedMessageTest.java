
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
public class ApprovalFlowRejectedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalFlowRejectedMessageBuilder builder) {
        ApprovalFlowRejectedMessage approvalFlowRejectedMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowRejectedMessage).isInstanceOf(ApprovalFlowRejectedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalFlowRejectedMessage.builder()
                        .associate(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { ApprovalFlowRejectedMessage.builder().rejectionReason("rejectionReason") },
                new Object[] { ApprovalFlowRejectedMessage.builder()
                        .order(new com.commercetools.api.models.order.OrderReferenceImpl()) } };
    }

    @Test
    public void associate() {
        ApprovalFlowRejectedMessage value = ApprovalFlowRejectedMessage.of();
        value.setAssociate(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void rejectionReason() {
        ApprovalFlowRejectedMessage value = ApprovalFlowRejectedMessage.of();
        value.setRejectionReason("rejectionReason");
        Assertions.assertThat(value.getRejectionReason()).isEqualTo("rejectionReason");
    }

    @Test
    public void order() {
        ApprovalFlowRejectedMessage value = ApprovalFlowRejectedMessage.of();
        value.setOrder(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }
}
