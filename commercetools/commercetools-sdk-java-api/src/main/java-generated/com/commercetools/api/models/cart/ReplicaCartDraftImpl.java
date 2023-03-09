
package com.commercetools.api.models.cart;

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
 * ReplicaCartDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReplicaCartDraftImpl implements ReplicaCartDraft, ModelBase {

    private com.commercetools.api.models.common.Reference reference;

    private String key;

    @JsonCreator
    ReplicaCartDraftImpl(@JsonProperty("reference") final com.commercetools.api.models.common.Reference reference,
            @JsonProperty("key") final String key) {
        this.reference = reference;
        this.key = key;
    }

    public ReplicaCartDraftImpl() {
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public com.commercetools.api.models.common.Reference getReference() {
        return this.reference;
    }

    /**
     *  <p>User-specific unique identifier of the cart.</p>
     */

    public String getKey() {
        return this.key;
    }

    public void setReference(final com.commercetools.api.models.common.Reference reference) {
        this.reference = reference;
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

        ReplicaCartDraftImpl that = (ReplicaCartDraftImpl) o;

        return new EqualsBuilder().append(reference, that.reference).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(reference).append(key).toHashCode();
    }

}
