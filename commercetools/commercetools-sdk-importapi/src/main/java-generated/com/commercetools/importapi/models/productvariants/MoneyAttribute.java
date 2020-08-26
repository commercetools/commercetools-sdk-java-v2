package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.MoneyAttributeImpl;

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
*  <p>This type represents an attribute which value is a money object.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MoneyAttributeImpl.class)
public interface MoneyAttribute extends Attribute {


    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    public void setValue(final TypedMoney value);

    public static MoneyAttributeImpl of(){
        return new MoneyAttributeImpl();
    }


    public static MoneyAttributeImpl of(final MoneyAttribute template) {
        MoneyAttributeImpl instance = new MoneyAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

}
