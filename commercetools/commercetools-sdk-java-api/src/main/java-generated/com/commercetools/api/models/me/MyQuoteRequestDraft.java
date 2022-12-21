
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

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
 *             .cartId("{cartId}")
 *             .cartVersion(0.3)
 *             .comment("{comment}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyQuoteRequestDraftImpl.class)
public interface MyQuoteRequestDraft {

    /**
     *  <p><code>id</code> of the Cart from which the Quote Request is created.</p>
     */
    @NotNull
    @JsonProperty("cartId")
    public String getCartId();

    /**
     *  <p>Current version of the Cart.</p>
     */
    @NotNull
    @JsonProperty("cartVersion")
    public Long getCartVersion();

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     */
    @NotNull
    @JsonProperty("comment")
    public String getComment();

    public void setCartId(final String cartId);

    public void setCartVersion(final Long cartVersion);

    public void setComment(final String comment);

    public static MyQuoteRequestDraft of() {
        return new MyQuoteRequestDraftImpl();
    }

    public static MyQuoteRequestDraft of(final MyQuoteRequestDraft template) {
        MyQuoteRequestDraftImpl instance = new MyQuoteRequestDraftImpl();
        instance.setCartId(template.getCartId());
        instance.setCartVersion(template.getCartVersion());
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
