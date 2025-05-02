
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleNameSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleNameSetMessagePayloadBuilder builder) {
        ApprovalRuleNameSetMessagePayload approvalRuleNameSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleNameSetMessagePayload).isInstanceOf(ApprovalRuleNameSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ApprovalRuleNameSetMessagePayload.builder().name("name") },
                new Object[] { "oldName", ApprovalRuleNameSetMessagePayload.builder().oldName("oldName") } };
    }

    @Test
    public void name() {
        ApprovalRuleNameSetMessagePayload value = ApprovalRuleNameSetMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void oldName() {
        ApprovalRuleNameSetMessagePayload value = ApprovalRuleNameSetMessagePayload.of();
        value.setOldName("oldName");
        Assertions.assertThat(value.getOldName()).isEqualTo("oldName");
    }
}
