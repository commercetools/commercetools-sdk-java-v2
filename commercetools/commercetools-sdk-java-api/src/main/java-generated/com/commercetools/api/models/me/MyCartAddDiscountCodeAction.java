
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
 *  <p>Adds a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a> to the Cart to activate the related <span>CartDiscounts</span>. Adding a Discount Code is only possible if no <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">DirectDiscount</a> has been applied to the Cart. Discount Codes can be added to <a href="https://docs.commercetools.com/apis/ctp:api:type:FrozenCarts" rel="nofollow">frozen Carts</a>, but their <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeState" rel="nofollow">DiscountCodeState</a> is then <code>DoesNotMatchCart</code>.</p>
 *  <p>The maximum number of Discount Codes in a Cart is restricted by a <span>limit</span>.</p>
 *  <p>Specific Error Code: <a href="https://docs.commercetools.com/apis/ctp:api:type:MatchingPriceNotFoundError" rel="nofollow">MatchingPriceNotFound</a></p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartAddDiscountCodeAction myCartAddDiscountCodeAction = MyCartAddDiscountCodeAction.builder()
 *             .code("{code}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addDiscountCode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartAddDiscountCodeActionImpl.class)
public interface MyCartAddDiscountCodeAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartAddDiscountCodeAction
     */
    String ADD_DISCOUNT_CODE = "addDiscountCode";

    /**
     *  <p><code>code</code> of a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>code</code> of a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     * @param code value to be set
     */

    public void setCode(final String code);

    /**
     * factory method
     * @return instance of MyCartAddDiscountCodeAction
     */
    public static MyCartAddDiscountCodeAction of() {
        return new MyCartAddDiscountCodeActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartAddDiscountCodeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartAddDiscountCodeAction of(final MyCartAddDiscountCodeAction template) {
        MyCartAddDiscountCodeActionImpl instance = new MyCartAddDiscountCodeActionImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    public MyCartAddDiscountCodeAction copyDeep();

    /**
     * factory method to create a deep copy of MyCartAddDiscountCodeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartAddDiscountCodeAction deepCopy(@Nullable final MyCartAddDiscountCodeAction template) {
        if (template == null) {
            return null;
        }
        MyCartAddDiscountCodeActionImpl instance = new MyCartAddDiscountCodeActionImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    /**
     * builder factory method for MyCartAddDiscountCodeAction
     * @return builder
     */
    public static MyCartAddDiscountCodeActionBuilder builder() {
        return MyCartAddDiscountCodeActionBuilder.of();
    }

    /**
     * create builder for MyCartAddDiscountCodeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartAddDiscountCodeActionBuilder builder(final MyCartAddDiscountCodeAction template) {
        return MyCartAddDiscountCodeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartAddDiscountCodeAction(Function<MyCartAddDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartAddDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartAddDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartAddDiscountCodeAction>";
            }
        };
    }
}
