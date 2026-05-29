
package com.commercetools.api.json;

import java.util.List;

import com.commercetools.api.models.product_search.ProductSearchFacetResult;
import com.commercetools.api.models.product_search.ProductSearchFacetResultBucket;
import com.commercetools.api.models.product_search.ProductSearchFacetResultBucketEntry;
import com.commercetools.api.models.product_search.ProductSearchFacetResultCount;
import tools.jackson.core.JsonParser;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ValueDeserializer;

public class ProductSearchFacetResultDeserializer extends ValueDeserializer<ProductSearchFacetResult> {

    @Override
    public ProductSearchFacetResult deserialize(JsonParser p, DeserializationContext ctx) {

        JsonNode node = p.readValueAsTree();

        if (node.has("buckets")) {
            return ProductSearchFacetResultBucket.builder()
                    .name(node.get("name").asString())
                    .buckets(p.objectReadContext()
                            .readValue(node.get("buckets").traverse(p.objectReadContext()),
                                new TypeReference<List<ProductSearchFacetResultBucketEntry>>() {
                                }))
                    .build();
        }
        else if (node.has("value")) {
            return ProductSearchFacetResultCount.builder()
                    .name(node.get("name").asString())
                    .value(node.get("value").asLong())
                    .build();
        }
        return ProductSearchFacetResult.builder().name(node.get("name").asString()).build();
    }
}
