package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.TextAttributeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>This type represents an attribute which value is a string.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TextAttributeImpl.class)
public interface TextAttribute extends Attribute {

    
    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setValue(final String value);

    public static TextAttributeImpl of(){
        return new TextAttributeImpl();
    }
    

    public static TextAttributeImpl of(final TextAttribute template) {
        TextAttributeImpl instance = new TextAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T extends Accessor<TextAttribute>> T withTextAttribute(Function<TextAttribute, T> helper) {
        return helper.apply(this);
    }
}
