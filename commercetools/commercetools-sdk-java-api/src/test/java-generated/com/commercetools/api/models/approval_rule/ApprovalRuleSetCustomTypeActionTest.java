
package com.commercetools.api.models.approval_rule;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleSetCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleSetCustomTypeActionBuilder builder) {
        ApprovalRuleSetCustomTypeAction approvalRuleSetCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetCustomTypeAction).isInstanceOf(ApprovalRuleSetCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "type",
                        ApprovalRuleSetCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", ApprovalRuleSetCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void type() {
        ApprovalRuleSetCustomTypeAction value = ApprovalRuleSetCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        ApprovalRuleSetCustomTypeAction value = ApprovalRuleSetCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
