package com.commercetools.history.models.change_value;

import com.commercetools.history.models.change_value.ChangeValueChangeValue;
import com.commercetools.history.models.common.Money;
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
 *  <p>Shape of the value for cart discounts absolute value.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeValueAbsoluteChangeValueImpl implements ChangeValueAbsoluteChangeValue, ModelBase {

    
    private String type;
    
    
    private java.util.List<com.commercetools.history.models.common.Money> money;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeValueAbsoluteChangeValueImpl(@JsonProperty("money") final java.util.List<com.commercetools.history.models.common.Money> money) {
        this.money = money;
        this.type =  ABSOLUTE;
    }
    /**
     * create empty instance
     */
    public ChangeValueAbsoluteChangeValueImpl() {
        this.type =  ABSOLUTE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.history.models.common.Money> getMoney(){
        return this.money;
    }

    
    public void setMoney(final com.commercetools.history.models.common.Money ...money){
       this.money = new ArrayList<>(Arrays.asList(money));
    }
    
    
    public void setMoney(final java.util.List<com.commercetools.history.models.common.Money> money){
       this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChangeValueAbsoluteChangeValueImpl that = (ChangeValueAbsoluteChangeValueImpl) o;
    
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
