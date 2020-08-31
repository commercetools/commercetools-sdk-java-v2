package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.MoneyFieldImpl;

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
*  <p>A field with a money value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MoneyFieldImpl.class)
public interface MoneyField extends CustomField {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    public void setValue(final TypedMoney value);

    public static MoneyFieldImpl of(){
        return new MoneyFieldImpl();
    }
    

    public static MoneyFieldImpl of(final MoneyField template) {
        MoneyFieldImpl instance = new MoneyFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

}
