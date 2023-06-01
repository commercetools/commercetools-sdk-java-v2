package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.product_selection.ProductVariantSelectionExclusion;
import com.commercetools.api.models.product_selection.ProductVariantSelectionIncludeAllExcept;
import com.commercetools.api.models.product_selection.ProductVariantSelectionIncludeOnly;
import com.commercetools.api.models.product_selection.ProductVariantSelectionInclusion;
import com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum;
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
 *  <p>Polymorphic base type for Product Variant Selections. The actual type is determined by the <code>type</code> field.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductVariantSelectionImpl implements ProductVariantSelection, ModelBase {

    
    private com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantSelectionImpl(@JsonProperty("type") final com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum type) {
        this.type = type;
    }
    /**
     * create empty instance
     */
    public ProductVariantSelectionImpl() {
    }

    /**
     *  <p>Determines whether the SKUs are to be included in, or excluded from, the Product Selection.</p>
     */
    
    public com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum getType(){
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductVariantSelectionImpl that = (ProductVariantSelectionImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .toHashCode();
    }

}
