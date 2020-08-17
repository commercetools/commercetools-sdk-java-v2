package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import com.commercetools.importer.models.customfields.FieldContainerImpl;

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
*  <p>Maps the custom field names to the actual values.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = FieldContainerImpl.class)
public interface FieldContainer  {

    /**
    *  <p>Mapping from the custom field name to the actual value.</p>
    */
    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, CustomField> values();

    @JsonAnySetter
    public void setValue(String key, CustomField value);

    public static FieldContainerImpl of(){
        return new FieldContainerImpl();
    }
    

    public static FieldContainerImpl of(final FieldContainer template) {
        FieldContainerImpl instance = new FieldContainerImpl();
        return instance;
    }

}
