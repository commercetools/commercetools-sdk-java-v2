
package com.commercetools.api.models.product;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.annotation.Nullable;

public interface AttributeContainer {
    List<Attribute> getAttributes();

    @Nullable
    public default AttributeAccess getAttributeByName(final String attributeName) {
        return findAttributeByName(attributeName).orElse(null);
    }

    public default Optional<AttributeAccess> findAttributeByName(final String attributeName) {
        return findAttribute(attributeName).map(AttributeAccess::of);
    }

    public default <T> Optional<T> findAttribute(final String attributeName, Function<Attribute, T> accessor) {
        return findAttribute(attributeName).map(accessor);
    }

    @Nullable
    public default Attribute getAttribute(final String attributeName) {
        return findAttribute(attributeName).orElse(null);
    }

    public default Optional<Attribute> findAttribute(final String attributeName) {
        requireNonNull(attributeName);
        return getAttributes().stream().filter(attribute -> attribute.getName().equals(attributeName)).findFirst();
    }

    default boolean hasAttribute(final String attributeName) {
        requireNonNull(attributeName);
        return getAttributes().stream().anyMatch(attr -> attr.getName().equals(attributeName));
    }
}
