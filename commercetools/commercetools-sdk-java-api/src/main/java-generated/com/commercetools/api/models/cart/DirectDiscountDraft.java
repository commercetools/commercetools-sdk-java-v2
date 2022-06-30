
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.CartDiscountValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DirectDiscountDraft
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
public interface DirectDiscountDraft {

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CartDiscountValue getValue();

    /**
     *  <p>Empty when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget is set.</p>
     */
    @Valid
    @JsonProperty("target")
    public CartDiscountTarget getTarget();

    public void setValue(final CartDiscountValue value);

    public void setTarget(final CartDiscountTarget target);

    public static DirectDiscountDraft of() {
        return new DirectDiscountDraftImpl();
    }

    public static DirectDiscountDraft of(final DirectDiscountDraft template) {
        DirectDiscountDraftImpl instance = new DirectDiscountDraftImpl();
        instance.setValue(template.getValue());
        instance.setTarget(template.getTarget());
        return instance;
    }

    public static DirectDiscountDraftBuilder builder() {
        return DirectDiscountDraftBuilder.of();
    }

    public static DirectDiscountDraftBuilder builder(final DirectDiscountDraft template) {
        return DirectDiscountDraftBuilder.of(template);
    }

    default <T> T withDirectDiscountDraft(Function<DirectDiscountDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DirectDiscountDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DirectDiscountDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DirectDiscountDraft>";
            }
        };
    }
}
