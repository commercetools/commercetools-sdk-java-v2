package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.ReferenceSetFieldImpl;

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

    public void setValue(final List<KeyReference> value);

    public static ReferenceSetFieldImpl of(){
        return new ReferenceSetFieldImpl();
    }
    

    public static ReferenceSetFieldImpl of(final ReferenceSetField template) {
        ReferenceSetFieldImpl instance = new ReferenceSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

}
