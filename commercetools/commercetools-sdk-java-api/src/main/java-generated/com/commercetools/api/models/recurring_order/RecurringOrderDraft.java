
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Recurring Orders are automatically assigned the Store and/or Business Unit from the associated Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderDraft recurringOrderDraft = RecurringOrderDraft.builder()
 *             .cart(cartBuilder -> cartBuilder)
 *             .cartVersion(0.3)
 *             .startsAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderDraftImpl.class)
public interface RecurringOrderDraft extends io.vrap.rmf.base.client.Draft<RecurringOrderDraft> {

    /**
     *  <p>User-defined unique identifier of the RecurringOrder.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>ResourceIdentifier to the Cart from which the RecurringOrder is created.</p>
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
     *  <p>Date and time (UTC) when the RecurringOrder will start.</p>
     * @return startsAt
     */
    @NotNull
    @JsonProperty("startsAt")
    public ZonedDateTime getStartsAt();

    /**
     *  <p>State for the RecurringOrder in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>Custom Fields for the RecurringOrder.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique identifier of the RecurringOrder.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>ResourceIdentifier to the Cart from which the RecurringOrder is created.</p>
     * @param cart value to be set
     */

    public void setCart(final CartResourceIdentifier cart);

    /**
     *  <p>Current version of the referenced Cart.</p>
     * @param cartVersion value to be set
     */

    public void setCartVersion(final Long cartVersion);

    /**
     *  <p>Date and time (UTC) when the RecurringOrder will start.</p>
     * @param startsAt value to be set
     */

    public void setStartsAt(final ZonedDateTime startsAt);

    /**
     *  <p>State for the RecurringOrder in a custom workflow.</p>
     * @param state value to be set
     */

    public void setState(final StateResourceIdentifier state);

    /**
     *  <p>Custom Fields for the RecurringOrder.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of RecurringOrderDraft
     */
    public static RecurringOrderDraft of() {
        return new RecurringOrderDraftImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderDraft of(final RecurringOrderDraft template) {
        RecurringOrderDraftImpl instance = new RecurringOrderDraftImpl();
        instance.setKey(template.getKey());
        instance.setCart(template.getCart());
        instance.setCartVersion(template.getCartVersion());
        instance.setStartsAt(template.getStartsAt());
        instance.setState(template.getState());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public RecurringOrderDraft copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderDraft deepCopy(@Nullable final RecurringOrderDraft template) {
        if (template == null) {
            return null;
        }
        RecurringOrderDraftImpl instance = new RecurringOrderDraftImpl();
        instance.setKey(template.getKey());
        instance.setCart(com.commercetools.api.models.cart.CartResourceIdentifier.deepCopy(template.getCart()));
        instance.setCartVersion(template.getCartVersion());
        instance.setStartsAt(template.getStartsAt());
        instance.setState(com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getState()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for RecurringOrderDraft
     * @return builder
     */
    public static RecurringOrderDraftBuilder builder() {
        return RecurringOrderDraftBuilder.of();
    }

    /**
     * create builder for RecurringOrderDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderDraftBuilder builder(final RecurringOrderDraft template) {
        return RecurringOrderDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderDraft(Function<RecurringOrderDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderDraft>";
            }
        };
    }
}
