package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.LocalizableTextSetAttributeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>This type represents an attribute which value is a localized text.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = LocalizableTextSetAttributeImpl.class)
public interface LocalizableTextSetAttribute extends Attribute {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public List<LocalizedString> getValue();

    public void setValue(final List<LocalizedString> value);

    public static LocalizableTextSetAttributeImpl of(){
        return new LocalizableTextSetAttributeImpl();
    }
    

    public static LocalizableTextSetAttributeImpl of(final LocalizableTextSetAttribute template) {
        LocalizableTextSetAttributeImpl instance = new LocalizableTextSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

}
