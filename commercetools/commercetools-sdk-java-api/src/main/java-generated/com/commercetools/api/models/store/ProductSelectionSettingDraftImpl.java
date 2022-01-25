
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
public class ProductSelectionSettingDraftImpl implements ProductSelectionSettingDraft, ModelBase {

    private com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection;

    private Boolean active;

    @JsonCreator
    ProductSelectionSettingDraftImpl(
            @JsonProperty("productSelection") final com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier productSelection,
            @JsonProperty("active") final Boolean active) {
        this.productSelection = productSelection;
        this.active = active;
    }

    public ProductSelectionSettingDraftImpl() {
    }

    /**
    *  <p>Resource Identifier of a Product Selection</p>
    */
    public com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier getProductSelection() {
        return this.productSelection;
    }

    /**
    *  <p>If <code>true</code> all Products assigned to this Product Selection become part of the Store's assortment.</p>
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

        ProductSelectionSettingDraftImpl that = (ProductSelectionSettingDraftImpl) o;

        return new EqualsBuilder().append(productSelection, that.productSelection)
                .append(active, that.active)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productSelection).append(active).toHashCode();
    }

}
