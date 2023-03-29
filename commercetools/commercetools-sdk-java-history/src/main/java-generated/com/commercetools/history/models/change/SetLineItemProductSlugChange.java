
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemProductSlugChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemProductSlugChange setLineItemProductSlugChange = SetLineItemProductSlugChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLineItemProductSlugChangeImpl.class)
public interface SetLineItemProductSlugChange extends Change {

    /**
     * discriminator value for SetLineItemProductSlugChange
     */
    String SET_LINE_ITEM_PRODUCT_SLUG_CHANGE = "SetLineItemProductSlugChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setLineItemProductSlug</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
     *
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    /**
     *  <p>Update action for <code>setLineItemProductSlug</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set lineItem
     * @param lineItem value to be set
     */

    public void setLineItem(final LocalizedString lineItem);

    /**
     * set variant
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     * factory method
     * @return instance of SetLineItemProductSlugChange
     */
    public static SetLineItemProductSlugChange of() {
        return new SetLineItemProductSlugChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLineItemProductSlugChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLineItemProductSlugChange of(final SetLineItemProductSlugChange template) {
        SetLineItemProductSlugChangeImpl instance = new SetLineItemProductSlugChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetLineItemProductSlugChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLineItemProductSlugChange deepCopy(@Nullable final SetLineItemProductSlugChange template) {
        if (template == null) {
            return null;
        }
        SetLineItemProductSlugChangeImpl instance = new SetLineItemProductSlugChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(Optional.ofNullable(template.getLineItem())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setVariant(template.getVariant());
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetLineItemProductSlugChange
     * @return builder
     */
    public static SetLineItemProductSlugChangeBuilder builder() {
        return SetLineItemProductSlugChangeBuilder.of();
    }

    /**
     * create builder for SetLineItemProductSlugChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemProductSlugChangeBuilder builder(final SetLineItemProductSlugChange template) {
        return SetLineItemProductSlugChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLineItemProductSlugChange(Function<SetLineItemProductSlugChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemProductSlugChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemProductSlugChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemProductSlugChange>";
            }
        };
    }
}
