
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemTaxCategoryChangeImpl.class)
public interface SetCustomLineItemTaxCategoryChange extends Change {

    String SET_CUSTOM_LINE_ITEM_TAX_CATEGORY_CHANGE = "SetCustomLineItemTaxCategoryChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setCustomLineItemTaxCategory</code></p>
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
    public Reference getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    public void setChange(final String change);

    public void setCustomLineItem(final LocalizedString customLineItem);

    public void setCustomLineItemId(final String customLineItemId);

    public void setNextValue(final Reference nextValue);

    public void setPreviousValue(final Reference previousValue);

    public static SetCustomLineItemTaxCategoryChange of() {
        return new SetCustomLineItemTaxCategoryChangeImpl();
    }

    public static SetCustomLineItemTaxCategoryChange of(final SetCustomLineItemTaxCategoryChange template) {
        SetCustomLineItemTaxCategoryChangeImpl instance = new SetCustomLineItemTaxCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetCustomLineItemTaxCategoryChangeBuilder builder() {
        return SetCustomLineItemTaxCategoryChangeBuilder.of();
    }

    public static SetCustomLineItemTaxCategoryChangeBuilder builder(final SetCustomLineItemTaxCategoryChange template) {
        return SetCustomLineItemTaxCategoryChangeBuilder.of(template);
    }

    default <T> T withSetCustomLineItemTaxCategoryChange(Function<SetCustomLineItemTaxCategoryChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTaxCategoryChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemTaxCategoryChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemTaxCategoryChange>";
            }
        };
    }
}
