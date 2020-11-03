package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeLocalizedEnumValueOrderActionImpl;

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
@JsonDeserialize(as = TypeChangeLocalizedEnumValueOrderActionImpl.class)
public interface TypeChangeLocalizedEnumValueOrderAction extends TypeUpdateAction {

    
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();
    
    @NotNull
    @JsonProperty("keys")
    public List<String> getKeys();

    public void setFieldName(final String fieldName);
    
    @JsonIgnore
    public void setKeys(final String ...keys);
    public void setKeys(final List<String> keys);

    public static TypeChangeLocalizedEnumValueOrderActionImpl of(){
        return new TypeChangeLocalizedEnumValueOrderActionImpl();
    }
    

    public static TypeChangeLocalizedEnumValueOrderActionImpl of(final TypeChangeLocalizedEnumValueOrderAction template) {
        TypeChangeLocalizedEnumValueOrderActionImpl instance = new TypeChangeLocalizedEnumValueOrderActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setKeys(template.getKeys());
        return instance;
    }

    default <T> T withTypeChangeLocalizedEnumValueOrderAction(Function<TypeChangeLocalizedEnumValueOrderAction, T> helper) {
        return helper.apply(this);
    }
}
