package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderRemoveDiscountCodeActionImpl implements StagedOrderRemoveDiscountCodeAction {

    private String action;
    
    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    @JsonCreator
    StagedOrderRemoveDiscountCodeActionImpl(@JsonProperty("discountCode") final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        this.action = "removeDiscountCode";
    }
    public StagedOrderRemoveDiscountCodeActionImpl() {
        this.action = "removeDiscountCode";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode(){
        return this.discountCode;
    }

    public void setDiscountCode(final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode){
        this.discountCode = discountCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderRemoveDiscountCodeActionImpl that = (StagedOrderRemoveDiscountCodeActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(discountCode, that.discountCode)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(discountCode)
            .toHashCode();
    }

}
