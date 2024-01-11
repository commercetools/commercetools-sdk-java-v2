
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
public class ApprovalFlowSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalFlowSetCustomFieldActionBuilder builder) {
        ApprovalFlowSetCustomFieldAction approvalFlowSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowSetCustomFieldAction).isInstanceOf(ApprovalFlowSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalFlowSetCustomFieldAction.builder().name("name") },
                new Object[] { ApprovalFlowSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        ApprovalFlowSetCustomFieldAction value = ApprovalFlowSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ApprovalFlowSetCustomFieldAction value = ApprovalFlowSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
