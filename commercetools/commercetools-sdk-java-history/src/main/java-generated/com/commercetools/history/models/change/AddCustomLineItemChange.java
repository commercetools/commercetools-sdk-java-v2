
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.CustomLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddCustomLineItemChangeImpl.class)
public interface AddCustomLineItemChange extends Change {

    String ADD_CUSTOM_LINE_ITEM_CHANGE = "AddCustomLineItemChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for adding and removing custom line items</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomLineItem getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomLineItem getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final CustomLineItem nextValue);

    public void setPreviousValue(final CustomLineItem previousValue);

    public static AddCustomLineItemChange of() {
        return new AddCustomLineItemChangeImpl();
    }

    public static AddCustomLineItemChange of(final AddCustomLineItemChange template) {
        AddCustomLineItemChangeImpl instance = new AddCustomLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static AddCustomLineItemChangeBuilder builder() {
        return AddCustomLineItemChangeBuilder.of();
    }

    public static AddCustomLineItemChangeBuilder builder(final AddCustomLineItemChange template) {
        return AddCustomLineItemChangeBuilder.of(template);
    }

    default <T> T withAddCustomLineItemChange(Function<AddCustomLineItemChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddCustomLineItemChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddCustomLineItemChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddCustomLineItemChange>";
            }
        };
    }
}
