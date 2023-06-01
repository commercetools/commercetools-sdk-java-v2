package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchQueryExpression;
import com.commercetools.api.models.order.OrderSearchStringValue;
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
 * OrderSearchPrefixExpression
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchPrefixExpressionImpl implements OrderSearchPrefixExpression, ModelBase {

    
    private com.commercetools.api.models.order.OrderSearchStringValue prefix;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchPrefixExpressionImpl(@JsonProperty("prefix") final com.commercetools.api.models.order.OrderSearchStringValue prefix) {
        this.prefix = prefix;
    }
    /**
     * create empty instance
     */
    public OrderSearchPrefixExpressionImpl() {
    }

    /**
     *
     */
    
    public com.commercetools.api.models.order.OrderSearchStringValue getPrefix(){
        return this.prefix;
    }

    
    public void setPrefix(final com.commercetools.api.models.order.OrderSearchStringValue prefix){
        this.prefix = prefix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderSearchPrefixExpressionImpl that = (OrderSearchPrefixExpressionImpl) o;
    
        return new EqualsBuilder()
                .append(prefix, that.prefix)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(prefix)
            .toHashCode();
    }

}
