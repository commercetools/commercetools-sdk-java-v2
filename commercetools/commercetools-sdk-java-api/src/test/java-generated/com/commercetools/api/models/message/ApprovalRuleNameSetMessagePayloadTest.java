
package com.commercetools.api.models.message;

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
public class ApprovalRuleNameSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleNameSetMessagePayloadBuilder builder) {
        ApprovalRuleNameSetMessagePayload approvalRuleNameSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleNameSetMessagePayload).isInstanceOf(ApprovalRuleNameSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRuleNameSetMessagePayload.builder().name("name") },
                new Object[] { ApprovalRuleNameSetMessagePayload.builder().oldName("oldName") } };
    }

    @Test
    public void name() {
        ApprovalRuleNameSetMessagePayload value = ApprovalRuleNameSetMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void oldName() {
        ApprovalRuleNameSetMessagePayload value = ApprovalRuleNameSetMessagePayload.of();
        value.setOldName("oldName");
        Assertions.assertThat(value.getOldName()).isEqualTo("oldName");
    }
}
