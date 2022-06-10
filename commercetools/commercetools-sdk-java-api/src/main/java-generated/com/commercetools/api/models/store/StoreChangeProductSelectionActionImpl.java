
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

/**
 *  <p>ProductSelection in a Store can be activated or deactivated using this update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreChangeProductSelectionActionImpl implements StoreChangeProductSelectionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection;

    private Boolean active;

    @JsonCreator
    StoreChangeProductSelectionActionImpl(
            @JsonProperty("productSelection") final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection,
            @JsonProperty("active") final Boolean active) {
        this.productSelection = productSelection;
        this.active = active;
        this.action = CHANGE_PRODUCT_SELECTION_ACTIVE;
    }

    public StoreChangeProductSelectionActionImpl() {
        this.action = CHANGE_PRODUCT_SELECTION_ACTIVE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Current Product Selection of the Store to be activated or deactivated.</p>
     */

    public com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier getProductSelection() {
        return this.productSelection;
    }

    /**
     *  <p>Set to <code>true</code> if all Products assigned to the Product Selection should become part of the Store's assortment.</p>
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

        StoreChangeProductSelectionActionImpl that = (StoreChangeProductSelectionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(productSelection, that.productSelection)
                .append(active, that.active)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(productSelection).append(active).toHashCode();
    }

}
