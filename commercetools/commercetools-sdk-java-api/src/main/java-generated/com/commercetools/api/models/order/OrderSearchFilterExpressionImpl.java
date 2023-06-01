package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchCompoundExpression;
import com.commercetools.api.models.order.OrderSearchQueryExpression;
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
 * OrderSearchFilterExpression
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchFilterExpressionImpl implements OrderSearchFilterExpression, ModelBase {

    
    private java.util.List<com.commercetools.api.models.order.OrderSearchQueryExpression> filter;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchFilterExpressionImpl(@JsonProperty("filter") final java.util.List<com.commercetools.api.models.order.OrderSearchQueryExpression> filter) {
        this.filter = filter;
    }
    /**
     * create empty instance
     */
    public OrderSearchFilterExpressionImpl() {
    }

    /**
     *
     */
    
    public java.util.List<com.commercetools.api.models.order.OrderSearchQueryExpression> getFilter(){
        return this.filter;
    }

    
    public void setFilter(final com.commercetools.api.models.order.OrderSearchQueryExpression ...filter){
       this.filter = new ArrayList<>(Arrays.asList(filter));
    }
    
    
    public void setFilter(final java.util.List<com.commercetools.api.models.order.OrderSearchQueryExpression> filter){
       this.filter = filter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderSearchFilterExpressionImpl that = (OrderSearchFilterExpressionImpl) o;
    
        return new EqualsBuilder()
                .append(filter, that.filter)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(filter)
            .toHashCode();
    }

}
