
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
public class StoreLanguagesChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StoreLanguagesChangedMessagePayloadBuilder builder) {
        StoreLanguagesChangedMessagePayload storeLanguagesChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeLanguagesChangedMessagePayload)
                .isInstanceOf(StoreLanguagesChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StoreLanguagesChangedMessagePayload.builder()
                        .addedLanguages(Collections.singletonList("addedLanguages")) },
                new Object[] { StoreLanguagesChangedMessagePayload.builder()
                        .removedLanguages(Collections.singletonList("removedLanguages")) } };
    }

    @Test
    public void addedLanguages() {
        StoreLanguagesChangedMessagePayload value = StoreLanguagesChangedMessagePayload.of();
        value.setAddedLanguages(Collections.singletonList("addedLanguages"));
        Assertions.assertThat(value.getAddedLanguages()).isEqualTo(Collections.singletonList("addedLanguages"));
    }

    @Test
    public void removedLanguages() {
        StoreLanguagesChangedMessagePayload value = StoreLanguagesChangedMessagePayload.of();
        value.setRemovedLanguages(Collections.singletonList("removedLanguages"));
        Assertions.assertThat(value.getRemovedLanguages()).isEqualTo(Collections.singletonList("removedLanguages"));
    }
}
