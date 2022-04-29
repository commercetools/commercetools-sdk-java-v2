
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.CustomFields;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemCustomTypeChangeImpl.class)
public interface SetCustomLineItemCustomTypeChange extends Change {

    String SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE_CHANGE = "SetCustomLineItemCustomTypeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setCustomLineItemCustomType</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    public void setChange(final String change);

    public void setCustomLineItem(final LocalizedString customLineItem);

    public void setCustomLineItemId(final String customLineItemId);

    public void setNextValue(final CustomFields nextValue);

    public void setPreviousValue(final CustomFields previousValue);

    public static SetCustomLineItemCustomTypeChange of() {
        return new SetCustomLineItemCustomTypeChangeImpl();
    }

    public static SetCustomLineItemCustomTypeChange of(final SetCustomLineItemCustomTypeChange template) {
        SetCustomLineItemCustomTypeChangeImpl instance = new SetCustomLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetCustomLineItemCustomTypeChangeBuilder builder() {
        return SetCustomLineItemCustomTypeChangeBuilder.of();
    }

    public static SetCustomLineItemCustomTypeChangeBuilder builder(final SetCustomLineItemCustomTypeChange template) {
        return SetCustomLineItemCustomTypeChangeBuilder.of(template);
    }

    default <T> T withSetCustomLineItemCustomTypeChange(Function<SetCustomLineItemCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemCustomTypeChange>";
            }
        };
    }
}
