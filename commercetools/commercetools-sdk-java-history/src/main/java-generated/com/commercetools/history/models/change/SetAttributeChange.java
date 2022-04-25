
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.AttributeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetAttributeChangeImpl.class)
public interface SetAttributeChange extends Change {

    String SET_ATTRIBUTE_CHANGE = "SetAttributeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setAttribute</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public AttributeValue getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public AttributeValue getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    public void setPreviousValue(final AttributeValue previousValue);

    public void setNextValue(final AttributeValue nextValue);

    public static SetAttributeChange of() {
        return new SetAttributeChangeImpl();
    }

    public static SetAttributeChange of(final SetAttributeChange template) {
        SetAttributeChangeImpl instance = new SetAttributeChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetAttributeChangeBuilder builder() {
        return SetAttributeChangeBuilder.of();
    }

    public static SetAttributeChangeBuilder builder(final SetAttributeChange template) {
        return SetAttributeChangeBuilder.of(template);
    }

    default <T> T withSetAttributeChange(Function<SetAttributeChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetAttributeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAttributeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAttributeChange>";
            }
        };
    }
}
