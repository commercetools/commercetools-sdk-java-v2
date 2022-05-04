
package com.commercetools.importapi.product;

import static com.commercetools.importapi.importcontainer.ImportContainerFixtures.withContainer;
import static com.commercetools.importapi.product.ProductFixtures.withProduct;
import static com.commercetools.importapi.utils.ImportApiTestUtils.assertEventually;

import com.commercetools.api.models.product.AttributesAccessor;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.importapi.client.ProjectApiRoot;
import com.commercetools.importapi.models.common.ProcessingState;
import com.commercetools.importapi.models.importoperations.ImportOperation;
import com.commercetools.importapi.models.importrequests.ImportResponse;
import com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest;
import com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestBuilder;
import com.commercetools.importapi.utils.CommercetoolsTestUtils;
import com.commercetools.importapi.utils.ImportApiTestUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductVariantPatchIntegrationTest {
    @Test
    public void testVariantPatch() {
        withContainer(importContainer -> {
            withProduct(product -> {

                Assertions
                        .assertThat(product.getMasterData()
                                .getStaged()
                                .getMasterVariant()
                                .withProductVariant(AttributesAccessor::of)
                                .asString("test-text"))
                        .isEqualTo("foo");
                final ProjectApiRoot projectRoot = ImportApiTestUtils.getProjectRoot();

                final ProductVariantPatchRequest patchRequest = ProductVariantPatchRequestBuilder.of()
                        .withPatches(patchBuilder -> patchBuilder
                                .productVariant(variantRefBuilder -> variantRefBuilder
                                        .key(product.getMasterData().getStaged().getMasterVariant().getKey()))
                                .attributes(attributes -> attributes.addValue("test-text", null)))
                        .build();

                final ImportResponse body = projectRoot.productVariantPatches()
                        .importContainers()
                        .withImportContainerKeyValue(importContainer.getKey())
                        .post(patchRequest)
                        .executeBlocking()
                        .getBody();

                final String operationId = body.getOperationStatus().get(0).getOperationId();
                assertEventually(() -> {
                    ImportOperation importOperation = projectRoot.importOperations()
                            .withIdValue(operationId)
                            .get()
                            .executeBlocking()
                            .getBody();
                    final ProcessingState state = importOperation.getState();
                    Assertions.assertThat(state).isEqualTo(ProcessingState.IMPORTED);
                });
                assertEventually(() -> {
                    final ProductProjection updatedProduct = CommercetoolsTestUtils.getProjectApiRoot()
                            .productProjections()
                            .withId(product.getId())
                            .get()
                            .withStaged(true)
                            .executeBlocking()
                            .getBody();
                    Assertions
                            .assertThat(updatedProduct.getMasterVariant()
                                    .withProductVariant(AttributesAccessor::of)
                                    .asString("test-text"))
                            .isNull();
                });
            });
        });
    }
}
