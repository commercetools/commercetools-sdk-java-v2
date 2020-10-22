package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.BooleanFieldImpl;

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
*  <p>A field with a boolean value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = BooleanFieldImpl.class)
public interface BooleanField extends CustomField {

    
    @NotNull
    @JsonProperty("value")
    public Boolean getValue();

    public void setValue(final Boolean value);

    public static BooleanFieldImpl of(){
        return new BooleanFieldImpl();
    }
    

    public static BooleanFieldImpl of(final BooleanField template) {
        BooleanFieldImpl instance = new BooleanFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    default <T extends Accessor<BooleanField>> T withBooleanField(Function<BooleanField, T> helper) {
        return helper.apply(this);
    }
}
