
package com.commercetools.importapi.importcontainer;

import static com.commercetools.importapi.utils.ImportApiTestUtils.assertEventually;

import java.util.function.Consumer;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importcontainers.ImportContainer;
import com.commercetools.importapi.models.importcontainers.ImportContainerDraft;
import com.commercetools.importapi.models.importcontainers.ImportContainerDraftBuilder;
import com.commercetools.importapi.utils.ImportApiTestUtils;

import org.junit.jupiter.api.Assertions;

public class ImportContainerFixtures {
    public static void withContainer(final Consumer<ImportContainer> consumer) {

        ImportContainer importContainer = createImportContainer();
        try {
            consumer.accept(importContainer);
        }
        finally {
            deleteImportContainer(importContainer.getKey());
        }
    }

    public static void deleteImportContainer(final String key) {
        assertEventually(() -> {
            ImportContainer deletedImportSink = ImportApiTestUtils.getProjectRoot()
                    .importContainers()
                    .withImportContainerKeyValue(key)
                    .delete()
                    .executeBlocking()
                    .getBody();
            Assertions.assertNotNull(deletedImportSink);
            Assertions.assertEquals(deletedImportSink.getKey(), deletedImportSink.getKey());
        });
    }

    public static ImportContainer createImportContainer() {
        ImportContainerDraft importContainerDraft = ImportContainerDraftBuilder.of()
                .key(ImportApiTestUtils.randomKey())
                .resourceType(ImportResourceType.PRODUCT_TYPE)
                .build();

        return createImportContainer(importContainerDraft);
    }

    public static ImportContainer createImportContainer(ImportContainerDraft importContainerDraft) {
        return ImportApiTestUtils.getProjectRoot()
                .importContainers()
                .post(importContainerDraft)
                .executeBlocking()
                .getBody();
    }

}
