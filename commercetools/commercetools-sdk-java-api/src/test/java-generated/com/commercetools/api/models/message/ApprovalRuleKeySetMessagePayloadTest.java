
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleKeySetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleKeySetMessagePayloadBuilder builder) {
        ApprovalRuleKeySetMessagePayload approvalRuleKeySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleKeySetMessagePayload).isInstanceOf(ApprovalRuleKeySetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ApprovalRuleKeySetMessagePayload.builder().key("key") },
                new Object[] { "oldKey", ApprovalRuleKeySetMessagePayload.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        ApprovalRuleKeySetMessagePayload value = ApprovalRuleKeySetMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        ApprovalRuleKeySetMessagePayload value = ApprovalRuleKeySetMessagePayload.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
