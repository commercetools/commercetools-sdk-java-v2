package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.MoneySetAttributeImpl;

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
*  <p>This type represents an attribute which value is a set of money objects.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MoneySetAttributeImpl.class)
public interface MoneySetAttribute extends Attribute {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public List<TypedMoney> getValue();

    public void setValue(final List<TypedMoney> value);

    public static MoneySetAttributeImpl of(){
        return new MoneySetAttributeImpl();
    }
    

    public static MoneySetAttributeImpl of(final MoneySetAttribute template) {
        MoneySetAttributeImpl instance = new MoneySetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

}
