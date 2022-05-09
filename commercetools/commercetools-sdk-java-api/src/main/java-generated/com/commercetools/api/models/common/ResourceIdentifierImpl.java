
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Draft type to create a <a href="ctp:api:type:Reference">Reference</a> or a <a href="ctp:api:type:KeyReference">KeyReference</a> to a resource. Provide either the <code>id</code> or (wherever supported) the <code>key</code> of the resource to reference, but depending on the API endpoint the response returns either a Reference or a KeyReference. For example, the field <code>parent</code> of a <a href="ctp:api:type:CategoryDraft">CategoryDraft</a> takes a ResourceIdentifier for its value while the value of the corresponding field of a <a href="ctp:api:type:Category">Category</a> is a Reference.</p>
*  <p>Each resource type has its corresponding ResourceIdentifier, like <a href="ctp:api:type:ChannelResourceIdentifier">ChannelResourceIdentifier</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ResourceIdentifierImpl implements ResourceIdentifier, ModelBase {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String id;

    private String key;

    @JsonCreator
    ResourceIdentifierImpl(@JsonProperty("typeId") final com.commercetools.api.models.common.ReferenceTypeId typeId,
            @JsonProperty("id") final String id, @JsonProperty("key") final String key) {
        this.typeId = typeId;
        this.id = id;
        this.key = key;
    }

    public ResourceIdentifierImpl() {
    }

    /**
    *  <p>Type of referenced resource. If given, it must match the expected <a href="#referencetypeid">ReferenceTypeId</a> of the referenced resource.</p>
    */
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
    *  <p>Platform-generated unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
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

        return new EqualsBuilder().append(typeId, that.typeId).append(id, that.id).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(id).append(key).toHashCode();
    }

}
