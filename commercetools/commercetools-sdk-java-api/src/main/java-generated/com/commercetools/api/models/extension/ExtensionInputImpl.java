
package com.commercetools.api.models.extension;

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
public class ExtensionInputImpl implements ExtensionInput, ModelBase {

    private com.commercetools.api.models.extension.ExtensionAction action;

    private com.commercetools.api.models.common.Reference resource;

    @JsonCreator
    ExtensionInputImpl(@JsonProperty("action") final com.commercetools.api.models.extension.ExtensionAction action,
            @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource) {
        this.action = action;
        this.resource = resource;
    }

    public ExtensionInputImpl() {
    }

    /**
    *  <p><code>Create</code> or <code>Update</code> request.</p>
    */
    public com.commercetools.api.models.extension.ExtensionAction getAction() {
        return this.action;
    }

    /**
    *  <p>Expanded reference to the resource that triggered the Extension.</p>
    */
    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    public void setAction(final com.commercetools.api.models.extension.ExtensionAction action) {
        this.action = action;
    }

    public void setResource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionInputImpl that = (ExtensionInputImpl) o;

        return new EqualsBuilder().append(action, that.action).append(resource, that.resource).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(resource).toHashCode();
    }

}
