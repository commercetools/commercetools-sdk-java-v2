
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StorePrivacyPolicyUrlSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StorePrivacyPolicyUrlSetMessageBuilder builder) {
        StorePrivacyPolicyUrlSetMessage storePrivacyPolicyUrlSetMessage = builder.buildUnchecked();
        Assertions.assertThat(storePrivacyPolicyUrlSetMessage).isInstanceOf(StorePrivacyPolicyUrlSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "privacyPolicyUrl",
                StorePrivacyPolicyUrlSetMessage.builder().privacyPolicyUrl("privacyPolicyUrl") } };
    }

    @Test
    public void privacyPolicyUrl() {
        StorePrivacyPolicyUrlSetMessage value = StorePrivacyPolicyUrlSetMessage.of();
        value.setPrivacyPolicyUrl("privacyPolicyUrl");
        Assertions.assertThat(value.getPrivacyPolicyUrl()).isEqualTo("privacyPolicyUrl");
    }
}
