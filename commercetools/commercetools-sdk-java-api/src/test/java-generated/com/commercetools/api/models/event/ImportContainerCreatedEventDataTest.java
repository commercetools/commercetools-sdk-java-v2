
package com.commercetools.api.models.event;

import java.time.ZonedDateTime;

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
public class ImportContainerCreatedEventDataTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportContainerCreatedEventDataBuilder builder) {
        ImportContainerCreatedEventData importContainerCreatedEventData = builder.buildUnchecked();
        Assertions.assertThat(importContainerCreatedEventData).isInstanceOf(ImportContainerCreatedEventData.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportContainerCreatedEventData.builder().key("key") },
                new Object[] { ImportContainerCreatedEventData.builder().version(2) },
                new Object[] {
                        ImportContainerCreatedEventData.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ImportContainerCreatedEventData.builder()
                        .lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void key() {
        ImportContainerCreatedEventData value = ImportContainerCreatedEventData.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void version() {
        ImportContainerCreatedEventData value = ImportContainerCreatedEventData.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void createdAt() {
        ImportContainerCreatedEventData value = ImportContainerCreatedEventData.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        ImportContainerCreatedEventData value = ImportContainerCreatedEventData.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
