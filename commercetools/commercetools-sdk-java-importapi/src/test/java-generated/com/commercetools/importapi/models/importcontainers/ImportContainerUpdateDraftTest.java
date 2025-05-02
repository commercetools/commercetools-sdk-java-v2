
package com.commercetools.importapi.models.importcontainers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportContainerUpdateDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportContainerUpdateDraftBuilder builder) {
        ImportContainerUpdateDraft importContainerUpdateDraft = builder.buildUnchecked();
        Assertions.assertThat(importContainerUpdateDraft).isInstanceOf(ImportContainerUpdateDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ImportContainerUpdateDraft.builder().version(2L) },
                new Object[] { "resourceType", ImportContainerUpdateDraft.builder()
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
