
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
public class ApprovalFlowApprovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalFlowApprovedMessageBuilder builder) {
        ApprovalFlowApprovedMessage approvalFlowApprovedMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowApprovedMessage).isInstanceOf(ApprovalFlowApprovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalFlowApprovedMessage.builder()
                        .associate(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { ApprovalFlowApprovedMessage.builder()
                        .order(new com.commercetools.api.models.order.OrderReferenceImpl()) } };
    }

    @Test
    public void associate() {
        ApprovalFlowApprovedMessage value = ApprovalFlowApprovedMessage.of();
        value.setAssociate(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void order() {
        ApprovalFlowApprovedMessage value = ApprovalFlowApprovedMessage.of();
        value.setOrder(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }
}
