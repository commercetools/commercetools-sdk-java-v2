
package com.commercetools.importapi.defaultconfig;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importcontainers.ImportContainer;
import com.commercetools.importapi.models.importcontainers.ImportContainerDraft;
import com.commercetools.importapi.models.importcontainers.ImportContainerDraftBuilder;
import com.commercetools.importapi.models.importsinks.ImportSink;
import com.commercetools.importapi.models.importsinks.ImportSinkDraft;
import com.commercetools.importapi.models.importsinks.ImportSinkDraftBuilder;

import org.junit.Assert;
import org.junit.Test;

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

        Assert.assertNotNull(importSink);

        //        ImportApiTestUtils.assertEventually(() -> {
        //            ImportSink deletedImportSink = ImportApiTestUtils.getProjectRoot()
        //                    .importSinks()
        //                    .withImportSinkKeyValue(importSink.getKey())
        //                    .delete()
        //                    .executeBlocking()
        //                    .getBody();
        //            Assert.assertNotNull(deletedImportSink);
        //            Assert.assertEquals(importSink.getKey(), deletedImportSink.getKey());
        //        });
    }

}
