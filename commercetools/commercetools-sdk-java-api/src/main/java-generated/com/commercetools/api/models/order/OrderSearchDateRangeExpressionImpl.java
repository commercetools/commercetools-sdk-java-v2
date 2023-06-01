package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchDateRangeValue;
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
 * OrderSearchDateRangeExpression
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchDateRangeExpressionImpl implements OrderSearchDateRangeExpression, ModelBase {

    
    private com.commercetools.api.models.order.OrderSearchDateRangeValue range;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchDateRangeExpressionImpl(@JsonProperty("range") final com.commercetools.api.models.order.OrderSearchDateRangeValue range) {
        this.range = range;
    }
    /**
     * create empty instance
     */
    public OrderSearchDateRangeExpressionImpl() {
    }

    /**
     *
     */
    
    public com.commercetools.api.models.order.OrderSearchDateRangeValue getRange(){
        return this.range;
    }

    
    public void setRange(final com.commercetools.api.models.order.OrderSearchDateRangeValue range){
        this.range = range;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderSearchDateRangeExpressionImpl that = (OrderSearchDateRangeExpressionImpl) o;
    
        return new EqualsBuilder()
                .append(range, that.range)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(range)
            .toHashCode();
    }

}
