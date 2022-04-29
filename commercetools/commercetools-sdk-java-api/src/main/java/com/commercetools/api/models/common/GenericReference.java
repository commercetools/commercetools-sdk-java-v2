
package com.commercetools.api.models.common;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = GenericReferenceImpl.class)
@JsonSubTypes({})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = GenericReferenceImpl.class, visible = true)
public interface GenericReference<T> extends Reference {
    public T getObj();

    public default GenericReference<T> of(final ReferenceTypeId typeId, final String id, final T obj) {
        return new GenericReferenceImpl<>(typeId, id, obj);
    }
}
