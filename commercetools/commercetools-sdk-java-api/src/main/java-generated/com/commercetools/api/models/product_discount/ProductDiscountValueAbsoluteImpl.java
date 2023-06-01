package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.product_discount.ProductDiscountValue;
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
 *  <p>Discounts the Product's Price by a fixed amount, defined by the <code>money</code> field.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductDiscountValueAbsoluteImpl implements ProductDiscountValueAbsolute, ModelBase {

    
    private String type;
    
    
    private java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductDiscountValueAbsoluteImpl(@JsonProperty("money") final java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money) {
        this.money = money;
        this.type =  ABSOLUTE;
    }
    /**
     * create empty instance
     */
    public ProductDiscountValueAbsoluteImpl() {
        this.type =  ABSOLUTE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     */
    
    public java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> getMoney(){
        return this.money;
    }

    
    public void setMoney(final com.commercetools.api.models.common.CentPrecisionMoney ...money){
       this.money = new ArrayList<>(Arrays.asList(money));
    }
    
    
    public void setMoney(final java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money){
       this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductDiscountValueAbsoluteImpl that = (ProductDiscountValueAbsoluteImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(money, that.money)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(money)
            .toHashCode();
    }

}
