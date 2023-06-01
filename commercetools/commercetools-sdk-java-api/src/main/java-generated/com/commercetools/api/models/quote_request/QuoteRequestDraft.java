
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestDraft quoteRequestDraft = QuoteRequestDraft.builder()
 *             .cart(cartBuilder -> cartBuilder)
 *             .cartVersion(0.3)
 *             .comment("{comment}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestDraftImpl.class)
public interface QuoteRequestDraft
        extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<QuoteRequestDraft> {

    /**
     *  <p>Cart for which a Quote is requested. Anonymous Carts, Carts with Discount Codes, or Carts with a <code>Multiple</code> ShippingMode are not supported.</p>
     * @return cart
     */
    @NotNull
    @Valid
    @JsonProperty("cart")
    public CartResourceIdentifier getCart();

    /**
     *  <p>Current version of the referenced Cart.</p>
     * @return cartVersion
     */
    @NotNull
    @JsonProperty("cartVersion")
    public Long getCartVersion();

    /**
     *  <p>User-defined unique identifier for the QuoteRequest.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     * @return comment
     */
    @NotNull
    @JsonProperty("comment")
    public String getComment();

    /**
     *  <p>Custom Fields to be added to the Quote Request.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>State of the Quote Request. This reference can point to a State in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>Cart for which a Quote is requested. Anonymous Carts, Carts with Discount Codes, or Carts with a <code>Multiple</code> ShippingMode are not supported.</p>
     * @param cart value to be set
     */

    public void setCart(final CartResourceIdentifier cart);

    /**
     *  <p>Current version of the referenced Cart.</p>
     * @param cartVersion value to be set
     */

    public void setCartVersion(final Long cartVersion);

    /**
     *  <p>User-defined unique identifier for the QuoteRequest.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     * @param comment value to be set
     */

    public void setComment(final String comment);

    /**
     *  <p>Custom Fields to be added to the Quote Request.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>State of the Quote Request. This reference can point to a State in a custom workflow.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     * factory method
     * @return instance of QuoteRequestDraft
     */
    public static QuoteRequestDraft of() {
        return new QuoteRequestDraftImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequestDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequestDraft of(final QuoteRequestDraft template) {
        QuoteRequestDraftImpl instance = new QuoteRequestDraftImpl();
        instance.setCart(template.getCart());
        instance.setCartVersion(template.getCartVersion());
        instance.setKey(template.getKey());
        instance.setComment(template.getComment());
        instance.setCustom(template.getCustom());
        instance.setState(template.getState());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        return instance;
    }

    /**
     * factory method to create a deep copy of QuoteRequestDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestDraft deepCopy(@Nullable final QuoteRequestDraft template) {
        if (template == null) {
            return null;
        }
        QuoteRequestDraftImpl instance = new QuoteRequestDraftImpl();
        instance.setCart(com.commercetools.api.models.cart.CartResourceIdentifier.deepCopy(template.getCart()));
        instance.setCartVersion(template.getCartVersion());
        instance.setKey(template.getKey());
        instance.setComment(template.getComment());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        return instance;
    }

    /**
     * builder factory method for QuoteRequestDraft
     * @return builder
     */
    public static QuoteRequestDraftBuilder builder() {
        return QuoteRequestDraftBuilder.of();
    }

    /**
     * create builder for QuoteRequestDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestDraftBuilder builder(final QuoteRequestDraft template) {
        return QuoteRequestDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestDraft(Function<QuoteRequestDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestDraft>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestDraft>";
            }
        };
    }
}
