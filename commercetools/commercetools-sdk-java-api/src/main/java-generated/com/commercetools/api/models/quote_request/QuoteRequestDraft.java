
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
public interface QuoteRequestDraft extends io.vrap.rmf.base.client.Draft<QuoteRequestDraft> {

    /**
     *  <p>Cart for which a Quote is requested. Anonymous Carts, Carts with Discount Codes, or Carts with a <code>Multiple</code> ShippingMode are not supported.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("cart")
    public CartResourceIdentifier getCart();

    /**
     *  <p>Current version of the referenced Cart.</p>
     */
    @NotNull
    @JsonProperty("cartVersion")
    public Long getCartVersion();

    /**
     *  <p>User-defined unique identifier for the QuoteRequest.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     */
    @NotNull
    @JsonProperty("comment")
    public String getComment();

    /**
     *  <p>Custom Fields to be added to the Quote Request.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>State of this Quote Request. This reference can point to a State in a custom workflow.</p>
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    public void setCart(final CartResourceIdentifier cart);

    public void setCartVersion(final Long cartVersion);

    public void setKey(final String key);

    public void setComment(final String comment);

    public void setCustom(final CustomFieldsDraft custom);

    public void setState(final StateReference state);

    public static QuoteRequestDraft of() {
        return new QuoteRequestDraftImpl();
    }

    public static QuoteRequestDraft of(final QuoteRequestDraft template) {
        QuoteRequestDraftImpl instance = new QuoteRequestDraftImpl();
        instance.setCart(template.getCart());
        instance.setCartVersion(template.getCartVersion());
        instance.setKey(template.getKey());
        instance.setComment(template.getComment());
        instance.setCustom(template.getCustom());
        instance.setState(template.getState());
        return instance;
    }

    public static QuoteRequestDraftBuilder builder() {
        return QuoteRequestDraftBuilder.of();
    }

    public static QuoteRequestDraftBuilder builder(final QuoteRequestDraft template) {
        return QuoteRequestDraftBuilder.of(template);
    }

    default <T> T withQuoteRequestDraft(Function<QuoteRequestDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestDraft>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestDraft>";
            }
        };
    }
}
