
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyQuoteRequestDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyQuoteRequestDraft myQuoteRequestDraft = MyQuoteRequestDraft.builder()
 *             .cart(cartBuilder -> cartBuilder)
 *             .version(0.3)
 *             .comment("{comment}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyQuoteRequestDraftImpl.class)
public interface MyQuoteRequestDraft {

    /**
     *  <p>ResourceIdentifier to the Cart from which this quote request is created.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("cart")
    public CartResourceIdentifier getCart();

    /**
     *  <p>Current version of the Cart.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Text message included in the request.</p>
     */
    @NotNull
    @JsonProperty("comment")
    public String getComment();

    public void setCart(final CartResourceIdentifier cart);

    public void setVersion(final Long version);

    public void setComment(final String comment);

    public static MyQuoteRequestDraft of() {
        return new MyQuoteRequestDraftImpl();
    }

    public static MyQuoteRequestDraft of(final MyQuoteRequestDraft template) {
        MyQuoteRequestDraftImpl instance = new MyQuoteRequestDraftImpl();
        instance.setCart(template.getCart());
        instance.setVersion(template.getVersion());
        instance.setComment(template.getComment());
        return instance;
    }

    public static MyQuoteRequestDraftBuilder builder() {
        return MyQuoteRequestDraftBuilder.of();
    }

    public static MyQuoteRequestDraftBuilder builder(final MyQuoteRequestDraft template) {
        return MyQuoteRequestDraftBuilder.of(template);
    }

    default <T> T withMyQuoteRequestDraft(Function<MyQuoteRequestDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyQuoteRequestDraft>";
            }
        };
    }
}
