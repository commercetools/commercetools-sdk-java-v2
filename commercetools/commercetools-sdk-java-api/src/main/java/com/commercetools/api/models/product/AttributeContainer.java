
package com.commercetools.api.models.product;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.Optional;

import javax.annotation.Nullable;

public interface AttributeContainer {
    List<Attribute> getAttributes();

    default Optional<Attribute> findAttribute(final String attributeName) {
        return Optional.ofNullable(getAttribute(attributeName));
    }

    default boolean hasAttribute(final String attributeName) {
        return getAttributes().stream().anyMatch(attr -> attr.getName().equals(attributeName));
    }

    @Nullable
    default Attribute getAttribute(final String attributeName) {
        requireNonNull(attributeName);
        return getAttributes().stream().filter(attr -> attr.getName().equals(attributeName)).findAny().orElse(null);
    }

    static AttributeContainer of(final List<Attribute> attributes) {
        return AttributeContainerImpl.of(attributes);
    }
}
