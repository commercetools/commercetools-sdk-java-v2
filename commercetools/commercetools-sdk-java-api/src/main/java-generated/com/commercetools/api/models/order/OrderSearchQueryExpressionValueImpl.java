package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchAnyValue;
import com.commercetools.api.models.order.OrderSearchDateRangeValue;
import com.commercetools.api.models.order.OrderSearchFullTextValue;
import com.commercetools.api.models.order.OrderSearchLongRangeValue;
import com.commercetools.api.models.order.OrderSearchNumberRangeValue;
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
 * OrderSearchQueryExpressionValue
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchQueryExpressionValueImpl implements OrderSearchQueryExpressionValue, ModelBase {

    
    private String field;
    
    
    private Integer boost;
    
    
    private String customType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchQueryExpressionValueImpl(@JsonProperty("field") final String field, @JsonProperty("boost") final Integer boost, @JsonProperty("customType") final String customType) {
        this.field = field;
        this.boost = boost;
        this.customType = customType;
    }
    /**
     * create empty instance
     */
    public OrderSearchQueryExpressionValueImpl() {
    }

    /**
     *
     */
    
    public String getField(){
        return this.field;
    }
    
    /**
     *
     */
    
    public Integer getBoost(){
        return this.boost;
    }
    
    /**
     *
     */
    
    public String getCustomType(){
        return this.customType;
    }

    
    public void setField(final String field){
        this.field = field;
    }
    
    
    public void setBoost(final Integer boost){
        this.boost = boost;
    }
    
    
    public void setCustomType(final String customType){
        this.customType = customType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderSearchQueryExpressionValueImpl that = (OrderSearchQueryExpressionValueImpl) o;
    
        return new EqualsBuilder()
                .append(field, that.field)
                .append(boost, that.boost)
                .append(customType, that.customType)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(field)
            .append(boost)
            .append(customType)
            .toHashCode();
    }

}
