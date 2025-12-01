
package com.commercetools.history.models.common;

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
 * ProductSelectionSetting
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionSettingImpl implements ProductSelectionSetting, ModelBase {

    private com.commercetools.history.models.common.ProductSelectionReference productSelection;

    private Boolean active;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionSettingImpl(
            @JsonProperty("productSelection") final com.commercetools.history.models.common.ProductSelectionReference productSelection,
            @JsonProperty("active") final Boolean active) {
        this.productSelection = productSelection;
        this.active = active;
    }

    /**
     * create empty instance
     */
    public ProductSelectionSettingImpl() {
    }

    /**
     *  <p>Reference to a ProductSelection.</p>
     */

    public com.commercetools.history.models.common.ProductSelectionReference getProductSelection() {
        return this.productSelection;
    }

    /**
     *  <p>If <code>true</code>, all Products assigned to this Product Selection are part of the Store's assortment.</p>
     */

    public Boolean getActive() {
        return this.active;
    }

    public void setProductSelection(
            final com.commercetools.history.models.common.ProductSelectionReference productSelection) {
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
                .append(productSelection, that.productSelection)
                .append(active, that.active)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productSelection).append(active).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("productSelection", productSelection)
                .append("active", active)
                .build();
    }

    @Override
    public ProductSelectionSetting copyDeep() {
        return ProductSelectionSetting.deepCopy(this);
    }
}
