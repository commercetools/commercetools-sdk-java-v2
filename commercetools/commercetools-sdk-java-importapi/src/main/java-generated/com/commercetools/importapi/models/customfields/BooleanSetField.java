package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.BooleanSetFieldImpl;

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
*  <p>A field with a boolean set value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = BooleanSetFieldImpl.class)
public interface BooleanSetField extends CustomField {

    
    @NotNull
    @JsonProperty("value")
    public List<Boolean> getValue();

    @JsonIgnore
    public void setValue(final Boolean ...value);
    public void setValue(final List<Boolean> value);

    public static BooleanSetFieldImpl of(){
        return new BooleanSetFieldImpl();
    }
    

    public static BooleanSetFieldImpl of(final BooleanSetField template) {
        BooleanSetFieldImpl instance = new BooleanSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withBooleanSetField(Function<BooleanSetField, T> helper) {
        return helper.apply(this);
    }
}
