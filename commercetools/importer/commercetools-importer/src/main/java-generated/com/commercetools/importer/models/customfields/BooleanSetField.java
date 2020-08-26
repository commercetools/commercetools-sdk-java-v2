package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.BooleanSetFieldImpl;

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

    public void setValue(final List<Boolean> value);

    public static BooleanSetFieldImpl of(){
        return new BooleanSetFieldImpl();
    }
    

    public static BooleanSetFieldImpl of(final BooleanSetField template) {
        BooleanSetFieldImpl instance = new BooleanSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

}
