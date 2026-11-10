
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetPrivacyPolicyUrlActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetPrivacyPolicyUrlActionBuilder builder) {
        StoreSetPrivacyPolicyUrlAction storeSetPrivacyPolicyUrlAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetPrivacyPolicyUrlAction).isInstanceOf(StoreSetPrivacyPolicyUrlAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "privacyPolicyUrl",
                StoreSetPrivacyPolicyUrlAction.builder().privacyPolicyUrl("privacyPolicyUrl") } };
    }

    @Test
    public void privacyPolicyUrl() {
        StoreSetPrivacyPolicyUrlAction value = StoreSetPrivacyPolicyUrlAction.of();
        value.setPrivacyPolicyUrl("privacyPolicyUrl");
        Assertions.assertThat(value.getPrivacyPolicyUrl()).isEqualTo("privacyPolicyUrl");
    }
}
