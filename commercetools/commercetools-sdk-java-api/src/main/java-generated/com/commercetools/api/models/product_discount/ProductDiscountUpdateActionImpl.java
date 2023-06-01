package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountChangeIsActiveAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangeNameAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangePredicateAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangeSortOrderAction;
import com.commercetools.api.models.product_discount.ProductDiscountChangeValueAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetDescriptionAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetKeyAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetValidFromAndUntilAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetValidUntilAction;
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
 * ProductDiscountUpdateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductDiscountUpdateActionImpl implements ProductDiscountUpdateAction, ModelBase {

    
    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductDiscountUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    /**
     * create empty instance
     */
    public ProductDiscountUpdateActionImpl() {
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductDiscountUpdateActionImpl that = (ProductDiscountUpdateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .toHashCode();
    }

}
