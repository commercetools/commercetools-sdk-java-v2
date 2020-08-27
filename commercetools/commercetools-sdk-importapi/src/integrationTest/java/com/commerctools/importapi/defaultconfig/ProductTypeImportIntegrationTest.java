package com.commerctools.importapi.defaultconfig;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.common.ProcessingState;
import com.commercetools.importapi.models.importoperations.ImportOperation;
import com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse;
import com.commercetools.importapi.models.importrequests.ImportResponse;
import com.commercetools.importapi.models.importrequests.ProductTypeImportRequest;
import com.commercetools.importapi.models.importrequests.ProductTypeImportRequestBuilder;
import com.commercetools.importapi.models.importsinks.ImportSink;
import com.commercetools.importapi.models.importsinks.ImportSinkDraft;
import com.commercetools.importapi.models.importsinks.ImportSinkDraftBuilder;
import com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder;
import org.junit.Assert;
import org.junit.Test;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ProductTypeImportIntegrationTest {

    @Test
    public void createAndDelete() throws InterruptedException {
        String importSinkKey = ImportApiTestUtils.randomKey();
        ImportSinkDraft importSinkDraft = ImportSinkDraftBuilder.of()
                .key(importSinkKey)
                .resourceType(ImportResourceType.PRODUCT_TYPE)
                .build();

        ImportSink importSink = ImportApiTestUtils.getApiRoot().withProjectKeyValue(ImportApiTestUtils.getProjectKey())
                .importSinks()
                .post(importSinkDraft)
                .executeBlocking()
                .getBody();

        assertThat(importSink).isNotNull();

        ProductTypeImportRequest importRequest = ProductTypeImportRequestBuilder.of()
                .resources(Collections.singletonList(ProductTypeImportBuilder.of()
                        .key("default")
                        .name("default")
                        .description("some type")
                        .build()))
                .build();
        ImportApiTestUtils.getApiRoot().withProjectKeyValue(ImportApiTestUtils.getProjectKey()).productTypes()
                .importSinkKeyWithImportSinkKeyValue(importSinkKey)
                .post(importRequest)
                .executeBlocking()
                .getBody();

        Thread.sleep(Duration.ofSeconds(30).toMillis());

        ImportOperationPagedResponse operationPagedResponse = ImportApiTestUtils.getApiRoot().withProjectKeyValue(ImportApiTestUtils.getProjectKey()).productTypes()
                .importSinkKeyWithImportSinkKeyValue(importSinkKey)
                .importOperations()
                .get().executeBlocking().getBody();

        assertThat(operationPagedResponse).isNotNull();
        List<ImportOperation> results = operationPagedResponse.getResults();
        assertThat(results).hasSize(1);
        assertThat(results.get(0).getState()).isEqualTo(ProcessingState.IMPORTED);


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
