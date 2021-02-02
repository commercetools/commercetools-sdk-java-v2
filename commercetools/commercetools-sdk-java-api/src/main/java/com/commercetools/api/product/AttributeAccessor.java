package com.commercetools.api.product;

import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.product.ProductVariant;

import java.util.Map;
import java.util.stream.Collectors;

public class AttributeAccessor {
    public static Map<String, Object> asAttributeMap(ProductVariant variant) {
        return variant.getAttributes().stream().collect(Collectors.toMap(
                Attribute::getName,
                Attribute::getValue));
    }
}
