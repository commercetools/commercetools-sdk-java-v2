
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ReferencedResourceNotFoundErrorImpl implements ReferencedResourceNotFoundError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String id;

    private String key;

    @JsonCreator
    ReferencedResourceNotFoundErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("typeId") final com.commercetools.api.models.common.ReferenceTypeId typeId,
            @JsonProperty("id") final String id, @JsonProperty("key") final String key) {
        this.message = message;
        this.values = values;
        this.typeId = typeId;
        this.id = id;
        this.key = key;
        this.code = REFERENCED_RESOURCE_NOT_FOUND;
    }

    public ReferencedResourceNotFoundErrorImpl() {
        this.code = REFERENCED_RESOURCE_NOT_FOUND;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> values() {
        return values;
    }

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    public String getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setTypeId(final com.commercetools.api.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReferencedResourceNotFoundErrorImpl that = (ReferencedResourceNotFoundErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(typeId)
                .append(id)
                .append(key)
                .toHashCode();
    }

}
