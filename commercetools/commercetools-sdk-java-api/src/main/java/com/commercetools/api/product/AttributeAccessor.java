
package com.commercetools.api.product;

import java.util.Map;

import com.commercetools.api.models.product.Attribute;

/**
 * @deprecated use {@link com.commercetools.api.models.product.AttributeAccessor} instead
 */
@Deprecated
public class AttributeAccessor extends com.commercetools.api.models.product.AttributeAccessor {
    public AttributeAccessor(Map<String, Attribute> attributes) {
        super(attributes);
    }
}
