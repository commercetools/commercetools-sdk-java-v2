
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
@JsonDeserialize(as = SetOrderLineItemCustomTypeChangeImpl.class)
public interface SetOrderLineItemCustomTypeChange extends Change {

    String SET_ORDER_LINE_ITEM_CUSTOM_TYPE_CHANGE = "SetOrderLineItemCustomTypeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLineItemCustomType</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    public void setChange(final String change);

    public void setLineItem(final LocalizedString lineItem);

    public void setVariant(final String variant);

    public void setNextValue(final CustomFields nextValue);

    public void setPreviousValue(final CustomFields previousValue);

    public static SetOrderLineItemCustomTypeChange of() {
        return new SetOrderLineItemCustomTypeChangeImpl();
    }

    public static SetOrderLineItemCustomTypeChange of(final SetOrderLineItemCustomTypeChange template) {
        SetOrderLineItemCustomTypeChangeImpl instance = new SetOrderLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetOrderLineItemCustomTypeChangeBuilder builder() {
        return SetOrderLineItemCustomTypeChangeBuilder.of();
    }

    public static SetOrderLineItemCustomTypeChangeBuilder builder(final SetOrderLineItemCustomTypeChange template) {
        return SetOrderLineItemCustomTypeChangeBuilder.of(template);
    }

    default <T> T withSetOrderLineItemCustomTypeChange(Function<SetOrderLineItemCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetOrderLineItemCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetOrderLineItemCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetOrderLineItemCustomTypeChange>";
            }
        };
    }
}
