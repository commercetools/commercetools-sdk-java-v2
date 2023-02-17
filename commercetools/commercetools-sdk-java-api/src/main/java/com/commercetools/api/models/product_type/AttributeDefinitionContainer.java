
package com.commercetools.api.models.product_type;

import java.util.List;
import java.util.Optional;

import javax.annotation.Nullable;

import org.apache.commons.lang3.StringUtils;

public interface AttributeDefinitionContainer {
    List<AttributeDefinition> getAttributes();

    @Nullable
    default AttributeDefinition getAttribute(final String attributeName) {
        return findAttribute(attributeName).orElse(null);
    }

    default Optional<AttributeDefinition> findAttribute(final String attributeName) {
        return getAttributes().stream()
                .filter(attribute -> StringUtils.equals(attributeName, attribute.getName()))
                .findAny();
    }
}
