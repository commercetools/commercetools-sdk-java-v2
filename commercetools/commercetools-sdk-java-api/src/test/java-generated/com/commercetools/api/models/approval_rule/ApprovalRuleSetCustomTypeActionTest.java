
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
public class ApprovalRuleSetCustomTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleSetCustomTypeActionBuilder builder) {
        ApprovalRuleSetCustomTypeAction approvalRuleSetCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetCustomTypeAction).isInstanceOf(ApprovalRuleSetCustomTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalRuleSetCustomTypeAction.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { ApprovalRuleSetCustomTypeAction.builder()
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
