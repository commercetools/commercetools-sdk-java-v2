
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CartUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUpdate cartUpdate = CartUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartUpdateImpl.class)
public interface CartUpdate
        extends com.commercetools.api.models.ResourceUpdate<CartUpdate, CartUpdateAction, CartUpdateBuilder> {

    /**
     *  <p>Expected version of the Cart on which the changes apply. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CartUpdateAction> getActions();

    /**
     *  <p>Expected version of the Cart on which the changes apply. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final CartUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param actions values to be set
     */

    public void setActions(final List<CartUpdateAction> actions);

    /**
     * factory method
     * @return instance of CartUpdate
     */
    public static CartUpdate of() {
        return new CartUpdateImpl();
    }

    /**
     * factory method to create a shallow copy CartUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartUpdate of(final CartUpdate template) {
        CartUpdateImpl instance = new CartUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public CartUpdate copyDeep();

    /**
     * factory method to create a deep copy of CartUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartUpdate deepCopy(@Nullable final CartUpdate template) {
        if (template == null) {
            return null;
        }
        CartUpdateImpl instance = new CartUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.CartUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartUpdate
     * @return builder
     */
    public static CartUpdateBuilder builder() {
        return CartUpdateBuilder.of();
    }

    /**
     * create builder for CartUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartUpdateBuilder builder(final CartUpdate template) {
        return CartUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartUpdate(Function<CartUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<CartUpdate>";
            }
        };
    }
}
