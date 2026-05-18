
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetApplicationStatusUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetApplicationStatusUpdateActionBuilder builder) {
        SetApplicationStatusUpdateAction setApplicationStatusUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setApplicationStatusUpdateAction).isInstanceOf(SetApplicationStatusUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "status", SetApplicationStatusUpdateAction.builder()
                .status(com.commercetools.checkout.models.application.ApplicationStatus.findEnum("Active")) } };
    }

    @Test
    public void status() {
        SetApplicationStatusUpdateAction value = SetApplicationStatusUpdateAction.of();
        value.setStatus(com.commercetools.checkout.models.application.ApplicationStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.checkout.models.application.ApplicationStatus.findEnum("Active"));
    }
}
