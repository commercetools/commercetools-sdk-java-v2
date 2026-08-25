
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StorePrivacyPolicyUrlSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StorePrivacyPolicyUrlSetMessagePayloadBuilder builder) {
        StorePrivacyPolicyUrlSetMessagePayload storePrivacyPolicyUrlSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storePrivacyPolicyUrlSetMessagePayload)
                .isInstanceOf(StorePrivacyPolicyUrlSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "privacyPolicyUrl",
                StorePrivacyPolicyUrlSetMessagePayload.builder().privacyPolicyUrl("privacyPolicyUrl") } };
    }

    @Test
    public void privacyPolicyUrl() {
        StorePrivacyPolicyUrlSetMessagePayload value = StorePrivacyPolicyUrlSetMessagePayload.of();
        value.setPrivacyPolicyUrl("privacyPolicyUrl");
        Assertions.assertThat(value.getPrivacyPolicyUrl()).isEqualTo("privacyPolicyUrl");
    }
}
