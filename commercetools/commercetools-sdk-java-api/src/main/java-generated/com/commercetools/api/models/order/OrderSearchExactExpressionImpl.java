package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchAnyValue;
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
 * OrderSearchExactExpression
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchExactExpressionImpl implements OrderSearchExactExpression, ModelBase {

    
    private com.commercetools.api.models.order.OrderSearchAnyValue exact;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchExactExpressionImpl(@JsonProperty("exact") final com.commercetools.api.models.order.OrderSearchAnyValue exact) {
        this.exact = exact;
    }
    /**
     * create empty instance
     */
    public OrderSearchExactExpressionImpl() {
    }

    /**
     *
     */
    
    public com.commercetools.api.models.order.OrderSearchAnyValue getExact(){
        return this.exact;
    }

    
    public void setExact(final com.commercetools.api.models.order.OrderSearchAnyValue exact){
        this.exact = exact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderSearchExactExpressionImpl that = (OrderSearchExactExpressionImpl) o;
    
        return new EqualsBuilder()
                .append(exact, that.exact)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(exact)
            .toHashCode();
    }

}
