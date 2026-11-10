
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleNameSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleNameSetMessageBuilder builder) {
        ApprovalRuleNameSetMessage approvalRuleNameSetMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleNameSetMessage).isInstanceOf(ApprovalRuleNameSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ApprovalRuleNameSetMessage.builder().name("name") },
                new Object[] { "oldName", ApprovalRuleNameSetMessage.builder().oldName("oldName") } };
    }

    @Test
    public void name() {
        ApprovalRuleNameSetMessage value = ApprovalRuleNameSetMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void oldName() {
        ApprovalRuleNameSetMessage value = ApprovalRuleNameSetMessage.of();
        value.setOldName("oldName");
        Assertions.assertThat(value.getOldName()).isEqualTo("oldName");
    }
}
