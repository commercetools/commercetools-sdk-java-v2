
package com.commercetools.api.json;

import tools.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = ProductSearchFacetResultDeserializer.class)
public interface ProductSearchFacetResultMixin {
}
