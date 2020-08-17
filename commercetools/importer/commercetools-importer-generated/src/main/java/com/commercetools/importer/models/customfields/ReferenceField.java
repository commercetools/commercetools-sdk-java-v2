package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.ReferenceFieldImpl;

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

}
