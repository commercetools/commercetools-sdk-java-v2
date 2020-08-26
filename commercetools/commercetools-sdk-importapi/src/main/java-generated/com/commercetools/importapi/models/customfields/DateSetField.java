package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import java.time.LocalDate;
import com.commercetools.importapi.models.customfields.DateSetFieldImpl;

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
*  <p>A field with a date set value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DateSetFieldImpl.class)
public interface DateSetField extends CustomField {


    @NotNull
    @JsonProperty("value")
    public List<LocalDate> getValue();

    public void setValue(final List<LocalDate> value);

    public static DateSetFieldImpl of(){
        return new DateSetFieldImpl();
    }


    public static DateSetFieldImpl of(final DateSetField template) {
        DateSetFieldImpl instance = new DateSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

}
