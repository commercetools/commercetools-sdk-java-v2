
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.TextLineItemValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeTextLineItemsOrderChangeImpl.class)
public interface ChangeTextLineItemsOrderChange extends Change {

    String CHANGE_TEXT_LINE_ITEMS_ORDER_CHANGE = "ChangeTextLineItemsOrderChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<TextLineItemValue> getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<TextLineItemValue> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final TextLineItemValue... previousValue);

    public void setPreviousValue(final List<TextLineItemValue> previousValue);

    @JsonIgnore
    public void setNextValue(final TextLineItemValue... nextValue);

    public void setNextValue(final List<TextLineItemValue> nextValue);

    public static ChangeTextLineItemsOrderChange of() {
        return new ChangeTextLineItemsOrderChangeImpl();
    }

    public static ChangeTextLineItemsOrderChange of(final ChangeTextLineItemsOrderChange template) {
        ChangeTextLineItemsOrderChangeImpl instance = new ChangeTextLineItemsOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeTextLineItemsOrderChangeBuilder builder() {
        return ChangeTextLineItemsOrderChangeBuilder.of();
    }

    public static ChangeTextLineItemsOrderChangeBuilder builder(final ChangeTextLineItemsOrderChange template) {
        return ChangeTextLineItemsOrderChangeBuilder.of(template);
    }

    default <T> T withChangeTextLineItemsOrderChange(Function<ChangeTextLineItemsOrderChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemsOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTextLineItemsOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTextLineItemsOrderChange>";
            }
        };
    }
}
