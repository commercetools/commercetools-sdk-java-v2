
package com.commercetools.importapi.product_type;

import static com.commercetools.importapi.utils.ImportApiTestUtils.assertEventually;
import static com.commercetools.importapi.utils.ImportApiTestUtils.randomKey;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.common.ProcessingState;
import com.commercetools.importapi.models.importcontainers.ImportContainer;
import com.commercetools.importapi.models.importcontainers.ImportContainerDraft;
import com.commercetools.importapi.models.importcontainers.ImportContainerDraftBuilder;
import com.commercetools.importapi.models.importoperations.ImportOperation;
import com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse;
import com.commercetools.importapi.models.importrequests.ProductTypeImportRequest;
import com.commercetools.importapi.models.importrequests.ProductTypeImportRequestBuilder;
import com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder;
import com.commercetools.importapi.utils.ImportApiTestUtils;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ProductTypeImportIntegrationTest {

    @Test
    @Disabled("disabled as test is flaky")
    public void createAndDelete() throws InterruptedException {
        String importSinkKey = ImportApiTestUtils.randomKey();
        ImportContainerDraft importSinkDraft = ImportContainerDraftBuilder.of()
                .key(importSinkKey)
                .resourceType(ImportResourceType.PRODUCT_TYPE)
                .build();

        ImportContainer importSink = ImportApiTestUtils.getProjectRoot()
                .importContainers()
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
                .importContainers()
                .withImportContainerKeyValue(importSinkKey)
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
        //        Assertions.assertNotNull(deletedImportSink);
        //        Assertions.assertEquals(importSink.getKey(), deletedImportSink.getKey());
    }

}
