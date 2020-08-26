package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.NumberFieldImpl;

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
*  <p>A field with a number value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = NumberFieldImpl.class)
public interface NumberField extends CustomField {


    @NotNull
    @JsonProperty("value")
    public Double getValue();

    public void setValue(final Double value);

    public static NumberFieldImpl of(){
        return new NumberFieldImpl();
    }


    public static NumberFieldImpl of(final NumberField template) {
        NumberFieldImpl instance = new NumberFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

}
