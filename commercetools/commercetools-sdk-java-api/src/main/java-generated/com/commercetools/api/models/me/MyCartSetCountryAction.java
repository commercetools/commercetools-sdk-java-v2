package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartSetCountryActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyCartSetCountryActionImpl.class)
public interface MyCartSetCountryAction extends MyCartUpdateAction {

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    
    @JsonProperty("country")
    public String getCountry();

    public void setCountry(final String country);

    public static MyCartSetCountryAction of(){
        return new MyCartSetCountryActionImpl();
    }
    

    public static MyCartSetCountryAction of(final MyCartSetCountryAction template) {
        MyCartSetCountryActionImpl instance = new MyCartSetCountryActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    public static MyCartSetCountryActionBuilder builder(){
        return MyCartSetCountryActionBuilder.of();
    }
    
    public static MyCartSetCountryActionBuilder builder(final MyCartSetCountryAction template){
        return MyCartSetCountryActionBuilder.of(template);
    }
    

    default <T> T withMyCartSetCountryAction(Function<MyCartSetCountryAction, T> helper) {
        return helper.apply(this);
    }
}
