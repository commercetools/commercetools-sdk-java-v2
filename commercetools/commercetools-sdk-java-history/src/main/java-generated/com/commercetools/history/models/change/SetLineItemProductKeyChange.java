
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

/**
 * SetLineItemProductKeyChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemProductKeyChange setLineItemProductKeyChange = SetLineItemProductKeyChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .variant("{variant}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemProductKeyChangeImpl.class)
public interface SetLineItemProductKeyChange extends Change {

    String SET_LINE_ITEM_PRODUCT_KEY_CHANGE = "SetLineItemProductKeyChange";

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setLineItemProductKey</code></p>
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
    public LocalizedString getLineItem();

    /**
     *
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

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

    public void setLineItem(final LocalizedString lineItem);

    public void setLineItemId(final String lineItemId);

    public void setVariant(final String variant);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static SetLineItemProductKeyChange of() {
        return new SetLineItemProductKeyChangeImpl();
    }

    public static SetLineItemProductKeyChange of(final SetLineItemProductKeyChange template) {
        SetLineItemProductKeyChangeImpl instance = new SetLineItemProductKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setLineItemId(template.getLineItemId());
        instance.setVariant(template.getVariant());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetLineItemProductKeyChangeBuilder builder() {
        return SetLineItemProductKeyChangeBuilder.of();
    }

    public static SetLineItemProductKeyChangeBuilder builder(final SetLineItemProductKeyChange template) {
        return SetLineItemProductKeyChangeBuilder.of(template);
    }

    default <T> T withSetLineItemProductKeyChange(Function<SetLineItemProductKeyChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemProductKeyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemProductKeyChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemProductKeyChange>";
            }
        };
    }
}
