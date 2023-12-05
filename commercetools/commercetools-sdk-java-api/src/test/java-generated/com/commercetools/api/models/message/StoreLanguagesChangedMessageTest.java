
package com.commercetools.api.models.message;

import java.util.Collections;

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
public class StoreLanguagesChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreLanguagesChangedMessageBuilder builder) {
        StoreLanguagesChangedMessage storeLanguagesChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(storeLanguagesChangedMessage).isInstanceOf(StoreLanguagesChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreLanguagesChangedMessage.builder()
                        .addedLanguages(Collections.singletonList("addedLanguages")) },
                new Object[] { StoreLanguagesChangedMessage.builder()
                        .removedLanguages(Collections.singletonList("removedLanguages")) } };
    }

    @Test
    public void addedLanguages() {
        StoreLanguagesChangedMessage value = StoreLanguagesChangedMessage.of();
        value.setAddedLanguages(Collections.singletonList("addedLanguages"));
        Assertions.assertThat(value.getAddedLanguages()).isEqualTo(Collections.singletonList("addedLanguages"));
    }

    @Test
    public void removedLanguages() {
        StoreLanguagesChangedMessage value = StoreLanguagesChangedMessage.of();
        value.setRemovedLanguages(Collections.singletonList("removedLanguages"));
        Assertions.assertThat(value.getRemovedLanguages()).isEqualTo(Collections.singletonList("removedLanguages"));
    }
}
