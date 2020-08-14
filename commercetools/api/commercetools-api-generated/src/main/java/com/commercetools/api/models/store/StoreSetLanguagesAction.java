package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoreSetLanguagesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StoreSetLanguagesActionImpl.class)
public interface StoreSetLanguagesAction extends StoreUpdateAction {

    
    
    @JsonProperty("languages")
    public List<String> getLanguages();

    public void setLanguages(final List<String> languages);

    public static StoreSetLanguagesActionImpl of(){
        return new StoreSetLanguagesActionImpl();
    }
    

    public static StoreSetLanguagesActionImpl of(final StoreSetLanguagesAction template) {
        StoreSetLanguagesActionImpl instance = new StoreSetLanguagesActionImpl();
        instance.setLanguages(template.getLanguages());
        return instance;
    }

}
