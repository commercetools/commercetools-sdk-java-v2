
package com.commercetools.history.models.change;

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
 *  <p>Change triggered by the Add Product update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddProductChangeImpl implements AddProductChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.Reference nextValue;

    private com.commercetools.history.models.common.ProductVariantSelection variantSelection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AddProductChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.Reference nextValue,
            @JsonProperty("variantSelection") final com.commercetools.history.models.common.ProductVariantSelection variantSelection) {
        this.change = change;
        this.nextValue = nextValue;
        this.variantSelection = variantSelection;
        this.type = ADD_PRODUCT_CHANGE;
    }

    /**
     * create empty instance
     */
    public AddProductChangeImpl() {
        this.type = ADD_PRODUCT_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>The Product Variants included in the Product Selection.</p>
     */

    public com.commercetools.history.models.common.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
    }

    public void setVariantSelection(
            final com.commercetools.history.models.common.ProductVariantSelection variantSelection) {
        this.variantSelection = variantSelection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AddProductChangeImpl that = (AddProductChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(variantSelection, that.variantSelection)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(nextValue)
                .append(variantSelection)
                .toHashCode();
    }

}
