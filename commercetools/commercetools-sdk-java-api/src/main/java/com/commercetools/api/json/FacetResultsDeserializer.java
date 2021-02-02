
package com.commercetools.api.json;

import java.io.IOException;

import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetResults;
import com.commercetools.api.models.product.FacetResultsBuilder;
import com.commercetools.api.models.product.FacetResultsImpl;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

public class FacetResultsDeserializer extends JsonDeserializer<FacetResultsImpl> {

    @Override
    public FacetResultsImpl deserialize(JsonParser p, DeserializationContext ctx) throws IOException {

        JsonNode node = p.getCodec().readTree(p);

        FacetResultsBuilder r = FacetResults.builder();
        node.fields().forEachRemaining(entry -> r.addValue(entry.getKey(),
            JsonUtils.getConfiguredObjectMapper().convertValue(entry.getValue(), FacetResult.class)));

        return (FacetResultsImpl) r.build();
    }
}
