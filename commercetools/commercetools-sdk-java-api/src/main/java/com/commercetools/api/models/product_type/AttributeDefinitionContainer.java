package com.commercetools.api.models.product_type;

import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

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
