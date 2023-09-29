
package com.commercetools.api.models.approval_rule;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ApprovalRuleSetRequestersActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleSetRequestersActionBuilder builder) {
        ApprovalRuleSetRequestersAction approvalRuleSetRequestersAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetRequestersAction).isInstanceOf(ApprovalRuleSetRequestersAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRuleSetRequestersAction.builder()
                .requesters(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterDraftImpl())) } };
    }

    @Test
    public void requesters() {
        ApprovalRuleSetRequestersAction value = ApprovalRuleSetRequestersAction.of();
        value.setRequesters(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterDraftImpl()));
        Assertions.assertThat(value.getRequesters())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterDraftImpl()));
    }
}
