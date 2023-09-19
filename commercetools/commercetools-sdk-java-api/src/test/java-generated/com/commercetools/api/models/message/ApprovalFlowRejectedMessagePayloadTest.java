
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
public class ApprovalFlowRejectedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalFlowRejectedMessagePayloadBuilder builder) {
        ApprovalFlowRejectedMessagePayload approvalFlowRejectedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowRejectedMessagePayload)
                .isInstanceOf(ApprovalFlowRejectedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalFlowRejectedMessagePayload.builder()
                        .associate(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { ApprovalFlowRejectedMessagePayload.builder().rejectionReason("rejectionReason") },
                new Object[] { ApprovalFlowRejectedMessagePayload.builder()
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
