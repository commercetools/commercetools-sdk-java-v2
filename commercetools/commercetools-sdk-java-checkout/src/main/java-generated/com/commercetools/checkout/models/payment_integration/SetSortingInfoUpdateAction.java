
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Sets the sorting info of a PaymentIntegration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSortingInfoUpdateAction setSortingInfoUpdateAction = SetSortingInfoUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setSortingInfo")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetSortingInfoUpdateActionImpl.class)
public interface SetSortingInfoUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetSortingInfoUpdateAction
     */
    String SET_SORTING_INFO = "setSortingInfo";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return sortingInfo
     */
    @Valid
    @JsonProperty("sortingInfo")
    public SortingInfo getSortingInfo();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param sortingInfo value to be set
     */

    public void setSortingInfo(final SortingInfo sortingInfo);

    /**
     * factory method
     * @return instance of SetSortingInfoUpdateAction
     */
    public static SetSortingInfoUpdateAction of() {
        return new SetSortingInfoUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetSortingInfoUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetSortingInfoUpdateAction of(final SetSortingInfoUpdateAction template) {
        SetSortingInfoUpdateActionImpl instance = new SetSortingInfoUpdateActionImpl();
        instance.setSortingInfo(template.getSortingInfo());
        return instance;
    }

    public SetSortingInfoUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetSortingInfoUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetSortingInfoUpdateAction deepCopy(@Nullable final SetSortingInfoUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetSortingInfoUpdateActionImpl instance = new SetSortingInfoUpdateActionImpl();
        instance.setSortingInfo(
            com.commercetools.checkout.models.payment_integration.SortingInfo.deepCopy(template.getSortingInfo()));
        return instance;
    }

    /**
     * builder factory method for SetSortingInfoUpdateAction
     * @return builder
     */
    public static SetSortingInfoUpdateActionBuilder builder() {
        return SetSortingInfoUpdateActionBuilder.of();
    }

    /**
     * create builder for SetSortingInfoUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSortingInfoUpdateActionBuilder builder(final SetSortingInfoUpdateAction template) {
        return SetSortingInfoUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetSortingInfoUpdateAction(Function<SetSortingInfoUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetSortingInfoUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetSortingInfoUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetSortingInfoUpdateAction>";
            }
        };
    }
}
