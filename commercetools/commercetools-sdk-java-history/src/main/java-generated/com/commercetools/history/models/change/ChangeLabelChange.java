
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeLabelChangeImpl.class)
public interface ChangeLabelChange extends Change {

    String CHANGE_LABEL_CHANGE = "ChangeLabelChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeLabel</code> on product types and types</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>The name of the field definition to update (types).</p>
    */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
    *  <p>The name of the attribute definition to update (product-type).</p>
    */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    public void setChange(final String change);

    public void setFieldName(final String fieldName);

    public void setAttributeName(final String attributeName);

    public void setNextValue(final LocalizedString nextValue);

    public void setPreviousValue(final LocalizedString previousValue);

    public static ChangeLabelChange of() {
        return new ChangeLabelChangeImpl();
    }

    public static ChangeLabelChange of(final ChangeLabelChange template) {
        ChangeLabelChangeImpl instance = new ChangeLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeLabelChangeBuilder builder() {
        return ChangeLabelChangeBuilder.of();
    }

    public static ChangeLabelChangeBuilder builder(final ChangeLabelChange template) {
        return ChangeLabelChangeBuilder.of(template);
    }

    default <T> T withChangeLabelChange(Function<ChangeLabelChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLabelChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLabelChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLabelChange>";
            }
        };
    }
}
