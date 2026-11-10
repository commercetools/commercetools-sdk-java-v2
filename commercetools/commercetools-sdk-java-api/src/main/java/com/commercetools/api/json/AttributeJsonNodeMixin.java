
package com.commercetools.api.json;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.annotation.JsonDeserialize;

public interface AttributeJsonNodeMixin {
    @JsonDeserialize(as = JsonNode.class)
    public Object getValue();
}
