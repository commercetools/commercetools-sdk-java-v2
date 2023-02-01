
package com.commercetools.api.models.common;

public interface ReferenceMixin {
    public String getId();

    public ReferenceTypeId getTypeId();

    public default ResourceIdentifier toResourceIdentifier() {
        return new ResourceIdentifierImpl(this.getTypeId(), this.getId(), null);
    }
}
