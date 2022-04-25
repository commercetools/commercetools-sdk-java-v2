
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
@JsonDeserialize(as = RemoveOrderLineItemChangeImpl.class)
public interface RemoveOrderLineItemChange extends Change {

    String REMOVE_ORDER_LINE_ITEM_CHANGE = "RemoveOrderLineItemChange";

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

    public static RemoveOrderLineItemChange of() {
        return new RemoveOrderLineItemChangeImpl();
    }

    public static RemoveOrderLineItemChange of(final RemoveOrderLineItemChange template) {
        RemoveOrderLineItemChangeImpl instance = new RemoveOrderLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static RemoveOrderLineItemChangeBuilder builder() {
        return RemoveOrderLineItemChangeBuilder.of();
    }

    public static RemoveOrderLineItemChangeBuilder builder(final RemoveOrderLineItemChange template) {
        return RemoveOrderLineItemChangeBuilder.of(template);
    }

    default <T> T withRemoveOrderLineItemChange(Function<RemoveOrderLineItemChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RemoveOrderLineItemChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveOrderLineItemChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveOrderLineItemChange>";
            }
        };
    }
}
