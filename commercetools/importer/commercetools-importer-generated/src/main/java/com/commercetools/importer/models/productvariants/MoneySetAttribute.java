package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.MoneySetAttributeImpl;

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
    public List<Money> getValue();

    public void setValue(final List<Money> value);

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
