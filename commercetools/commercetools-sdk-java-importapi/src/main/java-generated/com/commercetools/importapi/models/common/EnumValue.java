package com.commercetools.importapi.models.common;


import com.commercetools.importapi.models.common.EnumValueImpl;

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
@JsonDeserialize(as = EnumValueImpl.class)
public interface EnumValue  {

    
    @NotNull
    @JsonProperty("key")
    public String getKey();
    
    @NotNull
    @JsonProperty("label")
    public String getLabel();

    public void setKey(final String key);
    
    public void setLabel(final String label);

    public static EnumValue of(){
        return new EnumValueImpl();
    }
    

    public static EnumValue of(final EnumValue template) {
        EnumValueImpl instance = new EnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static EnumValueBuilder builder(){
        return EnumValueBuilder.of();
    }
    
    public static EnumValueBuilder builder(final EnumValue template){
        return EnumValueBuilder.of(template);
    }
    

    default <T> T withEnumValue(Function<EnumValue, T> helper) {
        return helper.apply(this);
    }
}
