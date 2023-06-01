package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
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
 * CartSetLocaleAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetLocaleActionImpl implements CartSetLocaleAction, ModelBase {

    
    private String action;
    
    
    private String locale;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetLocaleActionImpl(@JsonProperty("locale") final String locale) {
        this.locale = locale;
        this.action =  SET_LOCALE;
    }
    /**
     * create empty instance
     */
    public CartSetLocaleActionImpl() {
        this.action =  SET_LOCALE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. Must be one of the Project's <code>languages</code>. If empty, any existing value will be removed.</p>
     */
    
    public String getLocale(){
        return this.locale;
    }

    
    public void setLocale(final String locale){
        this.locale = locale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartSetLocaleActionImpl that = (CartSetLocaleActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(locale, that.locale)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(locale)
            .toHashCode();
    }

}
