
package com.commercetools.api.models.product;

import java.util.List;

public class AttributeContainerImpl implements AttributeContainer {
    private final List<Attribute> attributes;

    AttributeContainerImpl(final List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public static AttributeContainer of(final List<Attribute> attributes) {
        return new AttributeContainerImpl(attributes);
    }
}
