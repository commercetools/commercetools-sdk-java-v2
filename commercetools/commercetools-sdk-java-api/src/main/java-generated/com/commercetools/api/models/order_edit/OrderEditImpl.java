
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
public final class OrderEditImpl implements OrderEdit {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private com.commercetools.api.models.order.OrderReference resource;

    private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;

    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.order_edit.OrderEditResult result;

    private String comment;

    @JsonCreator
    OrderEditImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("key") final String key,
            @JsonProperty("resource") final com.commercetools.api.models.order.OrderReference resource,
            @JsonProperty("stagedActions") final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("result") final com.commercetools.api.models.order_edit.OrderEditResult result,
            @JsonProperty("comment") final String comment) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.resource = resource;
        this.stagedActions = stagedActions;
        this.custom = custom;
        this.result = result;
        this.comment = comment;
    }

    public OrderEditImpl() {
    }

    /**
    *  <p>The unique ID of the OrderEdit.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>The current version of the OrderEdit.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
    *  <p>Unique identifier for this edit.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>The order to be updated with this edit.</p>
    */
    public com.commercetools.api.models.order.OrderReference getResource() {
        return this.resource;
    }

    /**
    *  <p>The actions to apply to the Order.
    *  Cannot be updated after the edit has been applied.</p>
    */
    public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions() {
        return this.stagedActions;
    }

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
    *  <p>Contains a preview of the changes in case of unapplied edit.
    *  For applied edits, it contains the summary of the changes.</p>
    */
    public com.commercetools.api.models.order_edit.OrderEditResult getResult() {
        return this.result;
    }

    /**
    *  <p>This field can be used to add textual information regarding the edit.</p>
    */
    public String getComment() {
        return this.comment;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
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

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setResult(final com.commercetools.api.models.order_edit.OrderEditResult result) {
        this.result = result;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderEditImpl that = (OrderEditImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(resource, that.resource)
                .append(stagedActions, that.stagedActions)
                .append(custom, that.custom)
                .append(result, that.result)
                .append(comment, that.comment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(key)
                .append(resource)
                .append(stagedActions)
                .append(custom)
                .append(result)
                .append(comment)
                .toHashCode();
    }

}
