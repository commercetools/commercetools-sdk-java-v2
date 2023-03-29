
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartRemoveDiscountCodeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartRemoveDiscountCodeAction myCartRemoveDiscountCodeAction = MyCartRemoveDiscountCodeAction.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartRemoveDiscountCodeActionImpl.class)
public interface MyCartRemoveDiscountCodeAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartRemoveDiscountCodeAction
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
     * @return instance of MyCartRemoveDiscountCodeAction
     */
    public static MyCartRemoveDiscountCodeAction of() {
        return new MyCartRemoveDiscountCodeActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartRemoveDiscountCodeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartRemoveDiscountCodeAction of(final MyCartRemoveDiscountCodeAction template) {
        MyCartRemoveDiscountCodeActionImpl instance = new MyCartRemoveDiscountCodeActionImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCartRemoveDiscountCodeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartRemoveDiscountCodeAction deepCopy(@Nullable final MyCartRemoveDiscountCodeAction template) {
        if (template == null) {
            return null;
        }
        MyCartRemoveDiscountCodeActionImpl instance = new MyCartRemoveDiscountCodeActionImpl();
        instance.setDiscountCode(
            com.commercetools.api.models.discount_code.DiscountCodeReference.deepCopy(template.getDiscountCode()));
        return instance;
    }

    /**
     * builder factory method for MyCartRemoveDiscountCodeAction
     * @return builder
     */
    public static MyCartRemoveDiscountCodeActionBuilder builder() {
        return MyCartRemoveDiscountCodeActionBuilder.of();
    }

    /**
     * create builder for MyCartRemoveDiscountCodeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartRemoveDiscountCodeActionBuilder builder(final MyCartRemoveDiscountCodeAction template) {
        return MyCartRemoveDiscountCodeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartRemoveDiscountCodeAction(Function<MyCartRemoveDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartRemoveDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartRemoveDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartRemoveDiscountCodeAction>";
            }
        };
    }
}
