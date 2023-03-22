
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

    public void setChange(final String change);

    public void setLineItem(final LocalizedString lineItem);

    public void setVariant(final String variant);

    public void setNextValue(final LocalizedString nextValue);

    public void setPreviousValue(final LocalizedString previousValue);

    public static SetLineItemProductSlugChange of() {
        return new SetLineItemProductSlugChangeImpl();
    }

    public static SetLineItemProductSlugChange of(final SetLineItemProductSlugChange template) {
        SetLineItemProductSlugChangeImpl instance = new SetLineItemProductSlugChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setVariant(template.getVariant());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetLineItemProductSlugChangeBuilder builder() {
        return SetLineItemProductSlugChangeBuilder.of();
    }

    public static SetLineItemProductSlugChangeBuilder builder(final SetLineItemProductSlugChange template) {
        return SetLineItemProductSlugChangeBuilder.of(template);
    }

    default <T> T withSetLineItemProductSlugChange(Function<SetLineItemProductSlugChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetLineItemProductSlugChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLineItemProductSlugChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLineItemProductSlugChange>";
            }
        };
    }
}
