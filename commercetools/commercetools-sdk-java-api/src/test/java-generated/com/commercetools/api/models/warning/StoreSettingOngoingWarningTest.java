
package com.commercetools.api.models.warning;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSettingOngoingWarningTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSettingOngoingWarningBuilder builder) {
        StoreSettingOngoingWarning storeSettingOngoingWarning = builder.buildUnchecked();
        Assertions.assertThat(storeSettingOngoingWarning).isInstanceOf(StoreSettingOngoingWarning.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", StoreSettingOngoingWarning.builder().message("message") } };
    }

    @Test
    public void message() {
        StoreSettingOngoingWarning value = StoreSettingOngoingWarning.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
