package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.EnumSetFieldImpl;

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
*  <p>A field with a enum set value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = EnumSetFieldImpl.class)
public interface EnumSetField extends CustomField {

    
    @NotNull
    @JsonProperty("value")
    public List<String> getValue();

    public void setValue(final List<String> value);

    public static EnumSetFieldImpl of(){
        return new EnumSetFieldImpl();
    }
    

    public static EnumSetFieldImpl of(final EnumSetField template) {
        EnumSetFieldImpl instance = new EnumSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    default <T extends Accessor<EnumSetField>> T withEnumSetField(Function<EnumSetField, T> helper) {
        return helper.apply(this);
    }
}
