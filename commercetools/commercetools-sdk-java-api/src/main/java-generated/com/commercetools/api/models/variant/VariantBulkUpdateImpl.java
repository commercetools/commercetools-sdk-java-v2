
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>The request body for a bulk update of Variants.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateImpl implements VariantBulkUpdate, ModelBase {

    private java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateItem> items;

    private java.util.List<com.commercetools.api.models.variant.VariantUpdateAction> actions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantBulkUpdateImpl(
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateItem> items,
            @JsonProperty("actions") final java.util.List<com.commercetools.api.models.variant.VariantUpdateAction> actions) {
        this.items = items;
        this.actions = actions;
    }

    /**
     * create empty instance
     */
    public VariantBulkUpdateImpl() {
    }

    /**
     *  <p>List of Variants to update. Each item must identify the Variant by <code>id</code> or <code>key</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateItem> getItems() {
        return this.items;
    }

    /**
     *  <p>The update action to apply to each Variant. Only <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantPublishAction" rel="nofollow">Publish</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantUnpublishAction" rel="nofollow">Unpublish</a> actions are supported. An empty array results in a no-op: all items are returned as successful with no changes applied.</p>
     */

    public java.util.List<com.commercetools.api.models.variant.VariantUpdateAction> getActions() {
        return this.actions;
    }

    public void setItems(final com.commercetools.api.models.variant.VariantBulkUpdateItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateItem> items) {
        this.items = items;
    }

    public void setActions(final com.commercetools.api.models.variant.VariantUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
    }

    public void setActions(final java.util.List<com.commercetools.api.models.variant.VariantUpdateAction> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantBulkUpdateImpl that = (VariantBulkUpdateImpl) o;

        return new EqualsBuilder().append(items, that.items)
                .append(actions, that.actions)
                .append(items, that.items)
                .append(actions, that.actions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(items).append(actions).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("items", items)
                .append("actions", actions)
                .build();
    }

    @Override
    public VariantBulkUpdate copyDeep() {
        return VariantBulkUpdate.deepCopy(this);
    }
}
