
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemDeactivatedAtChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDeactivatedAtChange setLineItemDeactivatedAtChange = SetLineItemDeactivatedAtChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemDeactivatedAtChangeImpl.class)
public interface SetLineItemDeactivatedAtChange extends Change {

    String SET_LINE_ITEM_DEACTIVATED_AT_CHANGE = "SetLineItemDeactivatedAtChange";

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setLineItemDeactivatedAt</code></p>
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public ShoppingListLineItemValue getLineItem();

    /**
     *
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    public void setChange(final String change);

    public void setLineItem(final ShoppingListLineItemValue lineItem);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static SetLineItemDeactivatedAtChange of() {
        return new SetLineItemDeactivatedAtChangeImpl();
    }

    public static SetLineItemDeactivatedAtChange of(final SetLineItemDeactivatedAtChange template) {
        SetLineItemDeactivatedAtChangeImpl instance = new SetLineItemDeactivatedAtChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetLineItemDeactivatedAtChangeBuilder builder() {
        return SetLineItemDeactivatedAtChangeBuilder.of();
    }

    public static SetLineItemDeactivatedAtChangeBuilder builder(final SetLineItemDeactivatedAtChange template) {
        return SetLineItemDeactivatedAtChangeBuilder.of(template);
    }

    default <T> T withSetLineItemDeactivatedAtChange(Function<SetLineItemDeactivatedAtChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemDeactivatedAtChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemDeactivatedAtChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemDeactivatedAtChange>";
            }
        };
    }
}
