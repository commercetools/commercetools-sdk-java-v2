
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddDiscountCodeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddDiscountCodeAction stagedOrderAddDiscountCodeAction = StagedOrderAddDiscountCodeAction.builder()
 *             .code("{code}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddDiscountCodeActionImpl.class)
public interface StagedOrderAddDiscountCodeAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderAddDiscountCodeAction
     */
    String ADD_DISCOUNT_CODE = "addDiscountCode";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * set code
     * @param code value to be set
     */

    public void setCode(final String code);

    /**
     * factory method
     * @return instance of StagedOrderAddDiscountCodeAction
     */
    public static StagedOrderAddDiscountCodeAction of() {
        return new StagedOrderAddDiscountCodeActionImpl();
    }

    /**
     * factory method to copy an instance of StagedOrderAddDiscountCodeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderAddDiscountCodeAction of(final StagedOrderAddDiscountCodeAction template) {
        StagedOrderAddDiscountCodeActionImpl instance = new StagedOrderAddDiscountCodeActionImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    /**
     * builder factory method for StagedOrderAddDiscountCodeAction
     * @return builder
     */
    public static StagedOrderAddDiscountCodeActionBuilder builder() {
        return StagedOrderAddDiscountCodeActionBuilder.of();
    }

    /**
     * create builder for StagedOrderAddDiscountCodeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddDiscountCodeActionBuilder builder(final StagedOrderAddDiscountCodeAction template) {
        return StagedOrderAddDiscountCodeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderAddDiscountCodeAction(Function<StagedOrderAddDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddDiscountCodeAction>";
            }
        };
    }
}
