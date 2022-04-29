
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddOrderLineItemChangeImpl.class)
public interface AddOrderLineItemChange extends Change {

    String ADD_ORDER_LINE_ITEM_CHANGE = "AddOrderLineItemChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LineItem getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LineItem getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final LineItem previousValue);

    public void setNextValue(final LineItem nextValue);

    public static AddOrderLineItemChange of() {
        return new AddOrderLineItemChangeImpl();
    }

    public static AddOrderLineItemChange of(final AddOrderLineItemChange template) {
        AddOrderLineItemChangeImpl instance = new AddOrderLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddOrderLineItemChangeBuilder builder() {
        return AddOrderLineItemChangeBuilder.of();
    }

    public static AddOrderLineItemChangeBuilder builder(final AddOrderLineItemChange template) {
        return AddOrderLineItemChangeBuilder.of(template);
    }

    default <T> T withAddOrderLineItemChange(Function<AddOrderLineItemChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddOrderLineItemChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddOrderLineItemChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddOrderLineItemChange>";
            }
        };
    }
}
