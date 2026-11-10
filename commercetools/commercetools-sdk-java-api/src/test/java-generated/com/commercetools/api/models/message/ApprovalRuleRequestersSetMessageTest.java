
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleRequestersSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleRequestersSetMessageBuilder builder) {
        ApprovalRuleRequestersSetMessage approvalRuleRequestersSetMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleRequestersSetMessage).isInstanceOf(ApprovalRuleRequestersSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "requesters",
                        ApprovalRuleRequestersSetMessage.builder()
                                .requesters(Collections.singletonList(
                                    new com.commercetools.api.models.approval_rule.RuleRequesterImpl())) },
                new Object[] { "oldRequesters",
                        ApprovalRuleRequestersSetMessage.builder()
                                .oldRequesters(Collections.singletonList(
                                    new com.commercetools.api.models.approval_rule.RuleRequesterImpl())) } };
    }

    @Test
    public void requesters() {
        ApprovalRuleRequestersSetMessage value = ApprovalRuleRequestersSetMessage.of();
        value.setRequesters(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterImpl()));
        Assertions.assertThat(value.getRequesters())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterImpl()));
    }

    @Test
    public void oldRequesters() {
        ApprovalRuleRequestersSetMessage value = ApprovalRuleRequestersSetMessage.of();
        value.setOldRequesters(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterImpl()));
        Assertions.assertThat(value.getOldRequesters())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterImpl()));
    }
}
