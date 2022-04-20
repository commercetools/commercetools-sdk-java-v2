
package com.commerctools.importapi;

import com.commercetools.importapi.models.productvariants.AttributeBuilder;
import com.commercetools.importapi.models.productvariants.ProductVariantPatch;
import com.commercetools.importapi.models.productvariants.ProductVariantPatchBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatchTest {
    @Test
    public void testPatchDelete() throws JsonProcessingException {
        final ObjectMapper objectMapper = JsonUtils.createObjectMapper();

        final ProductVariantPatch variantPatch = ProductVariantPatchBuilder.of()
                .productVariant(ref -> ref.key("abc"))
                .attributes(attributesBuilder -> attributesBuilder
                        .addValue("bar", AttributeBuilder.of().textBuilder().value("bar").build())
                        .addValue("foo", null))
                .build();
        String patchJson = objectMapper.writeValueAsString(variantPatch);

        Assertions.assertThat(patchJson)
                .isEqualTo(
                    "{\"productVariant\":{\"key\":\"abc\",\"typeId\":\"product-variant\"},\"attributes\":{\"bar\":{\"value\":\"bar\",\"type\":\"text\"},\"foo\":null}}");
    }
}
