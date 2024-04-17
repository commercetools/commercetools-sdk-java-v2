
package com.commercetools.api.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = ProductSearchFacetResultDeserializer.class)
public interface ProductSearchFacetResultMixin {
}
