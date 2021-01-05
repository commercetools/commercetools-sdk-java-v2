package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.LocalizableTextSetAttributeImpl;

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
*  <p>This type represents an attribute which value is a localized text.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = LocalizableTextSetAttributeImpl.class)
public interface LocalizableTextSetAttribute extends Attribute {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public List<LocalizedString> getValue();

    @JsonIgnore
    public void setValue(final LocalizedString ...value);
    public void setValue(final List<LocalizedString> value);

    public static LocalizableTextSetAttribute of(){
        return new LocalizableTextSetAttributeImpl();
    }
    

    public static LocalizableTextSetAttribute of(final LocalizableTextSetAttribute template) {
        LocalizableTextSetAttributeImpl instance = new LocalizableTextSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static LocalizableTextSetAttributeBuilder builder(){
        return LocalizableTextSetAttributeBuilder.of();
    }
    
    public static LocalizableTextSetAttributeBuilder builder(final LocalizableTextSetAttribute template){
        return LocalizableTextSetAttributeBuilder.of(template);
    }
    

    default <T> T withLocalizableTextSetAttribute(Function<LocalizableTextSetAttribute, T> helper) {
        return helper.apply(this);
    }
}
