
package com.commercetools.api.models.inventory;

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
 * InventoryEntryUpdate
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryUpdateImpl implements InventoryEntryUpdate, ModelBase {

    private Long version;

    private java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> actions;

    @JsonCreator
    InventoryEntryUpdateImpl(@JsonProperty("version") final Long version,
            @JsonProperty("actions") final java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> actions) {
        this.version = version;
        this.actions = actions;
    }

    public InventoryEntryUpdateImpl() {
    }

    /**
     *  <p>Expected version of the InventoryEntry on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the InventoryEntry.</p>
     */

    public java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> getActions() {
        return this.actions;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setActions(final com.commercetools.api.models.inventory.InventoryEntryUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
    }

    public void setActions(
            final java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntryUpdateImpl that = (InventoryEntryUpdateImpl) o;

        return new EqualsBuilder().append(version, that.version).append(actions, that.actions).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(actions).toHashCode();
    }

}
