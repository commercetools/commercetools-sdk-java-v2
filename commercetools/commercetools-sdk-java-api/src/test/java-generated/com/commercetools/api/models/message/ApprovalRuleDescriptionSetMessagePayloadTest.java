
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
public class ApprovalRuleDescriptionSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleDescriptionSetMessagePayloadBuilder builder) {
        ApprovalRuleDescriptionSetMessagePayload approvalRuleDescriptionSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleDescriptionSetMessagePayload)
                .isInstanceOf(ApprovalRuleDescriptionSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalRuleDescriptionSetMessagePayload.builder().description("description") },
                new Object[] { ApprovalRuleDescriptionSetMessagePayload.builder().oldDescription("oldDescription") } };
    }

    @Test
    public void description() {
        ApprovalRuleDescriptionSetMessagePayload value = ApprovalRuleDescriptionSetMessagePayload.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void oldDescription() {
        ApprovalRuleDescriptionSetMessagePayload value = ApprovalRuleDescriptionSetMessagePayload.of();
        value.setOldDescription("oldDescription");
        Assertions.assertThat(value.getOldDescription()).isEqualTo("oldDescription");
    }
}
