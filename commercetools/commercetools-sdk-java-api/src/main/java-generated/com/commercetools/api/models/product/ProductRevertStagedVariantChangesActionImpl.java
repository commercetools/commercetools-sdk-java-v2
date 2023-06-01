package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
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
 *  <p>Reverts the staged version of a ProductVariant to the current version.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductRevertStagedVariantChangesActionImpl implements ProductRevertStagedVariantChangesAction, ModelBase {

    
    private String action;
    
    
    private Long variantId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductRevertStagedVariantChangesActionImpl(@JsonProperty("variantId") final Long variantId) {
        this.variantId = variantId;
        this.action =  REVERT_STAGED_VARIANT_CHANGES;
    }
    /**
     * create empty instance
     */
    public ProductRevertStagedVariantChangesActionImpl() {
        this.action =  REVERT_STAGED_VARIANT_CHANGES;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>The <code>id</code> of the ProductVariant to revert.</p>
     */
    
    public Long getVariantId(){
        return this.variantId;
    }

    
    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductRevertStagedVariantChangesActionImpl that = (ProductRevertStagedVariantChangesActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(variantId, that.variantId)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(variantId)
            .toHashCode();
    }

}
