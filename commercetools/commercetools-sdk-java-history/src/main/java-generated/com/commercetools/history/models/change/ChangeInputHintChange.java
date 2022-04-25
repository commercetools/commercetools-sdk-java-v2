
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TextInputHint;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeInputHintChangeImpl.class)
public interface ChangeInputHintChange extends Change {

    String CHANGE_INPUT_HINT_CHANGE = "ChangeInputHintChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeInputHint</code> on product types and types</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>The name of the field definition updated.</p>
    */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
    *  <p>The name of the attribute updated.</p>
    */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @JsonProperty("nextValue")
    public TextInputHint getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public TextInputHint getPreviousValue();

    public void setChange(final String change);

    public void setFieldName(final String fieldName);

    public void setAttributeName(final String attributeName);

    public void setNextValue(final TextInputHint nextValue);

    public void setPreviousValue(final TextInputHint previousValue);

    public static ChangeInputHintChange of() {
        return new ChangeInputHintChangeImpl();
    }

    public static ChangeInputHintChange of(final ChangeInputHintChange template) {
        ChangeInputHintChangeImpl instance = new ChangeInputHintChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeInputHintChangeBuilder builder() {
        return ChangeInputHintChangeBuilder.of();
    }

    public static ChangeInputHintChangeBuilder builder(final ChangeInputHintChange template) {
        return ChangeInputHintChangeBuilder.of(template);
    }

    default <T> T withChangeInputHintChange(Function<ChangeInputHintChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeInputHintChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeInputHintChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeInputHintChange>";
            }
        };
    }
}
