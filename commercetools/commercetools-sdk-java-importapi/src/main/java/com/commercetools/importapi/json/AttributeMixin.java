
package com.commercetools.importapi.json;

import tools.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = ErrorAttributeDeserializer.class)
public interface AttributeMixin {
}
