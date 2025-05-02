
package com.commercetools.api.models.common;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, UpdateBuilder builder) {
        Update update = builder.buildUnchecked();
        Assertions.assertThat(update).isInstanceOf(Update.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", Update.builder().version(2L) },
                new Object[] { "actions", Update.builder()
                        .actions(
                            Collections.singletonList(new com.commercetools.api.models.common.UpdateActionImpl())) } };
    }

    @Test
    public void version() {
        Update value = Update.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        Update value = Update.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.common.UpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.UpdateActionImpl()));
    }
}
