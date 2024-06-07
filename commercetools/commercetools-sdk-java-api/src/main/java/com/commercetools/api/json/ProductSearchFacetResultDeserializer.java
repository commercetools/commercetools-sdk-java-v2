
package com.commercetools.api.json;

import java.io.IOException;
import java.util.List;

import com.commercetools.api.models.product_search.ProductSearchFacetResult;
import com.commercetools.api.models.product_search.ProductSearchFacetResultBucket;
import com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntry;
import com.commercetools.api.models.product_search.ProductSearchFacetResultCount;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class ProductSearchFacetResultDeserializer extends JsonDeserializer<ProductSearchFacetResult> {

    @Override
    public ProductSearchFacetResult deserialize(JsonParser p, DeserializationContext ctx) throws IOException {

        JsonNode node = p.readValueAsTree();

        if (node.has("buckets")) {
            return ProductSearchFacetResultBucket.builder()
                    .name(node.get("name").asText())
                    .buckets(p.getCodec()
                            .readValue(node.get("buckets").traverse(),
                                new TypeReference<List<ProductSearchFacetResultBucketEntry>>() {
                                }))
                    .build();
        }
        else if (node.has("value")) {
            return ProductSearchFacetResultCount.builder()
                    .name(node.get("name").asText())
                    .value(node.get("value").asLong())
                    .build();
        }
        return ProductSearchFacetResult.builder().name(node.get("name").asText()).build();
    }
}
