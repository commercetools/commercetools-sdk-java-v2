
package com.commercetools.importapi.json;

import java.util.Map;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.fasterxml.jackson.annotation.JsonInclude;

public interface AttributesMixin {
    @JsonInclude
    public Map<String, Attribute> values();
}
