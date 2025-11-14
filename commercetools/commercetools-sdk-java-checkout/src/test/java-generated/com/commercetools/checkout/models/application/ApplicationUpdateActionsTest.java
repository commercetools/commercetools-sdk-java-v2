
package com.commercetools.checkout.models.application;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApplicationUpdateActionsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApplicationUpdateActionsBuilder builder) {
        ApplicationUpdateActions applicationUpdateActions = builder.buildUnchecked();
        Assertions.assertThat(applicationUpdateActions).isInstanceOf(ApplicationUpdateActions.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ApplicationUpdateActions.builder().version(2) },
                new Object[] { "actions", ApplicationUpdateActions.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.checkout.models.application.ApplicationUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ApplicationUpdateActions value = ApplicationUpdateActions.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void actions() {
        ApplicationUpdateActions value = ApplicationUpdateActions.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.checkout.models.application.ApplicationUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.checkout.models.application.ApplicationUpdateActionImpl()));
    }
}
