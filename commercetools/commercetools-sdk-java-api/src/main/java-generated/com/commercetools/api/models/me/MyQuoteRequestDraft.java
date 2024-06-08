
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * MyQuoteRequestDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyQuoteRequestDraft myQuoteRequestDraft = MyQuoteRequestDraft.builder()
 *             .cartId("{cartId}")
 *             .cartVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyQuoteRequestDraftImpl.class)
public interface MyQuoteRequestDraft extends io.vrap.rmf.base.client.Draft<MyQuoteRequestDraft> {

    /**
     *  <p><code>id</code> of the Cart from which the Quote Request is created.</p>
     * @return cartId
     */
    @NotNull
    @JsonProperty("cartId")
    public String getCartId();

    /**
     *  <p>Current version of the Cart.</p>
     * @return cartVersion
     */
    @NotNull
    @JsonProperty("cartVersion")
    public Long getCartVersion();

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     * @return comment
     */

    @JsonProperty("comment")
    public String getComment();

    /**
     *  <p><code>id</code> of the Cart from which the Quote Request is created.</p>
     * @param cartId value to be set
     */

    public void setCartId(final String cartId);

    /**
     *  <p>Current version of the Cart.</p>
     * @param cartVersion value to be set
     */

    public void setCartVersion(final Long cartVersion);

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     * @param comment value to be set
     */

    public void setComment(final String comment);

    /**
     * factory method
     * @return instance of MyQuoteRequestDraft
     */
    public static MyQuoteRequestDraft of() {
        return new MyQuoteRequestDraftImpl();
    }

    /**
     * factory method to create a shallow copy MyQuoteRequestDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyQuoteRequestDraft of(final MyQuoteRequestDraft template) {
        MyQuoteRequestDraftImpl instance = new MyQuoteRequestDraftImpl();
        instance.setCartId(template.getCartId());
        instance.setCartVersion(template.getCartVersion());
        instance.setComment(template.getComment());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyQuoteRequestDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyQuoteRequestDraft deepCopy(@Nullable final MyQuoteRequestDraft template) {
        if (template == null) {
            return null;
        }
        MyQuoteRequestDraftImpl instance = new MyQuoteRequestDraftImpl();
        instance.setCartId(template.getCartId());
        instance.setCartVersion(template.getCartVersion());
        instance.setComment(template.getComment());
        return instance;
    }

    /**
     * builder factory method for MyQuoteRequestDraft
     * @return builder
     */
    public static MyQuoteRequestDraftBuilder builder() {
        return MyQuoteRequestDraftBuilder.of();
    }

    /**
     * create builder for MyQuoteRequestDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyQuoteRequestDraftBuilder builder(final MyQuoteRequestDraft template) {
        return MyQuoteRequestDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyQuoteRequestDraft(Function<MyQuoteRequestDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyQuoteRequestDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyQuoteRequestDraft>";
            }
        };
    }
}
