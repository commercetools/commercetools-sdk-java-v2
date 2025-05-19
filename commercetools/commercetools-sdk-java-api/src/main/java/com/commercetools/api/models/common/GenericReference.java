
package com.commercetools.api.models.common;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * generic reference interface
 * @param <T> the underlying reference type
 */
@JsonDeserialize(as = GenericReferenceImpl.class)
@JsonSubTypes({})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = GenericReferenceImpl.class, visible = true)
public interface GenericReference<T> extends Reference {
    public T getObj();

    public default GenericReference<T> of(final ReferenceTypeId typeId, final String id, final T obj) {
        return new GenericReferenceImpl<>(typeId, id, obj);
    }

    /**
    * factory method to create a deep copy of Reference
    * @param template instance to be copied
    * @return copy instance
    */
    @Nullable
    public static <T> GenericReference<T> deepCopy(@Nullable final GenericReference<T> template) {
        if (template == null) {
            return null;
        }

        return new GenericReferenceImpl<>(template.getTypeId(), template.getId(), template.getObj());
    }
}
