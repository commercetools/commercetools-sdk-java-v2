
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
public class StoreAddProductSelectionActionImpl implements StoreAddProductSelectionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.store.ProductSelectionSettingDraft productSelection;

    @JsonCreator
    StoreAddProductSelectionActionImpl(
            @JsonProperty("productSelection") final com.commercetools.api.models.store.ProductSelectionSettingDraft productSelection) {
        this.productSelection = productSelection;
        this.action = ADD_PRODUCT_SELECTION;
    }

    public StoreAddProductSelectionActionImpl() {
        this.action = ADD_PRODUCT_SELECTION;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>A Product Selection to be added to the current Product Selections of this Store.</p>
    */
    public com.commercetools.api.models.store.ProductSelectionSettingDraft getProductSelection() {
        return this.productSelection;
    }

    public void setProductSelection(
            final com.commercetools.api.models.store.ProductSelectionSettingDraft productSelection) {
        this.productSelection = productSelection;
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(productSelection).toHashCode();
    }

}
