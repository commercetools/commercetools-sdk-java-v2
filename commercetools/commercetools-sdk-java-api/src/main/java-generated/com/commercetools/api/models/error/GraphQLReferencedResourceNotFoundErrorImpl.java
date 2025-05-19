
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Returned when a resource referenced by a Reference or a ResourceIdentifier could not be found.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLReferencedResourceNotFoundErrorImpl implements GraphQLReferencedResourceNotFoundError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String id;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLReferencedResourceNotFoundErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("typeId") final com.commercetools.api.models.common.ReferenceTypeId typeId,
            @JsonProperty("id") final String id, @JsonProperty("key") final String key) {
        this.values = values;
        this.typeId = typeId;
        this.id = id;
        this.key = key;
        this.code = REFERENCED_RESOURCE_NOT_FOUND;
    }

    /**
     * create empty instance
     */
    public GraphQLReferencedResourceNotFoundErrorImpl() {
        this.code = REFERENCED_RESOURCE_NOT_FOUND;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>Type of referenced resource.</p>
     */

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     *  <p>Unique identifier of the referenced resource, if known.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource, if known.</p>
     */

    public String getKey() {
        return this.key;
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

        GraphQLReferencedResourceNotFoundErrorImpl that = (GraphQLReferencedResourceNotFoundErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(key, that.key)
                .append(code, that.code)
                .append(values, that.values)
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(values)
                .append(typeId)
                .append(id)
                .append(key)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("typeId", typeId)
                .append("id", id)
                .append("key", key)
                .build();
    }

    @Override
    public GraphQLReferencedResourceNotFoundError copyDeep() {
        return GraphQLReferencedResourceNotFoundError.deepCopy(this);
    }
}
