package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.LocalizableTextAttributeImpl;

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
@JsonDeserialize(as = LocalizableTextAttributeImpl.class)
public interface LocalizableTextAttribute extends Attribute {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public LocalizedString getValue();

    public void setValue(final LocalizedString value);

    public static LocalizableTextAttribute of(){
        return new LocalizableTextAttributeImpl();
    }
    

    public static LocalizableTextAttribute of(final LocalizableTextAttribute template) {
        LocalizableTextAttributeImpl instance = new LocalizableTextAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static LocalizableTextAttributeBuilder builder(){
        return LocalizableTextAttributeBuilder.of();
    }
    
    public static LocalizableTextAttributeBuilder builder(final LocalizableTextAttribute template){
        return LocalizableTextAttributeBuilder.of(template);
    }
    

    default <T> T withLocalizableTextAttribute(Function<LocalizableTextAttribute, T> helper) {
        return helper.apply(this);
    }
}
