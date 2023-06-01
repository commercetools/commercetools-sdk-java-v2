package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderSearchQueryExpressionValue;
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
 * OrderSearchNumberRangeValue
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSearchNumberRangeValueImpl implements OrderSearchNumberRangeValue, ModelBase {

    
    private String field;
    
    
    private Integer boost;
    
    
    private String customType;
    
    
    private Double gte;
    
    
    private Double lte;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSearchNumberRangeValueImpl(@JsonProperty("field") final String field, @JsonProperty("boost") final Integer boost, @JsonProperty("customType") final String customType, @JsonProperty("gte") final Double gte, @JsonProperty("lte") final Double lte) {
        this.field = field;
        this.boost = boost;
        this.customType = customType;
        this.gte = gte;
        this.lte = lte;
    }
    /**
     * create empty instance
     */
    public OrderSearchNumberRangeValueImpl() {
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
    
    /**
     *
     */
    
    public Double getGte(){
        return this.gte;
    }
    
    /**
     *
     */
    
    public Double getLte(){
        return this.lte;
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
    
    
    public void setGte(final Double gte){
        this.gte = gte;
    }
    
    
    public void setLte(final Double lte){
        this.lte = lte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderSearchNumberRangeValueImpl that = (OrderSearchNumberRangeValueImpl) o;
    
        return new EqualsBuilder()
                .append(field, that.field)
                .append(boost, that.boost)
                .append(customType, that.customType)
                .append(gte, that.gte)
                .append(lte, that.lte)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(field)
            .append(boost)
            .append(customType)
            .append(gte)
            .append(lte)
            .toHashCode();
    }

}
