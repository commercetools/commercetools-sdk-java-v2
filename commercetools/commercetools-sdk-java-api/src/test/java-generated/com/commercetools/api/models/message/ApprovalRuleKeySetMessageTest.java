
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleKeySetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleKeySetMessageBuilder builder) {
        ApprovalRuleKeySetMessage approvalRuleKeySetMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleKeySetMessage).isInstanceOf(ApprovalRuleKeySetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ApprovalRuleKeySetMessage.builder().key("key") },
                new Object[] { "oldKey", ApprovalRuleKeySetMessage.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        ApprovalRuleKeySetMessage value = ApprovalRuleKeySetMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        ApprovalRuleKeySetMessage value = ApprovalRuleKeySetMessage.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
