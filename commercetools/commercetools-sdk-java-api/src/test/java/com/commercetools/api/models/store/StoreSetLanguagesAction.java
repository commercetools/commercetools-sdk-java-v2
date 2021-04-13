package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoreSetLanguagesActionImpl;

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
@JsonDeserialize(as = StoreSetLanguagesActionImpl.class)
public interface StoreSetLanguagesAction extends StoreUpdateAction {

    String SET_LANGUAGES = "setLanguages";

    
    
    @JsonProperty("languages")
    public List<String> getLanguages();

    
    @JsonIgnore
    public void setLanguages(final String ...languages);
    public void setLanguages(final List<String> languages);

    public static StoreSetLanguagesAction of(){
        return new StoreSetLanguagesActionImpl();
    }
    

    public static StoreSetLanguagesAction of(final StoreSetLanguagesAction template) {
        StoreSetLanguagesActionImpl instance = new StoreSetLanguagesActionImpl();
        instance.setLanguages(template.getLanguages());
        return instance;
    }

    public static StoreSetLanguagesActionBuilder builder(){
        return StoreSetLanguagesActionBuilder.of();
    }
    
    public static StoreSetLanguagesActionBuilder builder(final StoreSetLanguagesAction template){
        return StoreSetLanguagesActionBuilder.of(template);
    }
    

    default <T> T withStoreSetLanguagesAction(Function<StoreSetLanguagesAction, T> helper) {
        return helper.apply(this);
    }
}
