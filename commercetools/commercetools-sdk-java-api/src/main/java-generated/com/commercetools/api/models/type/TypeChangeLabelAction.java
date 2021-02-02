
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeChangeLabelActionImpl.class)
public interface TypeChangeLabelAction extends TypeUpdateAction {

    String CHANGE_LABEL = "changeLabel";

    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setFieldName(final String fieldName);

    public void setLabel(final LocalizedString label);

    public static TypeChangeLabelAction of() {
        return new TypeChangeLabelActionImpl();
    }

    public static TypeChangeLabelAction of(final TypeChangeLabelAction template) {
        TypeChangeLabelActionImpl instance = new TypeChangeLabelActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static TypeChangeLabelActionBuilder builder() {
        return TypeChangeLabelActionBuilder.of();
    }

    public static TypeChangeLabelActionBuilder builder(final TypeChangeLabelAction template) {
        return TypeChangeLabelActionBuilder.of(template);
    }

    default <T> T withTypeChangeLabelAction(Function<TypeChangeLabelAction, T> helper) {
        return helper.apply(this);
    }
}
