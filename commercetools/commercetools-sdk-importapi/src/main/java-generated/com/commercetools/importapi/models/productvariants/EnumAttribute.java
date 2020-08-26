package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.EnumAttributeImpl;

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
*  <p>This type represents an attribute which value is an enum.
*  The attribute value refers to the key of the enum value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = EnumAttributeImpl.class)
public interface EnumAttribute extends Attribute {

    
    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setValue(final String value);

    public static EnumAttributeImpl of(){
        return new EnumAttributeImpl();
    }
    

    public static EnumAttributeImpl of(final EnumAttribute template) {
        EnumAttributeImpl instance = new EnumAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

}
