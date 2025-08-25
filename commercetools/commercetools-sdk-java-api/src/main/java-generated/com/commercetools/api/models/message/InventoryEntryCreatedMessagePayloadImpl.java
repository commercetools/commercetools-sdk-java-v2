
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/inventory:POST" rel="nofollow">Create InventoryEntry</a> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryCreatedMessagePayloadImpl implements InventoryEntryCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.inventory.InventoryEntry inventoryEntry;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntryCreatedMessagePayloadImpl(
            @JsonProperty("inventoryEntry") final com.commercetools.api.models.inventory.InventoryEntry inventoryEntry) {
        this.inventoryEntry = inventoryEntry;
        this.type = INVENTORY_ENTRY_CREATED;
    }

    /**
     * create empty instance
     */
    public InventoryEntryCreatedMessagePayloadImpl() {
        this.type = INVENTORY_ENTRY_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> that was created.</p>
     */

    public com.commercetools.api.models.inventory.InventoryEntry getInventoryEntry() {
        return this.inventoryEntry;
    }

    public void setInventoryEntry(final com.commercetools.api.models.inventory.InventoryEntry inventoryEntry) {
        this.inventoryEntry = inventoryEntry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntryCreatedMessagePayloadImpl that = (InventoryEntryCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(inventoryEntry, that.inventoryEntry)
                .append(type, that.type)
                .append(inventoryEntry, that.inventoryEntry)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(inventoryEntry).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("inventoryEntry", inventoryEntry)
                .build();
    }

    @Override
    public InventoryEntryCreatedMessagePayload copyDeep() {
        return InventoryEntryCreatedMessagePayload.deepCopy(this);
    }
}
