
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
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
 *  <p>Returned when a Product is already assigned to a <span>Product Selection</span>, but the Product Selection has either a different <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantSelection" rel="nofollow">Product Variant Selection</a> or a different <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantExclusion" rel="nofollow">Product Variant Exclusion</a>.</p>
 *  <p>The error is returned as a failed response either to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionAddProductAction" rel="nofollow">Add Product</a> or to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionExcludeProductAction" rel="nofollow">Exclude Product</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPresentWithDifferentVariantSelectionErrorImpl
        implements ProductPresentWithDifferentVariantSelectionError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.product_selection.ProductVariantSelection existingVariantSelection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPresentWithDifferentVariantSelectionErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("existingVariantSelection") final com.commercetools.api.models.product_selection.ProductVariantSelection existingVariantSelection) {
        this.message = message;
        this.values = values;
        this.product = product;
        this.existingVariantSelection = existingVariantSelection;
        this.code = PRODUCT_PRESENT_WITH_DIFFERENT_VARIANT_SELECTION;
    }

    /**
     * create empty instance
     */
    public ProductPresentWithDifferentVariantSelectionErrorImpl() {
        this.code = PRODUCT_PRESENT_WITH_DIFFERENT_VARIANT_SELECTION;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Product is already present with the following different $variantSelections."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> for which the error was returned.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Existing Product Variant Selection or Exclusion for the <span>Product</span> in the <span>Product Selection</span>.</p>
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelection getExistingVariantSelection() {
        return this.existingVariantSelection;
    }

    public void setMessage(final String message) {
        this.message = message;
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

        ProductPresentWithDifferentVariantSelectionErrorImpl that = (ProductPresentWithDifferentVariantSelectionErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(product, that.product)
                .append(existingVariantSelection, that.existingVariantSelection)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(product, that.product)
                .append(existingVariantSelection, that.existingVariantSelection)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(product)
                .append(existingVariantSelection)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("product", product)
                .append("existingVariantSelection", existingVariantSelection)
                .build();
    }

    @Override
    public ProductPresentWithDifferentVariantSelectionError copyDeep() {
        return ProductPresentWithDifferentVariantSelectionError.deepCopy(this);
    }
}
