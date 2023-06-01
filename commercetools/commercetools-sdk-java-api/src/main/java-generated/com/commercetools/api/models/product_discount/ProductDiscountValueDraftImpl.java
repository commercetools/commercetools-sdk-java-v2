package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteDraft;
import com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraft;
import com.commercetools.api.models.product_discount.ProductDiscountValueRelativeDraft;
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
 * ProductDiscountValueDraft
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductDiscountValueDraftImpl implements ProductDiscountValueDraft, ModelBase {

    
    private String type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductDiscountValueDraftImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    /**
     * create empty instance
     */
    public ProductDiscountValueDraftImpl() {
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductDiscountValueDraftImpl that = (ProductDiscountValueDraftImpl) o;
    
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
