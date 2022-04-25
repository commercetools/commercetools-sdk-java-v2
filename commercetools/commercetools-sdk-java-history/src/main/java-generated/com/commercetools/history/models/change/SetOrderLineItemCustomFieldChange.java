
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
@JsonDeserialize(as = SetOrderLineItemCustomFieldChangeImpl.class)
public interface SetOrderLineItemCustomFieldChange extends Change {

    String SET_ORDER_LINE_ITEM_CUSTOM_FIELD_CHANGE = "SetOrderLineItemCustomFieldChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLineItemCustomField</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    public void setChange(final String change);

    public void setCustomTypeId(final String customTypeId);

    public void setName(final String name);

    public void setVariant(final String variant);

    public void setLineItem(final LocalizedString lineItem);

    public void setNextValue(final Object nextValue);

    public void setPreviousValue(final Object previousValue);

    public static SetOrderLineItemCustomFieldChange of() {
        return new SetOrderLineItemCustomFieldChangeImpl();
    }

    public static SetOrderLineItemCustomFieldChange of(final SetOrderLineItemCustomFieldChange template) {
        SetOrderLineItemCustomFieldChangeImpl instance = new SetOrderLineItemCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setName(template.getName());
        instance.setVariant(template.getVariant());
        instance.setLineItem(template.getLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetOrderLineItemCustomFieldChangeBuilder builder() {
        return SetOrderLineItemCustomFieldChangeBuilder.of();
    }

    public static SetOrderLineItemCustomFieldChangeBuilder builder(final SetOrderLineItemCustomFieldChange template) {
        return SetOrderLineItemCustomFieldChangeBuilder.of(template);
    }

    default <T> T withSetOrderLineItemCustomFieldChange(Function<SetOrderLineItemCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetOrderLineItemCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetOrderLineItemCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetOrderLineItemCustomFieldChange>";
            }
        };
    }
}
