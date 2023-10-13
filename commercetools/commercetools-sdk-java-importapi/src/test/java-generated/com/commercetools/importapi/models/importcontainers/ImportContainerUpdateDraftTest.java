
package com.commercetools.importapi.models.importcontainers;

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
public class ImportContainerUpdateDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportContainerUpdateDraftBuilder builder) {
        ImportContainerUpdateDraft importContainerUpdateDraft = builder.buildUnchecked();
        Assertions.assertThat(importContainerUpdateDraft).isInstanceOf(ImportContainerUpdateDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportContainerUpdateDraft.builder().version(2L) },
                new Object[] { ImportContainerUpdateDraft.builder()
                        .resourceType(
                            com.commercetools.importapi.models.common.ImportResourceType.findEnum("category")) } };
    }

    @Test
    public void version() {
        ImportContainerUpdateDraft value = ImportContainerUpdateDraft.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void resourceType() {
        ImportContainerUpdateDraft value = ImportContainerUpdateDraft.of();
        value.setResourceType(com.commercetools.importapi.models.common.ImportResourceType.findEnum("category"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(com.commercetools.importapi.models.common.ImportResourceType.findEnum("category"));
    }
}
