
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditUpdateImpl implements OrderEditUpdate {

    private Long version;

    private java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions;

    private Boolean dryRun;

    @JsonCreator
    OrderEditUpdateImpl(@JsonProperty("version") final Long version,
            @JsonProperty("actions") final java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions,
            @JsonProperty("dryRun") final Boolean dryRun) {
        this.version = version;
        this.actions = actions;
        this.dryRun = dryRun;
    }

    public OrderEditUpdateImpl() {
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> getActions() {
        return this.actions;
    }

    public Boolean getDryRun() {
        return this.dryRun;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setActions(final com.commercetools.api.models.order_edit.OrderEditUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
    }

    public void setActions(
            final java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions) {
        this.actions = actions;
    }

    public void setDryRun(final Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderEditUpdateImpl that = (OrderEditUpdateImpl) o;

        return new EqualsBuilder().append(version, that.version)
                .append(actions, that.actions)
                .append(dryRun, that.dryRun)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(actions).append(dryRun).toHashCode();
    }

}
