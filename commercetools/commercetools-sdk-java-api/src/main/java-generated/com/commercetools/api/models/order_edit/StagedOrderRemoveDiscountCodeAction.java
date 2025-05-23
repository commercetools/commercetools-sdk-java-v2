
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * StagedOrderRemoveDiscountCodeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveDiscountCodeAction stagedOrderRemoveDiscountCodeAction = StagedOrderRemoveDiscountCodeAction.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeDiscountCode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderRemoveDiscountCodeActionImpl.class)
public interface StagedOrderRemoveDiscountCodeAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderRemoveDiscountCodeAction
     */
    String REMOVE_DISCOUNT_CODE = "removeDiscountCode";

    /**
     *  <p>Discount Code to remove from the Cart.</p>
     * @return discountCode
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    /**
     *  <p>Discount Code to remove from the Cart.</p>
     * @param discountCode value to be set
     */

    public void setDiscountCode(final DiscountCodeReference discountCode);

    /**
     * factory method
     * @return instance of StagedOrderRemoveDiscountCodeAction
     */
    public static StagedOrderRemoveDiscountCodeAction of() {
        return new StagedOrderRemoveDiscountCodeActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderRemoveDiscountCodeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderRemoveDiscountCodeAction of(final StagedOrderRemoveDiscountCodeAction template) {
        StagedOrderRemoveDiscountCodeActionImpl instance = new StagedOrderRemoveDiscountCodeActionImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    public StagedOrderRemoveDiscountCodeAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderRemoveDiscountCodeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderRemoveDiscountCodeAction deepCopy(
            @Nullable final StagedOrderRemoveDiscountCodeAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderRemoveDiscountCodeActionImpl instance = new StagedOrderRemoveDiscountCodeActionImpl();
        instance.setDiscountCode(
            com.commercetools.api.models.discount_code.DiscountCodeReference.deepCopy(template.getDiscountCode()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderRemoveDiscountCodeAction
     * @return builder
     */
    public static StagedOrderRemoveDiscountCodeActionBuilder builder() {
        return StagedOrderRemoveDiscountCodeActionBuilder.of();
    }

    /**
     * create builder for StagedOrderRemoveDiscountCodeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemoveDiscountCodeActionBuilder builder(
            final StagedOrderRemoveDiscountCodeAction template) {
        return StagedOrderRemoveDiscountCodeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderRemoveDiscountCodeAction(Function<StagedOrderRemoveDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemoveDiscountCodeAction>";
            }
        };
    }
}
