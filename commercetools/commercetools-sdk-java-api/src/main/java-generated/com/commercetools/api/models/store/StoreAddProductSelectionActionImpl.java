
package com.commercetools.api.models.store;

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
 *  <p>To make all included Products available to your customers of a given Store, add the Product Selections to the respective Store. This action has no effect if the given Product Selection is already present in the Store and has the same <code>active</code> flag.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreAddProductSelectionActionImpl implements StoreAddProductSelectionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection;

    private Boolean active;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreAddProductSelectionActionImpl(
            @JsonProperty("productSelection") final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection,
            @JsonProperty("active") final Boolean active) {
        this.productSelection = productSelection;
        this.active = active;
        this.action = ADD_PRODUCT_SELECTION;
    }

    /**
     * create empty instance
     */
    public StoreAddProductSelectionActionImpl() {
        this.action = ADD_PRODUCT_SELECTION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Product Selection to add to the Store either activated or deactivated.</p>
     */

    public com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier getProductSelection() {
        return this.productSelection;
    }

    /**
     *  <p>Set to <code>true</code> to make all Products assigned to the referenced Product Selection available in the Store.</p>
     */

    public Boolean getActive() {
        return this.active;
    }

    public void setProductSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection) {
        this.productSelection = productSelection;
    }

    public void setActive(final Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreAddProductSelectionActionImpl that = (StoreAddProductSelectionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(productSelection, that.productSelection)
                .append(active, that.active)
                .append(action, that.action)
                .append(productSelection, that.productSelection)
                .append(active, that.active)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(productSelection).append(active).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("productSelection", productSelection)
                .append("active", active)
                .build();
    }

    @Override
    public StoreAddProductSelectionAction copyDeep() {
        return StoreAddProductSelectionAction.deepCopy(this);
    }
}
