
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartRemoveDiscountCodeActionBuilder
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
public class MyCartRemoveDiscountCodeActionBuilder implements Builder<MyCartRemoveDiscountCodeAction> {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    /**
     *  <p>Reference to a DiscountCode.</p>
     */

    public MyCartRemoveDiscountCodeActionBuilder discountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a DiscountCode.</p>
     */

    public MyCartRemoveDiscountCodeActionBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public MyCartRemoveDiscountCodeAction build() {
        Objects.requireNonNull(discountCode, MyCartRemoveDiscountCodeAction.class + ": discountCode is missing");
        return new MyCartRemoveDiscountCodeActionImpl(discountCode);
    }

    /**
     * builds MyCartRemoveDiscountCodeAction without checking for non null required values
     */
    public MyCartRemoveDiscountCodeAction buildUnchecked() {
        return new MyCartRemoveDiscountCodeActionImpl(discountCode);
    }

    public static MyCartRemoveDiscountCodeActionBuilder of() {
        return new MyCartRemoveDiscountCodeActionBuilder();
    }

    public static MyCartRemoveDiscountCodeActionBuilder of(final MyCartRemoveDiscountCodeAction template) {
        MyCartRemoveDiscountCodeActionBuilder builder = new MyCartRemoveDiscountCodeActionBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
