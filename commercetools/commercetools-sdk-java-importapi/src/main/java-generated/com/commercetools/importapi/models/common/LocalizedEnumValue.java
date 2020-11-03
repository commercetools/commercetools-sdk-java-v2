package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.LocalizedEnumValueImpl;

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
@JsonDeserialize(as = LocalizedEnumValueImpl.class)
public interface LocalizedEnumValue  {

    
    @NotNull
    @JsonProperty("key")
    public String getKey();
    
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setKey(final String key);
    
    public void setLabel(final LocalizedString label);

    public static LocalizedEnumValueImpl of(){
        return new LocalizedEnumValueImpl();
    }
    

    public static LocalizedEnumValueImpl of(final LocalizedEnumValue template) {
        LocalizedEnumValueImpl instance = new LocalizedEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

    default <T> T withLocalizedEnumValue(Function<LocalizedEnumValue, T> helper) {
        return helper.apply(this);
    }
}
