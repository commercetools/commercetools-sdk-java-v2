package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import java.time.LocalDate;
import com.commercetools.importer.models.customfields.DateFieldImpl;

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
*  <p>A field with a date value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DateFieldImpl.class)
public interface DateField extends CustomField {

    
    @NotNull
    @JsonProperty("value")
    public LocalDate getValue();

    public void setValue(final LocalDate value);

    public static DateFieldImpl of(){
        return new DateFieldImpl();
    }
    

    public static DateFieldImpl of(final DateField template) {
        DateFieldImpl instance = new DateFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

}
