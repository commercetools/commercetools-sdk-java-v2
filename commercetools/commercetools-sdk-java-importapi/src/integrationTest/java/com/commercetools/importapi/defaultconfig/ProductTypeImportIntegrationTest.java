
package com.commercetools.importapi.defaultconfig;

import static com.commercetools.importapi.defaultconfig.ImportApiTestUtils.assertEventually;
import static com.commercetools.importapi.defaultconfig.ImportApiTestUtils.randomKey;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.common.ProcessingState;
import com.commercetools.importapi.models.importoperations.ImportOperation;
import com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse;
import com.commercetools.importapi.models.importrequests.ProductTypeImportRequest;
import com.commercetools.importapi.models.importrequests.ProductTypeImportRequestBuilder;
import com.commercetools.importapi.models.importsinks.ImportSink;
import com.commercetools.importapi.models.importsinks.ImportSinkDraft;
import com.commercetools.importapi.models.importsinks.ImportSinkDraftBuilder;
import com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder;

import org.junit.Test;

public class ProductTypeImportIntegrationTest {

    @Test
    public void createAndDelete() throws InterruptedException {
        String importSinkKey = ImportApiTestUtils.randomKey();
        ImportSinkDraft importSinkDraft = ImportSinkDraftBuilder.of()
                .key(importSinkKey)
                .resourceType(ImportResourceType.PRODUCT_TYPE)
                .build();

        ImportSink importSink = ImportApiTestUtils.getProjectRoot()
                .importSinks()
                .post(importSinkDraft)
                .executeBlocking()
                .getBody();

        assertThat(importSink).isNotNull();

        String name = randomKey();

        ProductTypeImportRequest importRequest = ProductTypeImportRequestBuilder.of()
                .resources(Collections
                        .singletonList(ProductTypeImportBuilder.of().key(name).name(name).description(name).build()))
                .build();
        ImportApiTestUtils.getProjectRoot()
                .productTypes()
                .importSinkKeyWithImportSinkKeyValue(importSinkKey)
                .post(importRequest)
                .executeBlocking()
                .getBody();

        assertEventually(Duration.ofSeconds(240), Duration.ofMillis(1000), () -> {
            ImportOperationPagedResponse operationPagedResponse = ImportApiTestUtils.getProjectRoot()
                    .productTypes()
                    .importSinkKeyWithImportSinkKeyValue(importSinkKey)
                    .importOperations()
                    .get()
                    .executeBlocking()
                    .getBody();

            assertThat(operationPagedResponse).isNotNull();
            List<ImportOperation> results = operationPagedResponse.getResults();
            assertThat(results).hasSize(1);
            assertThat(results.get(0).getState()).isEqualTo(ProcessingState.IMPORTED);
        });

        //
        //        ImportSink deletedImportSink = ImportApiTestUtils.getProjectRoot()
        //                .importSinks()
        //                .withImportSinkKeyValue(importSink.getKey())
        //                .delete()
        //                .executeBlocking()
        //                .getBody();
        //
        //        Assert.assertNotNull(deletedImportSink);
        //        Assert.assertEquals(importSink.getKey(), deletedImportSink.getKey());
    }

}
