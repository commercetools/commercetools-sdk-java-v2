package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttributeImpl;

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
*  <p>This type represents an attribute which value is a localized enum.
*  The attribute value refers to the key of the enum value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = LocalizableEnumSetAttributeImpl.class)
public interface LocalizableEnumSetAttribute extends Attribute {


    @NotNull
    @JsonProperty("value")
    public List<String> getValue();

    public void setValue(final List<String> value);

    public static LocalizableEnumSetAttributeImpl of(){
        return new LocalizableEnumSetAttributeImpl();
    }


    public static LocalizableEnumSetAttributeImpl of(final LocalizableEnumSetAttribute template) {
        LocalizableEnumSetAttributeImpl instance = new LocalizableEnumSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

}
