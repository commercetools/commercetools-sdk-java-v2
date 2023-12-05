
package com.commercetools.importapi.models.importoperations;

import java.time.ZonedDateTime;
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
public class ImportOperationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportOperationBuilder builder) {
        ImportOperation importOperation = builder.buildUnchecked();
        Assertions.assertThat(importOperation).isInstanceOf(ImportOperation.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportOperation.builder().version(2L) },
                new Object[] { ImportOperation.builder().importContainerKey("importContainerKey") },
                new Object[] { ImportOperation.builder().resourceKey("resourceKey") },
                new Object[] { ImportOperation.builder().id("id") },
                new Object[] { ImportOperation.builder()
                        .state(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing")) },
                new Object[] { ImportOperation.builder().resourceVersion(9L) },
                new Object[] { ImportOperation.builder()
                        .errors(Collections
                                .singletonList(new com.commercetools.importapi.models.errors.ErrorObjectImpl())) },
                new Object[] { ImportOperation.builder()
                        .unresolvedReferences(Collections.singletonList(
                            new com.commercetools.importapi.models.common.UnresolvedReferencesImpl())) },
                new Object[] { ImportOperation.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ImportOperation.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ImportOperation.builder().expiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void version() {
        ImportOperation value = ImportOperation.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void importContainerKey() {
        ImportOperation value = ImportOperation.of();
        value.setImportContainerKey("importContainerKey");
        Assertions.assertThat(value.getImportContainerKey()).isEqualTo("importContainerKey");
    }

    @Test
    public void resourceKey() {
        ImportOperation value = ImportOperation.of();
        value.setResourceKey("resourceKey");
        Assertions.assertThat(value.getResourceKey()).isEqualTo("resourceKey");
    }

    @Test
    public void id() {
        ImportOperation value = ImportOperation.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void state() {
        ImportOperation value = ImportOperation.of();
        value.setState(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing"));
    }

    @Test
    public void resourceVersion() {
        ImportOperation value = ImportOperation.of();
        value.setResourceVersion(9L);
        Assertions.assertThat(value.getResourceVersion()).isEqualTo(9L);
    }

    @Test
    public void errors() {
        ImportOperation value = ImportOperation.of();
        value.setErrors(Collections.singletonList(new com.commercetools.importapi.models.errors.ErrorObjectImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.errors.ErrorObjectImpl()));
    }

    @Test
    public void unresolvedReferences() {
        ImportOperation value = ImportOperation.of();
        value.setUnresolvedReferences(
            Collections.singletonList(new com.commercetools.importapi.models.common.UnresolvedReferencesImpl()));
        Assertions.assertThat(value.getUnresolvedReferences())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.common.UnresolvedReferencesImpl()));
    }

    @Test
    public void createdAt() {
        ImportOperation value = ImportOperation.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        ImportOperation value = ImportOperation.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void expiresAt() {
        ImportOperation value = ImportOperation.of();
        value.setExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
