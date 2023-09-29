
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
public class ApprovalRuleKeySetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleKeySetMessageBuilder builder) {
        ApprovalRuleKeySetMessage approvalRuleKeySetMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleKeySetMessage).isInstanceOf(ApprovalRuleKeySetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRuleKeySetMessage.builder().key("key") },
                new Object[] { ApprovalRuleKeySetMessage.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        ApprovalRuleKeySetMessage value = ApprovalRuleKeySetMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        ApprovalRuleKeySetMessage value = ApprovalRuleKeySetMessage.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
