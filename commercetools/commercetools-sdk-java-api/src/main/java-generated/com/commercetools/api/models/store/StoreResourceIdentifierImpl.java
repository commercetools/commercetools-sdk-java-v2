
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>ResourceIdentifier to a Store.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreResourceIdentifierImpl implements StoreResourceIdentifier, ModelBase {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String id;

    private String key;

    @JsonCreator
    StoreResourceIdentifierImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key) {
        this.id = id;
        this.key = key;
        this.typeId = ReferenceTypeId.findEnum("store");
    }

    public StoreResourceIdentifierImpl() {
        this.typeId = ReferenceTypeId.findEnum("store");
    }

    /**
     *  <p>Type of referenced resource. If given, it must match the expected ReferenceTypeId of the referenced resource.</p>
     */

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     *  <p>Unique ID of the referenced Store. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Unique key of the referenced Store. Either <code>id</code> or <code>key</code> is required.</p>
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

        StoreResourceIdentifierImpl that = (StoreResourceIdentifierImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId).append(id, that.id).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(id).append(key).toHashCode();
    }

}
