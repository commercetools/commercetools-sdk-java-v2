package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.EnumFieldImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>A field with a enum value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = EnumFieldImpl.class)
public interface EnumField extends CustomField {

    
    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setValue(final String value);

    public static EnumFieldImpl of(){
        return new EnumFieldImpl();
    }
    

    public static EnumFieldImpl of(final EnumField template) {
        EnumFieldImpl instance = new EnumFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withEnumField(Function<EnumField, T> helper) {
        return helper.apply(this);
    }
}
