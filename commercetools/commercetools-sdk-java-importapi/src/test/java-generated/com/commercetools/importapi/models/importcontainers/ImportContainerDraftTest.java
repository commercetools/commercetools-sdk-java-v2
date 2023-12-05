
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
public class ImportContainerDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImportContainerDraftBuilder builder) {
        ImportContainerDraft importContainerDraft = builder.buildUnchecked();
        Assertions.assertThat(importContainerDraft).isInstanceOf(ImportContainerDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImportContainerDraft.builder().key("key") },
                new Object[] { ImportContainerDraft.builder()
                        .resourceType(
                            com.commercetools.importapi.models.common.ImportResourceType.findEnum("category")) } };
    }

    @Test
    public void key() {
        ImportContainerDraft value = ImportContainerDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void resourceType() {
        ImportContainerDraft value = ImportContainerDraft.of();
        value.setResourceType(com.commercetools.importapi.models.common.ImportResourceType.findEnum("category"));
        Assertions.assertThat(value.getResourceType())
                .isEqualTo(com.commercetools.importapi.models.common.ImportResourceType.findEnum("category"));
    }
}
