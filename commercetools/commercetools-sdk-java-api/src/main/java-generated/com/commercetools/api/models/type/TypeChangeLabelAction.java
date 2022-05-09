
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

    /**
    *  <p>Name of the <a href="ctp:api:type:FieldDefinition">Field Definition</a> to update.</p>
    */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
    *  <p>JSON object where the keys are of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>, and the values are the corresponding strings used for that language.</p>
    */
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

    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeLabelAction>";
            }
        };
    }
}
