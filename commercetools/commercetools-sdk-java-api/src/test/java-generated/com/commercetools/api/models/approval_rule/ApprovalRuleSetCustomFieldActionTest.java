
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
public class ApprovalRuleSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleSetCustomFieldActionBuilder builder) {
        ApprovalRuleSetCustomFieldAction approvalRuleSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetCustomFieldAction).isInstanceOf(ApprovalRuleSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRuleSetCustomFieldAction.builder().name("name") },
                new Object[] { ApprovalRuleSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        ApprovalRuleSetCustomFieldAction value = ApprovalRuleSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ApprovalRuleSetCustomFieldAction value = ApprovalRuleSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
