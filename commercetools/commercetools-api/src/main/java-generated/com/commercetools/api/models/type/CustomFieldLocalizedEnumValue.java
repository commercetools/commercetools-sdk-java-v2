package com.commercetools.api.models.type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldLocalizedEnumValueImpl;

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
@JsonDeserialize(as = CustomFieldLocalizedEnumValueImpl.class)
public interface CustomFieldLocalizedEnumValue  {

    
    @NotNull
    @JsonProperty("key")
    public String getKey();
    
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setKey(final String key);
    
    public void setLabel(final LocalizedString label);

    public static CustomFieldLocalizedEnumValueImpl of(){
        return new CustomFieldLocalizedEnumValueImpl();
    }
    

    public static CustomFieldLocalizedEnumValueImpl of(final CustomFieldLocalizedEnumValue template) {
        CustomFieldLocalizedEnumValueImpl instance = new CustomFieldLocalizedEnumValueImpl();
        instance.setKey(template.getKey());
        instance.setLabel(template.getLabel());
        return instance;
    }

}
