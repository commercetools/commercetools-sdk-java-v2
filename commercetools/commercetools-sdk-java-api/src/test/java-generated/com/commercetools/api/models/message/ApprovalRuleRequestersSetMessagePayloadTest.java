
package com.commercetools.api.models.message;

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
public class ApprovalRuleRequestersSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleRequestersSetMessagePayloadBuilder builder) {
        ApprovalRuleRequestersSetMessagePayload approvalRuleRequestersSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleRequestersSetMessagePayload)
                .isInstanceOf(ApprovalRuleRequestersSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalRuleRequestersSetMessagePayload.builder()
                        .requesters(Collections
                                .singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterImpl())) },
                new Object[] { ApprovalRuleRequestersSetMessagePayload.builder()
                        .oldRequesters(Collections
                                .singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterImpl())) } };
    }

    @Test
    public void requesters() {
        ApprovalRuleRequestersSetMessagePayload value = ApprovalRuleRequestersSetMessagePayload.of();
        value.setRequesters(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterImpl()));
        Assertions.assertThat(value.getRequesters())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterImpl()));
    }

    @Test
    public void oldRequesters() {
        ApprovalRuleRequestersSetMessagePayload value = ApprovalRuleRequestersSetMessagePayload.of();
        value.setOldRequesters(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterImpl()));
        Assertions.assertThat(value.getOldRequesters())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterImpl()));
    }
}
