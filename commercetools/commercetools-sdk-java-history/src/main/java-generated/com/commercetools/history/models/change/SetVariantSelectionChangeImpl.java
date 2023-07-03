
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
 *  <p>Change triggered by the Set Variant Selection update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetVariantSelectionChangeImpl implements SetVariantSelectionChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.ProductVariantSelection previousValue;

    private com.commercetools.history.models.common.ProductVariantSelection nextValue;

    private com.commercetools.history.models.common.Reference product;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetVariantSelectionChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.ProductVariantSelection previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.ProductVariantSelection nextValue,
            @JsonProperty("product") final com.commercetools.history.models.common.Reference product) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.product = product;
        this.type = SET_VARIANT_SELECTION_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetVariantSelectionChangeImpl() {
        this.type = SET_VARIANT_SELECTION_CHANGE;
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
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.ProductVariantSelection getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.ProductVariantSelection getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Reference to the updated Product.</p>
     */

    public com.commercetools.history.models.common.Reference getProduct() {
        return this.product;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.ProductVariantSelection previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.ProductVariantSelection nextValue) {
        this.nextValue = nextValue;
    }

    public void setProduct(final com.commercetools.history.models.common.Reference product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetVariantSelectionChangeImpl that = (SetVariantSelectionChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(product, that.product)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(product)
                .toHashCode();
    }

}
