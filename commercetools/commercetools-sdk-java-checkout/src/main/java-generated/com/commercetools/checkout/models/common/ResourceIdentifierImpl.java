
package com.commercetools.checkout.models.common;

import java.time.*;
import java.util.*;

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
 *  <p>Draft type to create a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> or a <a href="https://docs.commercetools.com/apis/ctp:api:type:KeyReference" rel="nofollow">KeyReference</a> to a resource. Provide either the <code>id</code> or (wherever supported) the <code>key</code> of the resource to reference, but depending on the API endpoint the response returns either a Reference or a KeyReference. For example, the field <code>parent</code> of a <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryDraft" rel="nofollow">CategoryDraft</a> takes a ResourceIdentifier for its value while the value of the corresponding field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> is a Reference.</p>
 *  <p>Each resource type has its corresponding ResourceIdentifier, like <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelResourceIdentifier" rel="nofollow">ChannelResourceIdentifier</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceIdentifierImpl implements ResourceIdentifier, ModelBase {

    private com.commercetools.checkout.models.common.ReferenceTypeId typeId;

    private String id;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ResourceIdentifierImpl(
            @JsonProperty("typeId") final com.commercetools.checkout.models.common.ReferenceTypeId typeId,
            @JsonProperty("id") final String id, @JsonProperty("key") final String key) {
        this.typeId = typeId;
        this.id = id;
        this.key = key;
    }

    /**
     * create empty instance
     */
    public ResourceIdentifierImpl() {
    }

    /**
     *  <p>Type of referenced resource. If given, it must match the expected <span>ReferenceTypeId</span> of the referenced resource.</p>
     */

    public com.commercetools.checkout.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     */

    public String getKey() {
        return this.key;
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

        ResourceIdentifierImpl that = (ResourceIdentifierImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId)
                .append(id, that.id)
                .append(key, that.key)
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(id).append(key).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("typeId", typeId)
                .append("id", id)
                .append("key", key)
                .build();
    }

    @Override
    public ResourceIdentifier copyDeep() {
        return ResourceIdentifier.deepCopy(this);
    }
}
