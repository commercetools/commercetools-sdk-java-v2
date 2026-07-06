
package com.commercetools.api.json;

import java.util.List;

import com.commercetools.api.models.product_search.*;

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
        else if (node.has("count") || node.has("min")) {
            return ProductSearchFacetResultStats.builder()
                    .name(node.get("name").asString())
                    .count(node.get("count").asLong())
                    .max(node.get("max").asDouble())
                    .min(node.get("min").asDouble())
                    .mean(node.get("mean").asDouble())
                    .sum(node.get("sum").asDouble())
                    .build();
        }
        return ProductSearchFacetResult.builder().name(node.get("name").asString()).build();
    }
}
