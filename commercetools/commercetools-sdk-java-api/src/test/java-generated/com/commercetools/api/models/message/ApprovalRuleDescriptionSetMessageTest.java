
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
public class ApprovalRuleDescriptionSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleDescriptionSetMessageBuilder builder) {
        ApprovalRuleDescriptionSetMessage approvalRuleDescriptionSetMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleDescriptionSetMessage).isInstanceOf(ApprovalRuleDescriptionSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRuleDescriptionSetMessage.builder().description("description") },
                new Object[] { ApprovalRuleDescriptionSetMessage.builder().oldDescription("oldDescription") } };
    }

    @Test
    public void description() {
        ApprovalRuleDescriptionSetMessage value = ApprovalRuleDescriptionSetMessage.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void oldDescription() {
        ApprovalRuleDescriptionSetMessage value = ApprovalRuleDescriptionSetMessage.of();
        value.setOldDescription("oldDescription");
        Assertions.assertThat(value.getOldDescription()).isEqualTo("oldDescription");
    }
}
