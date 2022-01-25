
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StoreChangeProductSelectionActionImpl implements StoreChangeProductSelectionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.ResourceIdentifier productSelection;

    private Boolean active;

    @JsonCreator
    StoreChangeProductSelectionActionImpl(
            @JsonProperty("productSelection") final com.commercetools.api.models.common.ResourceIdentifier productSelection,
            @JsonProperty("active") final Boolean active) {
        this.productSelection = productSelection;
        this.active = active;
        this.action = CHANGE_PRODUCT_SELECTION_ACTIVE;
    }

    public StoreChangeProductSelectionActionImpl() {
        this.action = CHANGE_PRODUCT_SELECTION_ACTIVE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>A current Product Selection of this Store that is to be activated or deactivated.</p>
    */
    public com.commercetools.api.models.common.ResourceIdentifier getProductSelection() {
        return this.productSelection;
    }

    /**
    *  <p>If <code>true</code> all Products assigned to the Product Selection become part of the Store's assortment.</p>
    */
    public Boolean getActive() {
        return this.active;
    }

    public void setProductSelection(final com.commercetools.api.models.common.ResourceIdentifier productSelection) {
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
