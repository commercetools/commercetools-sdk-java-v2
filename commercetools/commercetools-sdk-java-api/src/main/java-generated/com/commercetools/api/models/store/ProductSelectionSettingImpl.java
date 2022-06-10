
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
 * ProductSelectionSetting
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionSettingImpl implements ProductSelectionSetting, ModelBase {

    private com.commercetools.api.models.product_selection.ProductSelectionReference productSelection;

    private Boolean active;

    @JsonCreator
    ProductSelectionSettingImpl(
            @JsonProperty("productSelection") final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection,
            @JsonProperty("active") final Boolean active) {
        this.productSelection = productSelection;
        this.active = active;
    }

    public ProductSelectionSettingImpl() {
    }

    /**
     *  <p>Reference to a ProductSelection.</p>
     */

    public com.commercetools.api.models.product_selection.ProductSelectionReference getProductSelection() {
        return this.productSelection;
    }

    /**
     *  <p>If <code>true</code>, all Products assigned to this Product Selection are part of the Store's assortment.</p>
     */

    public Boolean getActive() {
        return this.active;
    }

    public void setProductSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection) {
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

        ProductSelectionSettingImpl that = (ProductSelectionSettingImpl) o;

        return new EqualsBuilder().append(productSelection, that.productSelection)
                .append(active, that.active)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productSelection).append(active).toHashCode();
    }

}
