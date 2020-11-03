package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.LocalizedStringFieldImpl;

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
*  <p>A field with a localized string value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = LocalizedStringFieldImpl.class)
public interface LocalizedStringField extends CustomField {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public LocalizedString getValue();

    public void setValue(final LocalizedString value);

    public static LocalizedStringFieldImpl of(){
        return new LocalizedStringFieldImpl();
    }
    

    public static LocalizedStringFieldImpl of(final LocalizedStringField template) {
        LocalizedStringFieldImpl instance = new LocalizedStringFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withLocalizedStringField(Function<LocalizedStringField, T> helper) {
        return helper.apply(this);
    }
}
