
package com.commercetools.api.models.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GenericReferenceImpl<T> implements GenericReference<T> {
    private final T obj;
    private final ReferenceTypeId typeId;
    private String id;

    @JsonCreator
    public GenericReferenceImpl(@JsonProperty("typeId") final ReferenceTypeId typeId,
            @JsonProperty("id") final String id, @JsonProperty("obj") final T obj) {
        this.obj = obj;
        this.typeId = typeId;
        this.id = id;
    }

    @Override
    public ReferenceTypeId getTypeId() {
        return typeId;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public T getObj() {
        return obj;
    }
}
