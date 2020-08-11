package com.commerctools.importer.defaultconfig;

import com.commercetools.importer.models.common.ImportResourceType;
import com.commercetools.importer.models.importsinks.ImportSink;
import com.commercetools.importer.models.importsinks.ImportSinkDraft;
import com.commercetools.importer.models.importsinks.ImportSinkDraftBuilder;
import org.junit.Assert;
import org.junit.Test;

public class ImportSinkIntegrationTests {
    
    @Test
    public void createAndDelete() {
        ImportSinkDraft importSinkDraft = ImportSinkDraftBuilder.of()
                .key(ImportApiTestUtils.randomKey())
                .resourceType(ImportResourceType.PRODUCT_TYPE)
                .build();

        ImportSink importSink = ImportApiTestUtils.getApiRoot().withProjectKeyValue(ImportApiTestUtils.getProjectKey())
                .importSinks()
                .post(importSinkDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(importSink);

        ImportSink deletedImportSink = ImportApiTestUtils.getApiRoot().withProjectKeyValue(ImportApiTestUtils.getProjectKey())
                .importSinks()
                .withImportSinkKeyValue(importSink.getKey())
                .delete()
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(deletedImportSink);
        Assert.assertEquals(importSink.getKey(), deletedImportSink.getKey());
    }
    
}
