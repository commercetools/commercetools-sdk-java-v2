
package com.commercetools.importapi.json;

import java.util.Map;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.fasterxml.jackson.annotation.JsonInclude;

public interface AttributesMixin {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public Map<String, Attribute> values();
}
