
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountUpdate cartDiscountUpdate = CartDiscountUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountUpdateImpl.class)
public interface CartDiscountUpdate extends
        com.commercetools.api.models.ResourceUpdate<CartDiscountUpdate, CartDiscountUpdateAction, CartDiscountUpdateBuilder> {

    /**
     *  <p>Expected version of the CartDiscount on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the CartDiscount.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CartDiscountUpdateAction> getActions();

    /**
     *  <p>Expected version of the CartDiscount on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the CartDiscount.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final CartDiscountUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the CartDiscount.</p>
     * @param actions values to be set
     */

    public void setActions(final List<CartDiscountUpdateAction> actions);

    /**
     * factory method
     * @return instance of CartDiscountUpdate
     */
    public static CartDiscountUpdate of() {
        return new CartDiscountUpdateImpl();
    }

    /**
     * factory method to copy an instance of CartDiscountUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountUpdate of(final CartDiscountUpdate template) {
        CartDiscountUpdateImpl instance = new CartDiscountUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * builder factory method for CartDiscountUpdate
     * @return builder
     */
    public static CartDiscountUpdateBuilder builder() {
        return CartDiscountUpdateBuilder.of();
    }

    /**
     * create builder for CartDiscountUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountUpdateBuilder builder(final CartDiscountUpdate template) {
        return CartDiscountUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountUpdate(Function<CartDiscountUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountUpdate>";
            }
        };
    }
}
