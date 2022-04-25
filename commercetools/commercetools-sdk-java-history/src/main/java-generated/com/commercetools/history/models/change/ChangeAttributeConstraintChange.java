
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.AttributeConstraintEnum;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeAttributeConstraintChangeImpl.class)
public interface ChangeAttributeConstraintChange extends Change {

    String CHANGE_ATTRIBUTE_CONSTRAINT_CHANGE = "ChangeAttributeConstraintChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>name of the updated attribute</p>
    */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @JsonProperty("previousValue")
    public AttributeConstraintEnum getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public AttributeConstraintEnum getNextValue();

    public void setChange(final String change);

    public void setAttributeName(final String attributeName);

    public void setPreviousValue(final AttributeConstraintEnum previousValue);

    public void setNextValue(final AttributeConstraintEnum nextValue);

    public static ChangeAttributeConstraintChange of() {
        return new ChangeAttributeConstraintChangeImpl();
    }

    public static ChangeAttributeConstraintChange of(final ChangeAttributeConstraintChange template) {
        ChangeAttributeConstraintChangeImpl instance = new ChangeAttributeConstraintChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeAttributeConstraintChangeBuilder builder() {
        return ChangeAttributeConstraintChangeBuilder.of();
    }

    public static ChangeAttributeConstraintChangeBuilder builder(final ChangeAttributeConstraintChange template) {
        return ChangeAttributeConstraintChangeBuilder.of(template);
    }

    default <T> T withChangeAttributeConstraintChange(Function<ChangeAttributeConstraintChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAttributeConstraintChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAttributeConstraintChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAttributeConstraintChange>";
            }
        };
    }
}
