package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.ReferenceSetFieldImpl;

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
*  <p>A field with a reference set value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReferenceSetFieldImpl.class)
public interface ReferenceSetField extends CustomField {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public List<KeyReference> getValue();

    @JsonIgnore
    public void setValue(final KeyReference ...value);
    public void setValue(final List<KeyReference> value);

    public static ReferenceSetFieldImpl of(){
        return new ReferenceSetFieldImpl();
    }
    

    public static ReferenceSetFieldImpl of(final ReferenceSetField template) {
        ReferenceSetFieldImpl instance = new ReferenceSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withReferenceSetField(Function<ReferenceSetField, T> helper) {
        return helper.apply(this);
    }
}
