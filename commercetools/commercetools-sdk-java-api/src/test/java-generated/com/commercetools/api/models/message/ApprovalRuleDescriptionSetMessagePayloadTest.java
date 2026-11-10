
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleDescriptionSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleDescriptionSetMessagePayloadBuilder builder) {
        ApprovalRuleDescriptionSetMessagePayload approvalRuleDescriptionSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleDescriptionSetMessagePayload)
                .isInstanceOf(ApprovalRuleDescriptionSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "description",
                        ApprovalRuleDescriptionSetMessagePayload.builder().description("description") },
                new Object[] { "oldDescription",
                        ApprovalRuleDescriptionSetMessagePayload.builder().oldDescription("oldDescription") } };
    }

    @Test
    public void description() {
        ApprovalRuleDescriptionSetMessagePayload value = ApprovalRuleDescriptionSetMessagePayload.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void oldDescription() {
        ApprovalRuleDescriptionSetMessagePayload value = ApprovalRuleDescriptionSetMessagePayload.of();
        value.setOldDescription("oldDescription");
        Assertions.assertThat(value.getOldDescription()).isEqualTo("oldDescription");
    }
}
