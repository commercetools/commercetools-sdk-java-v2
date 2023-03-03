
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds a DiscountCode to the Cart to activate the related CartDiscounts. Adding a Discount Code is only possible if no DirectDiscount has been applied to the Cart. Discount Codes can be added to frozen Carts, but their DiscountCodeState is then <code>DoesNotMatchCart</code>.</p>
 *  <p>The maximum number of Discount Codes in a Cart is restricted by a limit.</p>
 *  <p>Specific Error Code: MatchingPriceNotFound</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartAddDiscountCodeActionImpl.class)
public interface MyCartAddDiscountCodeAction extends MyCartUpdateAction {

    String ADD_DISCOUNT_CODE = "addDiscountCode";

    /**
     *  <p><code>code</code> of a DiscountCode.</p>
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    public void setCode(final String code);

    public static MyCartAddDiscountCodeAction of() {
        return new MyCartAddDiscountCodeActionImpl();
    }

    public static MyCartAddDiscountCodeAction of(final MyCartAddDiscountCodeAction template) {
        MyCartAddDiscountCodeActionImpl instance = new MyCartAddDiscountCodeActionImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    public static MyCartAddDiscountCodeActionBuilder builder() {
        return MyCartAddDiscountCodeActionBuilder.of();
    }

    public static MyCartAddDiscountCodeActionBuilder builder(final MyCartAddDiscountCodeAction template) {
        return MyCartAddDiscountCodeActionBuilder.of(template);
    }

    default <T> T withMyCartAddDiscountCodeAction(Function<MyCartAddDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartAddDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartAddDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartAddDiscountCodeAction>";
            }
        };
    }
}
