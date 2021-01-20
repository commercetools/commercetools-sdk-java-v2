
package com.commercetools.api.models.type;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.TypeChangeInputHintActionImpl;
import com.commercetools.api.models.type.TypeTextInputHint;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeChangeInputHintActionImpl.class)
public interface TypeChangeInputHintAction extends TypeUpdateAction {

    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    @NotNull
    @JsonProperty("inputHint")
    public TypeTextInputHint getInputHint();

    public void setFieldName(final String fieldName);

    public void setInputHint(final TypeTextInputHint inputHint);

    public static TypeChangeInputHintAction of() {
        return new TypeChangeInputHintActionImpl();
    }

    public static TypeChangeInputHintAction of(final TypeChangeInputHintAction template) {
        TypeChangeInputHintActionImpl instance = new TypeChangeInputHintActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setInputHint(template.getInputHint());
        return instance;
    }

    public static TypeChangeInputHintActionBuilder builder() {
        return TypeChangeInputHintActionBuilder.of();
    }

    public static TypeChangeInputHintActionBuilder builder(final TypeChangeInputHintAction template) {
        return TypeChangeInputHintActionBuilder.of(template);
    }

    default <T> T withTypeChangeInputHintAction(Function<TypeChangeInputHintAction, T> helper) {
        return helper.apply(this);
    }
}
