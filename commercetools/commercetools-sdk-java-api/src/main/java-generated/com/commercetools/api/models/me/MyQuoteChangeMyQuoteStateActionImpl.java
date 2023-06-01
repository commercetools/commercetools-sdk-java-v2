package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyQuoteState;
import com.commercetools.api.models.me.MyQuoteUpdateAction;
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
 *  <p>When accepting, declining, or renegotiating B2B Quotes, the Customer must have the <code>AcceptMyQuotes</code>, <code>DeclineMyQuotes</code>, or <code>RenegotiateMyQuotes</code> Permission, respectively. If the required Permission is missing, an AssociateMissingPermission error is returned.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyQuoteChangeMyQuoteStateActionImpl implements MyQuoteChangeMyQuoteStateAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.me.MyQuoteState quoteState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyQuoteChangeMyQuoteStateActionImpl(@JsonProperty("quoteState") final com.commercetools.api.models.me.MyQuoteState quoteState) {
        this.quoteState = quoteState;
        this.action =  CHANGE_MY_QUOTE_STATE;
    }
    /**
     * create empty instance
     */
    public MyQuoteChangeMyQuoteStateActionImpl() {
        this.action =  CHANGE_MY_QUOTE_STATE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New state to be set for the Quote.</p>
     */
    
    public com.commercetools.api.models.me.MyQuoteState getQuoteState(){
        return this.quoteState;
    }

    
    public void setQuoteState(final com.commercetools.api.models.me.MyQuoteState quoteState){
        this.quoteState = quoteState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyQuoteChangeMyQuoteStateActionImpl that = (MyQuoteChangeMyQuoteStateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(quoteState, that.quoteState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(quoteState)
            .toHashCode();
    }

}
