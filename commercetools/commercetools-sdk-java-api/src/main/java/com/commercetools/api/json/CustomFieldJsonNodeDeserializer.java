
package com.commercetools.api.json;

import java.io.IOException;

import com.commercetools.api.models.type.FieldContainerBuilder;
import com.commercetools.api.models.type.FieldContainerImpl;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class CustomFieldJsonNodeDeserializer extends JsonDeserializer<FieldContainerImpl> {

    public CustomFieldJsonNodeDeserializer() {
    }

    @Override
    public FieldContainerImpl deserialize(JsonParser p, DeserializationContext ctx) throws IOException {

        JsonNode node = p.readValueAsTree();

        FieldContainerBuilder builder = FieldContainerBuilder.of();

        node.fields().forEachRemaining(nodeEntry -> builder.addValue(nodeEntry.getKey(), nodeEntry.getValue()));

        return (FieldContainerImpl) builder.build();
    }
}
