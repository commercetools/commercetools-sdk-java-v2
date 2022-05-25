
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Reference to a InventoryEntry.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryReferenceImpl implements InventoryEntryReference, ModelBase {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String id;

    private com.commercetools.api.models.inventory.InventoryEntry obj;

    @JsonCreator
    InventoryEntryReferenceImpl(@JsonProperty("id") final String id,
            @JsonProperty("obj") final com.commercetools.api.models.inventory.InventoryEntry obj) {
        this.id = id;
        this.obj = obj;
        this.typeId = ReferenceTypeId.findEnum("inventory-entry");
    }

    public InventoryEntryReferenceImpl() {
        this.typeId = ReferenceTypeId.findEnum("inventory-entry");
    }

    /**
     *  <p>Type of referenced resource.</p>
     */

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     *  <p>Unique identifier of the referenced InventoryEntry.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded InventoryEntry. Only present in responses to requests with Reference Expansion for InventoryEntries.</p>
     */

    public com.commercetools.api.models.inventory.InventoryEntry getObj() {
        return this.obj;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setObj(final com.commercetools.api.models.inventory.InventoryEntry obj) {
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntryReferenceImpl that = (InventoryEntryReferenceImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId).append(id, that.id).append(obj, that.obj).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(id).append(obj).toHashCode();
    }

}
