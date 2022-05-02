
package com.commercetools.importapi;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importcontainers.ImportContainer;
import com.commercetools.importapi.models.importcontainers.ImportContainerDraft;
import com.commercetools.importapi.models.importcontainers.ImportContainerDraftBuilder;
import com.commercetools.importapi.utils.ImportApiTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImportSinkIntegrationTests {

    @Test
    public void createAndDelete() {
        ImportContainerDraft importSinkDraft = ImportContainerDraftBuilder.of()
                .key(ImportApiTestUtils.randomKey())
                .resourceType(ImportResourceType.PRODUCT_TYPE)
                .build();

        ImportContainer importSink = ImportApiTestUtils.getProjectRoot()
                .importContainers()
                .post(importSinkDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(importSink);

        //        ImportApiTestUtils.assertEventually(() -> {
        //            ImportSink deletedImportSink = ImportApiTestUtils.getProjectRoot()
        //                    .importSinks()
        //                    .withImportSinkKeyValue(importSink.getKey())
        //                    .delete()
        //                    .executeBlocking()
        //                    .getBody();
        //            Assertions.assertNotNull(deletedImportSink);
        //            Assertions.assertEquals(importSink.getKey(), deletedImportSink.getKey());
        //        });
    }

}
