
package com.commercetools.api.json;

import java.util.concurrent.ConcurrentHashMap;

import tools.jackson.core.JsonParser;
import tools.jackson.core.JsonToken;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JavaType;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ValueDeserializer;

class ValueDeserializerCache {

    private final ConcurrentHashMap<TypeReference<?>, ValueDeserializer<Object>> deserializers = new ConcurrentHashMap<>();

    Object readValue(final JsonParser p, final DeserializationContext ctx, final TypeReference<?> ref,
            final JsonNode nodeValue) {
        ValueDeserializer<Object> deser = deserializers.get(ref);
        if (deser == null) {
            final JavaType type = ctx.getTypeFactory().constructType(ref);
            deser = ctx.findRootValueDeserializer(type);
            deserializers.putIfAbsent(ref, deser);
        }

        final JsonParser sub = p.objectReadContext().treeAsTokens(nodeValue);
        final JsonToken t = sub.nextToken();
        if (t == null) {
            return null;
        }
        if (t == JsonToken.VALUE_NULL) {
            return deser.getNullValue(ctx);
        }
        return deser.deserialize(sub, ctx);
    }
}
