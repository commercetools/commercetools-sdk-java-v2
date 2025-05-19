
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents a CartDiscount that can only be associated with a single Cart or Order.</p>
 *  <p>For an introduction to Direct Discounts and to understand how they work in Composable Commerce, see the Direct Discounts overview.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DirectDiscountDraft directDiscountDraft = DirectDiscountDraft.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DirectDiscountDraftImpl.class)
public interface DirectDiscountDraft extends io.vrap.rmf.base.client.Draft<DirectDiscountDraft> {

    /**
     *  <p>Defines the effect the Discount will have.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CartDiscountValueDraft getValue();

    /**
     *  <p>Defines what segment of the Cart will be discounted.</p>
     *  <p>If <code>value</code> is set to <code>giftLineItem</code>, this must not be set.</p>
     * @return target
     */
    @Valid
    @JsonProperty("target")
    public CartDiscountTarget getTarget();

    /**
     *  <p>Defines the effect the Discount will have.</p>
     * @param value value to be set
     */

    public void setValue(final CartDiscountValueDraft value);

    /**
     *  <p>Defines what segment of the Cart will be discounted.</p>
     *  <p>If <code>value</code> is set to <code>giftLineItem</code>, this must not be set.</p>
     * @param target value to be set
     */

    public void setTarget(final CartDiscountTarget target);

    /**
     * factory method
     * @return instance of DirectDiscountDraft
     */
    public static DirectDiscountDraft of() {
        return new DirectDiscountDraftImpl();
    }

    /**
     * factory method to create a shallow copy DirectDiscountDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static DirectDiscountDraft of(final DirectDiscountDraft template) {
        DirectDiscountDraftImpl instance = new DirectDiscountDraftImpl();
        instance.setValue(template.getValue());
        instance.setTarget(template.getTarget());
        return instance;
    }

    public DirectDiscountDraft copyDeep();

    /**
     * factory method to create a deep copy of DirectDiscountDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DirectDiscountDraft deepCopy(@Nullable final DirectDiscountDraft template) {
        if (template == null) {
            return null;
        }
        DirectDiscountDraftImpl instance = new DirectDiscountDraftImpl();
        instance.setValue(
            com.commercetools.api.models.cart_discount.CartDiscountValueDraft.deepCopy(template.getValue()));
        instance.setTarget(
            com.commercetools.api.models.cart_discount.CartDiscountTarget.deepCopy(template.getTarget()));
        return instance;
    }

    /**
     * builder factory method for DirectDiscountDraft
     * @return builder
     */
    public static DirectDiscountDraftBuilder builder() {
        return DirectDiscountDraftBuilder.of();
    }

    /**
     * create builder for DirectDiscountDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DirectDiscountDraftBuilder builder(final DirectDiscountDraft template) {
        return DirectDiscountDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDirectDiscountDraft(Function<DirectDiscountDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DirectDiscountDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DirectDiscountDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DirectDiscountDraft>";
            }
        };
    }
}
