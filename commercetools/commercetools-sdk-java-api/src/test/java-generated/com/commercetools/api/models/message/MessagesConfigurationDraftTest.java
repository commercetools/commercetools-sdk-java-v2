
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MessagesConfigurationDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MessagesConfigurationDraftBuilder builder) {
        MessagesConfigurationDraft messagesConfigurationDraft = builder.buildUnchecked();
        Assertions.assertThat(messagesConfigurationDraft).isInstanceOf(MessagesConfigurationDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "enabled", MessagesConfigurationDraft.builder().enabled(true) },
                new Object[] { "deleteDaysAfterCreation",
                        MessagesConfigurationDraft.builder().deleteDaysAfterCreation(4) } };
    }

    @Test
    public void enabled() {
        MessagesConfigurationDraft value = MessagesConfigurationDraft.of();
        value.setEnabled(true);
        Assertions.assertThat(value.getEnabled()).isEqualTo(true);
    }

    @Test
    public void deleteDaysAfterCreation() {
        MessagesConfigurationDraft value = MessagesConfigurationDraft.of();
        value.setDeleteDaysAfterCreation(4);
        Assertions.assertThat(value.getDeleteDaysAfterCreation()).isEqualTo(4);
    }
}
