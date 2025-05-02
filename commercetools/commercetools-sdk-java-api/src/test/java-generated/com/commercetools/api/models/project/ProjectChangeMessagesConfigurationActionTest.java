
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeMessagesConfigurationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeMessagesConfigurationActionBuilder builder) {
        ProjectChangeMessagesConfigurationAction projectChangeMessagesConfigurationAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeMessagesConfigurationAction)
                .isInstanceOf(ProjectChangeMessagesConfigurationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "messagesConfiguration",
                ProjectChangeMessagesConfigurationAction.builder()
                        .messagesConfiguration(
                            new com.commercetools.api.models.message.MessagesConfigurationDraftImpl()) } };
    }

    @Test
    public void messagesConfiguration() {
        ProjectChangeMessagesConfigurationAction value = ProjectChangeMessagesConfigurationAction.of();
        value.setMessagesConfiguration(new com.commercetools.api.models.message.MessagesConfigurationDraftImpl());
        Assertions.assertThat(value.getMessagesConfiguration())
                .isEqualTo(new com.commercetools.api.models.message.MessagesConfigurationDraftImpl());
    }
}
