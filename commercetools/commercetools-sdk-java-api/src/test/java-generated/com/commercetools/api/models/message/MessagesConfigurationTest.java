
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MessagesConfigurationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MessagesConfigurationBuilder builder) {
        MessagesConfiguration messagesConfiguration = builder.buildUnchecked();
        Assertions.assertThat(messagesConfiguration).isInstanceOf(MessagesConfiguration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "enabled", MessagesConfiguration.builder().enabled(true) },
                new Object[] { "deleteDaysAfterCreation",
                        MessagesConfiguration.builder().deleteDaysAfterCreation(4) } };
    }

    @Test
    public void enabled() {
        MessagesConfiguration value = MessagesConfiguration.of();
        value.setEnabled(true);
        Assertions.assertThat(value.getEnabled()).isEqualTo(true);
    }

    @Test
    public void deleteDaysAfterCreation() {
        MessagesConfiguration value = MessagesConfiguration.of();
        value.setDeleteDaysAfterCreation(4);
        Assertions.assertThat(value.getDeleteDaysAfterCreation()).isEqualTo(4);
    }
}
