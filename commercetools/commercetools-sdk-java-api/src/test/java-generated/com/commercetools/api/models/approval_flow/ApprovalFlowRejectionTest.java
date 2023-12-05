
package com.commercetools.api.models.approval_flow;

import java.time.ZonedDateTime;

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
public class ApprovalFlowRejectionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalFlowRejectionBuilder builder) {
        ApprovalFlowRejection approvalFlowRejection = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowRejection).isInstanceOf(ApprovalFlowRejection.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalFlowRejection.builder()
                        .rejecter(new com.commercetools.api.models.business_unit.AssociateImpl()) },
                new Object[] { ApprovalFlowRejection.builder().rejectedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ApprovalFlowRejection.builder().reason("reason") } };
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
