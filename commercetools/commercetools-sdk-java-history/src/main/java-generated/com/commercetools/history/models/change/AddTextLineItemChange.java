
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.TextLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddTextLineItemChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddTextLineItemChange addTextLineItemChange = AddTextLineItemChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddTextLineItemChangeImpl.class)
public interface AddTextLineItemChange extends Change {

    String ADD_TEXT_LINE_ITEM_CHANGE = "AddTextLineItemChange";

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TextLineItem getNextValue();

    public void setChange(final String change);

    public void setNextValue(final TextLineItem nextValue);

    public static AddTextLineItemChange of() {
        return new AddTextLineItemChangeImpl();
    }

    public static AddTextLineItemChange of(final AddTextLineItemChange template) {
        AddTextLineItemChangeImpl instance = new AddTextLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddTextLineItemChangeBuilder builder() {
        return AddTextLineItemChangeBuilder.of();
    }

    public static AddTextLineItemChangeBuilder builder(final AddTextLineItemChange template) {
        return AddTextLineItemChangeBuilder.of(template);
    }

    default <T> T withAddTextLineItemChange(Function<AddTextLineItemChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddTextLineItemChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddTextLineItemChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddTextLineItemChange>";
            }
        };
    }
}
