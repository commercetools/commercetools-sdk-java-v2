package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.LocalizedEnumSetFieldImpl;

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
*  <p>A field with a localized enum set value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = LocalizedEnumSetFieldImpl.class)
public interface LocalizedEnumSetField extends CustomField {

    
    @NotNull
    @JsonProperty("value")
    public List<String> getValue();

    @JsonIgnore
    public void setValue(final String ...value);
    public void setValue(final List<String> value);

    public static LocalizedEnumSetField of(){
        return new LocalizedEnumSetFieldImpl();
    }
    

    public static LocalizedEnumSetField of(final LocalizedEnumSetField template) {
        LocalizedEnumSetFieldImpl instance = new LocalizedEnumSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static LocalizedEnumSetFieldBuilder builder(){
        return LocalizedEnumSetFieldBuilder.of();
    }
    
    public static LocalizedEnumSetFieldBuilder builder(final LocalizedEnumSetField template){
        return LocalizedEnumSetFieldBuilder.of(template);
    }
    

    default <T> T withLocalizedEnumSetField(Function<LocalizedEnumSetField, T> helper) {
        return helper.apply(this);
    }
}
