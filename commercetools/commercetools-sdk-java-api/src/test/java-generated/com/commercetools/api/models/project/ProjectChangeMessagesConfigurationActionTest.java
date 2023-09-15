
package com.commercetools.api.models.project;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ProjectChangeMessagesConfigurationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectChangeMessagesConfigurationActionBuilder builder) {
        ProjectChangeMessagesConfigurationAction projectChangeMessagesConfigurationAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeMessagesConfigurationAction)
                .isInstanceOf(ProjectChangeMessagesConfigurationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectChangeMessagesConfigurationAction.builder()
                .messagesConfiguration(new com.commercetools.api.models.message.MessagesConfigurationDraftImpl()) } };
    }

    @Test
    public void messagesConfiguration() {
        ProjectChangeMessagesConfigurationAction value = ProjectChangeMessagesConfigurationAction.of();
        value.setMessagesConfiguration(new com.commercetools.api.models.message.MessagesConfigurationDraftImpl());
        Assertions.assertThat(value.getMessagesConfiguration())
                .isEqualTo(new com.commercetools.api.models.message.MessagesConfigurationDraftImpl());
    }
}
