
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeChangeGroupsActionImpl implements DiscountCodeChangeGroupsAction {

    private String action;

    private java.util.List<String> groups;

    @JsonCreator
    DiscountCodeChangeGroupsActionImpl(@JsonProperty("groups") final java.util.List<String> groups) {
        this.groups = groups;
        this.action = CHANGE_GROUPS;
    }

    public DiscountCodeChangeGroupsActionImpl() {
        this.action = CHANGE_GROUPS;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>The groups to which this discount code shall belong to.
    *  Use empty array to remove the code from all groups.</p>
    */
    public java.util.List<String> getGroups() {
        return this.groups;
    }

    public void setGroups(final String... groups) {
        this.groups = new ArrayList<>(Arrays.asList(groups));
    }

    public void setGroups(final java.util.List<String> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeChangeGroupsActionImpl that = (DiscountCodeChangeGroupsActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(groups, that.groups).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(groups).toHashCode();
    }

}
