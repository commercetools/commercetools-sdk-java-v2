
package com.commercetools.api.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public interface FieldContainerImplMixin {
    @JsonDeserialize(as = JsonNode.class)
    public Object getValue();
}
