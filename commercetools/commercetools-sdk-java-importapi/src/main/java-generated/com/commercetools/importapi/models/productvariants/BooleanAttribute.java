package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.BooleanAttributeImpl;

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
*  <p>This type represents an attribute which value is either &quot;true&quot; or &quot;false&quot;.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = BooleanAttributeImpl.class)
public interface BooleanAttribute extends Attribute {

    
    @NotNull
    @JsonProperty("value")
    public Boolean getValue();

    public void setValue(final Boolean value);

    public static BooleanAttributeImpl of(){
        return new BooleanAttributeImpl();
    }
    

    public static BooleanAttributeImpl of(final BooleanAttribute template) {
        BooleanAttributeImpl instance = new BooleanAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withBooleanAttribute(Function<BooleanAttribute, T> helper) {
        return helper.apply(this);
    }
}
