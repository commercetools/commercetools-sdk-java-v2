
package com.commercetools.importapi.models.importcontainers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ImportContainerDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ImportContainerDraftBuilder builder) {
        ImportContainerDraft importContainerDraft = builder.buildUnchecked();
        Assertions.assertThat(importContainerDraft).isInstanceOf(ImportContainerDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ImportContainerDraft.builder().key("key") },
                new Object[] { "resourceType", ImportContainerDraft.builder()
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
