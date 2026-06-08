
package com.commercetools.api.json;

import com.commercetools.api.models.type.FieldContainerBuilder;
import com.commercetools.api.models.type.FieldContainerImpl;

import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ValueDeserializer;

public class CustomFieldJsonNodeDeserializer extends ValueDeserializer<FieldContainerImpl> {

    public CustomFieldJsonNodeDeserializer() {
    }

    @Override
    public FieldContainerImpl deserialize(JsonParser p, DeserializationContext ctx) {

        JsonNode node = p.readValueAsTree();

        FieldContainerBuilder builder = FieldContainerBuilder.of();

        node.properties()
                .iterator()
                .forEachRemaining(nodeEntry -> builder.addValue(nodeEntry.getKey(), nodeEntry.getValue()));

        return (FieldContainerImpl) builder.build();
    }
}
