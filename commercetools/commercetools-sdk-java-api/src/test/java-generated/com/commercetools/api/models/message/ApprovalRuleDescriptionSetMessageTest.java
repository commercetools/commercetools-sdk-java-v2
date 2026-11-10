
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleDescriptionSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleDescriptionSetMessageBuilder builder) {
        ApprovalRuleDescriptionSetMessage approvalRuleDescriptionSetMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleDescriptionSetMessage).isInstanceOf(ApprovalRuleDescriptionSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "description", ApprovalRuleDescriptionSetMessage.builder().description("description") },
                new Object[] { "oldDescription",
                        ApprovalRuleDescriptionSetMessage.builder().oldDescription("oldDescription") } };
    }

    @Test
    public void description() {
        ApprovalRuleDescriptionSetMessage value = ApprovalRuleDescriptionSetMessage.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void oldDescription() {
        ApprovalRuleDescriptionSetMessage value = ApprovalRuleDescriptionSetMessage.of();
        value.setOldDescription("oldDescription");
        Assertions.assertThat(value.getOldDescription()).isEqualTo("oldDescription");
    }
}
