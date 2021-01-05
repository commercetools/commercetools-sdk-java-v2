package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.EnumSetAttributeImpl;

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
*  <p>This type represents an attribute which value is an enum.
*  The attribute value refers to the key of the enum value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = EnumSetAttributeImpl.class)
public interface EnumSetAttribute extends Attribute {

    
    @NotNull
    @JsonProperty("value")
    public List<String> getValue();

    @JsonIgnore
    public void setValue(final String ...value);
    public void setValue(final List<String> value);

    public static EnumSetAttribute of(){
        return new EnumSetAttributeImpl();
    }
    

    public static EnumSetAttribute of(final EnumSetAttribute template) {
        EnumSetAttributeImpl instance = new EnumSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static EnumSetAttributeBuilder builder(){
        return EnumSetAttributeBuilder.of();
    }
    
    public static EnumSetAttributeBuilder builder(final EnumSetAttribute template){
        return EnumSetAttributeBuilder.of(template);
    }
    

    default <T> T withEnumSetAttribute(Function<EnumSetAttribute, T> helper) {
        return helper.apply(this);
    }
}
