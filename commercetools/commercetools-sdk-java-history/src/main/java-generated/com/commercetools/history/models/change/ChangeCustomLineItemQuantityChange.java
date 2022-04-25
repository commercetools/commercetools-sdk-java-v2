
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
@JsonDeserialize(as = ChangeCustomLineItemQuantityChangeImpl.class)
public interface ChangeCustomLineItemQuantityChange extends Change {

    String CHANGE_CUSTOM_LINE_ITEM_QUANTITY_CHANGE = "ChangeCustomLineItemQuantityChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeCustomLineItemQuantity</code></p>
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
    @JsonProperty("nextValue")
    public Integer getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    public void setChange(final String change);

    public void setCustomLineItem(final LocalizedString customLineItem);

    public void setCustomLineItemId(final String customLineItemId);

    public void setNextValue(final Integer nextValue);

    public void setPreviousValue(final Integer previousValue);

    public static ChangeCustomLineItemQuantityChange of() {
        return new ChangeCustomLineItemQuantityChangeImpl();
    }

    public static ChangeCustomLineItemQuantityChange of(final ChangeCustomLineItemQuantityChange template) {
        ChangeCustomLineItemQuantityChangeImpl instance = new ChangeCustomLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeCustomLineItemQuantityChangeBuilder builder() {
        return ChangeCustomLineItemQuantityChangeBuilder.of();
    }

    public static ChangeCustomLineItemQuantityChangeBuilder builder(final ChangeCustomLineItemQuantityChange template) {
        return ChangeCustomLineItemQuantityChangeBuilder.of(template);
    }

    default <T> T withChangeCustomLineItemQuantityChange(Function<ChangeCustomLineItemQuantityChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeCustomLineItemQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeCustomLineItemQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeCustomLineItemQuantityChange>";
            }
        };
    }
}
