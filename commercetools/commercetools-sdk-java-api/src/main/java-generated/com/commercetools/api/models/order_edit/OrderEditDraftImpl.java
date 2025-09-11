
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
 * OrderEditDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditDraftImpl implements OrderEditDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.order.OrderReference resource;

    private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private String comment;

    private Boolean dryRun;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderEditDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("resource") final com.commercetools.api.models.order.OrderReference resource,
            @JsonProperty("stagedActions") final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("comment") final String comment, @JsonProperty("dryRun") final Boolean dryRun) {
        this.key = key;
        this.resource = resource;
        this.stagedActions = stagedActions;
        this.custom = custom;
        this.comment = comment;
        this.dryRun = dryRun;
    }

    /**
     * create empty instance
     */
    public OrderEditDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the Order Edit.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Order updated with this edit.</p>
     */

    public com.commercetools.api.models.order.OrderReference getResource() {
        return this.resource;
    }

    /**
     *  <p>Update actions to apply to the Order referenced in <code>resource</code>. Cannot be updated if the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders/edits/{id}/apply:POST" rel="nofollow">edit has been applied</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions() {
        return this.stagedActions;
    }

    /**
     *  <p>Custom Fields for the Order Edit.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>User-defined description regarding the Order Edit.</p>
     */

    public String getComment() {
        return this.comment;
    }

    /**
     *  <p>Set to <code>true</code> if you want to <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEditPreviewSuccess" rel="nofollow">preview</a> the edited Order first without persisting it (dry run). A dry run allows checking for potential <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEditPreviewFailure" rel="nofollow">errors</a> when trying to apply the <code>stagedActions</code>.</p>
     *  <p>Order <span>API Extensions</span>, if any, are also called in dry runs.</p>
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setResource(final com.commercetools.api.models.order.OrderReference resource) {
        this.resource = resource;
    }

    public void setStagedActions(final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        this.stagedActions = new ArrayList<>(Arrays.asList(stagedActions));
    }

    public void setStagedActions(
            final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
        this.stagedActions = stagedActions;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setComment(final String comment) {
        this.comment = comment;
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

        OrderEditDraftImpl that = (OrderEditDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(resource, that.resource)
                .append(stagedActions, that.stagedActions)
                .append(custom, that.custom)
                .append(comment, that.comment)
                .append(dryRun, that.dryRun)
                .append(key, that.key)
                .append(resource, that.resource)
                .append(stagedActions, that.stagedActions)
                .append(custom, that.custom)
                .append(comment, that.comment)
                .append(dryRun, that.dryRun)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(resource)
                .append(stagedActions)
                .append(custom)
                .append(comment)
                .append(dryRun)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("resource", resource)
                .append("stagedActions", stagedActions)
                .append("custom", custom)
                .append("comment", comment)
                .append("dryRun", dryRun)
                .build();
    }

    @Override
    public OrderEditDraft copyDeep() {
        return OrderEditDraft.deepCopy(this);
    }
}
