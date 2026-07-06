
package com.commercetools.importapi;

import com.commercetools.importapi.client.ProjectApiRoot;
import com.commercetools.importapi.defaultconfig.ImportApiRootBuilder;
import com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder;
import com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestBuilder;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.vrap.rmf.base.client.ResponseSerializer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.json.JsonMapper;

public class ImportSerializerTest {
    @Test
    public void importSerializer() {
        ObjectMapper mapper = JsonMapper.builder()
                .changeDefaultPropertyInclusion(incl -> incl.withValueInclusion(JsonInclude.Include.ALWAYS))
                .build();

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
                    "{\"patches\":[{\"productVariant\":{\"key\":\"GOR004436672\",\"typeId\":\"product-variant\"},\"attributes\":{\"custom_tag\":null},\"staged\":null,\"product\":null}],\"type\":\"product-variant-patch\"}");
    }

}
