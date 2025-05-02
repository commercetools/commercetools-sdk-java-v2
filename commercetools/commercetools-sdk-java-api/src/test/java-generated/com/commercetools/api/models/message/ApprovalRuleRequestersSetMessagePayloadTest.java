
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleRequestersSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleRequestersSetMessagePayloadBuilder builder) {
        ApprovalRuleRequestersSetMessagePayload approvalRuleRequestersSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleRequestersSetMessagePayload)
                .isInstanceOf(ApprovalRuleRequestersSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "requesters",
                        ApprovalRuleRequestersSetMessagePayload.builder()
                                .requesters(Collections.singletonList(
                                    new com.commercetools.api.models.approval_rule.RuleRequesterImpl())) },
                new Object[] { "oldRequesters",
                        ApprovalRuleRequestersSetMessagePayload.builder()
                                .oldRequesters(Collections.singletonList(
                                    new com.commercetools.api.models.approval_rule.RuleRequesterImpl())) } };
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
