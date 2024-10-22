
package com.commercetools.importapi.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = ErrorAttributeDeserializer.class)
public interface AttributeMixin {
}
