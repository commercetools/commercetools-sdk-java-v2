
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
public class ApprovalRuleUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleUpdateBuilder builder) {
        ApprovalRuleUpdate approvalRuleUpdate = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleUpdate).isInstanceOf(ApprovalRuleUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRuleUpdate.builder().version(2L) },
                new Object[] { ApprovalRuleUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.approval_rule.ApprovalRuleUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ApprovalRuleUpdate value = ApprovalRuleUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ApprovalRuleUpdate value = ApprovalRuleUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.ApprovalRuleUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.ApprovalRuleUpdateActionImpl()));
    }
}
