
package com.commercetools.api.models.approval_rule;

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
public class ApprovalRuleSetKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleSetKeyActionBuilder builder) {
        ApprovalRuleSetKeyAction approvalRuleSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetKeyAction).isInstanceOf(ApprovalRuleSetKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRuleSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ApprovalRuleSetKeyAction value = ApprovalRuleSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
