
package com.commercetools.api.models.error;

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
 *  <p>Returned when a Product is already assigned to a Product Selection, but the Product Selection has either a different Product Variant Selection or a different Product Variant Exclusion.</p>
 *  <p>The error is returned as a failed response either to the Add Product or to the Exclude Product update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLProductPresentWithDifferentVariantSelectionErrorImpl
        implements GraphQLProductPresentWithDifferentVariantSelectionError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.product_selection.ProductVariantSelection existingVariantSelection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLProductPresentWithDifferentVariantSelectionErrorImpl(
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("existingVariantSelection") final com.commercetools.api.models.product_selection.ProductVariantSelection existingVariantSelection) {
        this.values = values;
        this.product = product;
        this.existingVariantSelection = existingVariantSelection;
        this.code = PRODUCT_PRESENT_WITH_DIFFERENT_VARIANT_SELECTION;
    }

    /**
     * create empty instance
     */
    public GraphQLProductPresentWithDifferentVariantSelectionErrorImpl() {
        this.code = PRODUCT_PRESENT_WITH_DIFFERENT_VARIANT_SELECTION;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Existing Product Variant Selection or Exclusion for the Product in the Product Selection.</p>
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelection getExistingVariantSelection() {
        return this.existingVariantSelection;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    public void setExistingVariantSelection(
            final com.commercetools.api.models.product_selection.ProductVariantSelection existingVariantSelection) {
        this.existingVariantSelection = existingVariantSelection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLProductPresentWithDifferentVariantSelectionErrorImpl that = (GraphQLProductPresentWithDifferentVariantSelectionErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(product, that.product)
                .append(existingVariantSelection, that.existingVariantSelection)
                .append(code, that.code)
                .append(values, that.values)
                .append(product, that.product)
                .append(existingVariantSelection, that.existingVariantSelection)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(values)
                .append(product)
                .append(existingVariantSelection)
                .toHashCode();
    }

}
