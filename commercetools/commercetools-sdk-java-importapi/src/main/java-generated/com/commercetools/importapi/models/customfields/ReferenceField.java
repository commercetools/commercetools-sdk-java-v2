package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.ReferenceFieldImpl;

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
*  <p>A field with a reference value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReferenceFieldImpl.class)
public interface ReferenceField extends CustomField {

    /**
    *  <p>References a resource by its key.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public KeyReference getValue();

    public void setValue(final KeyReference value);

    public static ReferenceFieldImpl of(){
        return new ReferenceFieldImpl();
    }
    

    public static ReferenceFieldImpl of(final ReferenceField template) {
        ReferenceFieldImpl instance = new ReferenceFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withReferenceField(Function<ReferenceField, T> helper) {
        return helper.apply(this);
    }
}
