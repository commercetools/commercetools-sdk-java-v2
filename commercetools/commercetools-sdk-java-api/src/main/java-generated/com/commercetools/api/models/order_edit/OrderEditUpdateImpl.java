
package com.commercetools.api.models.order_edit;

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
 * OrderEditUpdate
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditUpdateImpl implements OrderEditUpdate, ModelBase {

    private Long version;

    private java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions;

    private Boolean dryRun;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderEditUpdateImpl(@JsonProperty("version") final Long version,
            @JsonProperty("actions") final java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> actions,
            @JsonProperty("dryRun") final Boolean dryRun) {
        this.version = version;
        this.actions = actions;
        this.dryRun = dryRun;
    }

    /**
     * create empty instance
     */
    public OrderEditUpdateImpl() {
    }

    /**
     *  <p>Expected version of the Order Edit on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Order Edit.</p>
     */

    public java.util.List<com.commercetools.api.models.order_edit.OrderEditUpdateAction> getActions() {
        return this.actions;
    }

    /**
     *  <p>If set to <code>true</code>, the Order Edit is applied on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> without persisting it.</p>
     */

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
                .append(version, that.version)
                .append(actions, that.actions)
                .append(dryRun, that.dryRun)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(actions).append(dryRun).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("version", version)
                .append("actions", actions)
                .append("dryRun", dryRun)
                .build();
    }

    @Override
    public OrderEditUpdate copyDeep() {
        return OrderEditUpdate.deepCopy(this);
    }
}
