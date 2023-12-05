
package com.commercetools.api.models.message;

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
public class MessagesConfigurationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MessagesConfigurationBuilder builder) {
        MessagesConfiguration messagesConfiguration = builder.buildUnchecked();
        Assertions.assertThat(messagesConfiguration).isInstanceOf(MessagesConfiguration.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MessagesConfiguration.builder().enabled(true) },
                new Object[] { MessagesConfiguration.builder().deleteDaysAfterCreation(4) } };
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
