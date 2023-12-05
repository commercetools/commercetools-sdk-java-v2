
package com.commercetools.importapi.models.importcontainers;

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
public class ImportContainerTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportContainerBuilder builder) {
        ImportContainer importContainer = builder.buildUnchecked();
        Assertions.assertThat(importContainer).isInstanceOf(ImportContainer.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportContainer.builder().key("key") },
                new Object[] {
                        ImportContainer.builder()
                                .resourceType(com.commercetools.importapi.models.common.ImportResourceType
                                        .findEnum("category")) },
                new Object[] { ImportContainer.builder().version(2L) },
                new Object[] { ImportContainer.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ImportContainer.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void key() {
        ImportContainer value = ImportContainer.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void resourceType() {
        ImportContainer value = ImportContainer.of();
        value.setResourceType(com.commercetools.importapi.models.common.ImportResourceType.findEnum("category"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(com.commercetools.importapi.models.common.ImportResourceType.findEnum("category"));
    }

    @Test
    public void version() {
        ImportContainer value = ImportContainer.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        ImportContainer value = ImportContainer.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        ImportContainer value = ImportContainer.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
