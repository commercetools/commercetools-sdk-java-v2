
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeApprovalRuleModeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeApprovalRuleModeChangeBuilder builder) {
        ChangeApprovalRuleModeChange changeApprovalRuleModeChange = builder.buildUnchecked();
        Assertions.assertThat(changeApprovalRuleModeChange).isInstanceOf(ChangeApprovalRuleModeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeApprovalRuleModeChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeApprovalRuleModeChange.builder()
                                .previousValue(com.commercetools.history.models.common.BusinessUnitApprovalRuleMode
                                        .findEnum("Explicit")) },
                new Object[] { "nextValue",
                        ChangeApprovalRuleModeChange.builder()
                                .nextValue(com.commercetools.history.models.common.BusinessUnitApprovalRuleMode
                                        .findEnum("Explicit")) } };
    }

    @Test
    public void change() {
        ChangeApprovalRuleModeChange value = ChangeApprovalRuleModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeApprovalRuleModeChange value = ChangeApprovalRuleModeChange.of();
        value.setPreviousValue(
            com.commercetools.history.models.common.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
    }

    @Test
    public void nextValue() {
        ChangeApprovalRuleModeChange value = ChangeApprovalRuleModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
    }
}
