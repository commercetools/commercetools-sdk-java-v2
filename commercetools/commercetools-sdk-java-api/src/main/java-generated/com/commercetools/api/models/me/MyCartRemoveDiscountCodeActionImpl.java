package com.commercetools.api.models.me;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.me.MyCartUpdateAction;
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
 * MyCartRemoveDiscountCodeAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCartRemoveDiscountCodeActionImpl implements MyCartRemoveDiscountCodeAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartRemoveDiscountCodeActionImpl(@JsonProperty("discountCode") final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        this.action =  REMOVE_DISCOUNT_CODE;
    }
    /**
     * create empty instance
     */
    public MyCartRemoveDiscountCodeActionImpl() {
        this.action =  REMOVE_DISCOUNT_CODE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Discount Code to remove from the Cart.</p>
     */
    
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
    
        MyCartRemoveDiscountCodeActionImpl that = (MyCartRemoveDiscountCodeActionImpl) o;
    
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
