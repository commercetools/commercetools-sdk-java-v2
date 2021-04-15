
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerGroupUpdateImpl implements CustomerGroupUpdate {

    private Long version;

    private java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> actions;

    @JsonCreator
    CustomerGroupUpdateImpl(@JsonProperty("version") final Long version,
            @JsonProperty("actions") final java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> actions) {
        this.version = version;
        this.actions = actions;
    }

    public CustomerGroupUpdateImpl() {
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> getActions() {
        return this.actions;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setActions(final com.commercetools.api.models.customer_group.CustomerGroupUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
    }

    public void setActions(
            final java.util.List<com.commercetools.api.models.customer_group.CustomerGroupUpdateAction> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerGroupUpdateImpl that = (CustomerGroupUpdateImpl) o;

        return new EqualsBuilder().append(version, that.version).append(actions, that.actions).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(actions).toHashCode();
    }

}
