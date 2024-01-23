
package com.commercetools.api.models.approval_flow;

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
public class ApprovalFlowSetCustomTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalFlowSetCustomTypeActionBuilder builder) {
        ApprovalFlowSetCustomTypeAction approvalFlowSetCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowSetCustomTypeAction).isInstanceOf(ApprovalFlowSetCustomTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalFlowSetCustomTypeAction.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { ApprovalFlowSetCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void type() {
        ApprovalFlowSetCustomTypeAction value = ApprovalFlowSetCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        ApprovalFlowSetCustomTypeAction value = ApprovalFlowSetCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
