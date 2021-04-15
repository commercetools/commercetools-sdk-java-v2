package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeKeyActionImpl;

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
@JsonDeserialize(as = TypeChangeKeyActionImpl.class)
public interface TypeChangeKeyAction extends TypeUpdateAction {

    String CHANGE_KEY = "changeKey";

    
    @NotNull
    @JsonProperty("key")
    public String getKey();

    
    public void setKey(final String key);
    

    public static TypeChangeKeyAction of(){
        return new TypeChangeKeyActionImpl();
    }
    

    public static TypeChangeKeyAction of(final TypeChangeKeyAction template) {
        TypeChangeKeyActionImpl instance = new TypeChangeKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static TypeChangeKeyActionBuilder builder(){
        return TypeChangeKeyActionBuilder.of();
    }
    
    public static TypeChangeKeyActionBuilder builder(final TypeChangeKeyAction template){
        return TypeChangeKeyActionBuilder.of(template);
    }
    

    default <T> T withTypeChangeKeyAction(Function<TypeChangeKeyAction, T> helper) {
        return helper.apply(this);
    }
}
