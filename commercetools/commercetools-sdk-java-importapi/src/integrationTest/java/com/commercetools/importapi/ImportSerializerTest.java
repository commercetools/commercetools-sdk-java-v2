
package com.commercetools.importapi;

import com.commercetools.importapi.client.ProjectApiRoot;
import com.commercetools.importapi.defaultconfig.ImportApiRootBuilder;
import com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder;
import com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestBuilder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.vrap.rmf.base.client.ResponseSerializer;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImportSerializerTest {
    @Test
    public void importSerializer() {
        ObjectMapper mapper = JsonUtils.createObjectMapper().setSerializationInclusion(JsonInclude.Include.ALWAYS);

        ProjectApiRoot apiRoot = ImportApiRootBuilder.of()
                .defaultClient("")
                .withSerializer(ResponseSerializer.of(mapper))
                .build("myProjectKey");

        Assertions.assertThat(apiRoot.productVariantPatches()
                .importContainers()
                .withImportContainerKeyValue("")
                .post(ProductVariantPatchRequestBuilder.of().withPatches(productVariantPatchBuilder ->

                productVariantPatchBuilder
                        .productVariant(ProductVariantKeyReferenceBuilder.of().key("GOR004436672").build())
                        .attributes(attributesBuilder -> attributesBuilder.addValue("custom_tag", null))).build())
                .createHttpRequest()
                .getSecuredBody())
                .isEqualTo(
                    "{\"patches\":[{\"productVariant\":{\"key\":\"GOR004436672\",\"typeId\":\"product-variant\"},\"attributes\":{\"custom_tag\":null},\"staged\":null}],\"type\":\"product-variant-patch\"}");
    }

}
