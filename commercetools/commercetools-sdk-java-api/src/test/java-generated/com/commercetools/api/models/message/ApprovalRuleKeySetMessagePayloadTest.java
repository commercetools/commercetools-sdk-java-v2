
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
public class ApprovalRuleKeySetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleKeySetMessagePayloadBuilder builder) {
        ApprovalRuleKeySetMessagePayload approvalRuleKeySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleKeySetMessagePayload).isInstanceOf(ApprovalRuleKeySetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRuleKeySetMessagePayload.builder().key("key") },
                new Object[] { ApprovalRuleKeySetMessagePayload.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        ApprovalRuleKeySetMessagePayload value = ApprovalRuleKeySetMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        ApprovalRuleKeySetMessagePayload value = ApprovalRuleKeySetMessagePayload.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
