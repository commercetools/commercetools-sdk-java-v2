
package com.commercetools.api.models.inventory;

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
 *  <p>Stock level thresholds for an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> that trigger Messages when stock levels reach certain points. For more information, see <span>Stock level notifications</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryStockLevelsImpl implements InventoryEntryStockLevels, ModelBase {

    private Integer reorderPoint;

    private Integer safetyStock;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntryStockLevelsImpl(@JsonProperty("reorderPoint") final Integer reorderPoint,
            @JsonProperty("safetyStock") final Integer safetyStock) {
        this.reorderPoint = reorderPoint;
        this.safetyStock = safetyStock;
    }

    /**
     * create empty instance
     */
    public InventoryEntryStockLevelsImpl() {
    }

    /**
     *  <p>When the <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> reaches this value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryReorderPointMessage" rel="nofollow">InventoryEntryReorderPoint</a> Message is generated.</p>
     */

    public Integer getReorderPoint() {
        return this.reorderPoint;
    }

    /**
     *  <p>When the <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> reaches this value, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySafetyStockMessage" rel="nofollow">InventoryEntrySafetyStock</a> Message is generated.</p>
     */

    public Integer getSafetyStock() {
        return this.safetyStock;
    }

    public void setReorderPoint(final Integer reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public void setSafetyStock(final Integer safetyStock) {
        this.safetyStock = safetyStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntryStockLevelsImpl that = (InventoryEntryStockLevelsImpl) o;

        return new EqualsBuilder().append(reorderPoint, that.reorderPoint)
                .append(safetyStock, that.safetyStock)
                .append(reorderPoint, that.reorderPoint)
                .append(safetyStock, that.safetyStock)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(reorderPoint).append(safetyStock).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("reorderPoint", reorderPoint)
                .append("safetyStock", safetyStock)
                .build();
    }

    @Override
    public InventoryEntryStockLevels copyDeep() {
        return InventoryEntryStockLevels.deepCopy(this);
    }
}
