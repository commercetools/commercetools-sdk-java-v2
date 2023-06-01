package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantSelection;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Returned when a Product is already assigned to a Product Selection, but the Product Selection has either a different Product Variant Selection or a different Product Variant Exclusion.</p>
 *  <p>The error is returned as a failed response either to the Add Product or to the Exclude Product update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductPresentWithDifferentVariantSelectionErrorImpl implements ProductPresentWithDifferentVariantSelectionError, ModelBase {

    
    private String code;
    
    
    private String message;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private com.commercetools.api.models.product.ProductReference product;
    
    
    private com.commercetools.api.models.product_selection.ProductVariantSelection existingVariantSelection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPresentWithDifferentVariantSelectionErrorImpl(@JsonProperty("message") final String message, @JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product, @JsonProperty("existingVariantSelection") final com.commercetools.api.models.product_selection.ProductVariantSelection existingVariantSelection) {
        this.message = message;
        this.values = values;
        this.product = product;
        this.existingVariantSelection = existingVariantSelection;
        this.code =  PRODUCT_PRESENT_WITH_DIFFERENT_VARIANT_SELECTION;
    }
    /**
     * create empty instance
     */
    public ProductPresentWithDifferentVariantSelectionErrorImpl() {
        this.code =  PRODUCT_PRESENT_WITH_DIFFERENT_VARIANT_SELECTION;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *  <p><code>"Product is already present with the following different $variantSelections."</code></p>
     */
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     */
    
    public Map<String,java.lang.Object> values() {
        return values;
    }
    
    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     */
    
    public com.commercetools.api.models.product.ProductReference getProduct(){
        return this.product;
    }
    
    /**
     *  <p>Existing Product Variant Selection or Exclusion for the Product in the Product Selection.</p>
     */
    
    public com.commercetools.api.models.product_selection.ProductVariantSelection getExistingVariantSelection(){
        return this.existingVariantSelection;
    }

    
    public void setMessage(final String message){
        this.message = message;
    }
    
    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }
    
    
    public void setProduct(final com.commercetools.api.models.product.ProductReference product){
        this.product = product;
    }
    
    
    public void setExistingVariantSelection(final com.commercetools.api.models.product_selection.ProductVariantSelection existingVariantSelection){
        this.existingVariantSelection = existingVariantSelection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductPresentWithDifferentVariantSelectionErrorImpl that = (ProductPresentWithDifferentVariantSelectionErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(product, that.product)
                .append(existingVariantSelection, that.existingVariantSelection)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(values)
            .append(product)
            .append(existingVariantSelection)
            .toHashCode();
    }

}
