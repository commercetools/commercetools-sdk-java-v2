package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.LocalizedEnumFieldImpl;

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

/**
*  <p>A field with a localized enum value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = LocalizedEnumFieldImpl.class)
public interface LocalizedEnumField extends CustomField {

    
    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setValue(final String value);

    public static LocalizedEnumFieldImpl of(){
        return new LocalizedEnumFieldImpl();
    }
    

    public static LocalizedEnumFieldImpl of(final LocalizedEnumField template) {
        LocalizedEnumFieldImpl instance = new LocalizedEnumFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withLocalizedEnumField(Function<LocalizedEnumField, T> helper) {
        return helper.apply(this);
    }
}
