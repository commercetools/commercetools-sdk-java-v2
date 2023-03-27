
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddDiscountCodeActionBuilder
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
public class StagedOrderAddDiscountCodeActionBuilder implements Builder<StagedOrderAddDiscountCodeAction> {

    private String code;

    /**
     * set the value to the code
     * @param code value to be set
     * @return Builder
     */

    public StagedOrderAddDiscountCodeActionBuilder code(final String code) {
        this.code = code;
        return this;
    }

    /**
     * value of code}
     * @return code
     */

    public String getCode() {
        return this.code;
    }

    /**
     * builds StagedOrderAddDiscountCodeAction with checking for non-null required values
     * @return StagedOrderAddDiscountCodeAction
     */
    public StagedOrderAddDiscountCodeAction build() {
        Objects.requireNonNull(code, StagedOrderAddDiscountCodeAction.class + ": code is missing");
        return new StagedOrderAddDiscountCodeActionImpl(code);
    }

    /**
     * builds StagedOrderAddDiscountCodeAction without checking for non-null required values
     * @return StagedOrderAddDiscountCodeAction
     */
    public StagedOrderAddDiscountCodeAction buildUnchecked() {
        return new StagedOrderAddDiscountCodeActionImpl(code);
    }

    /**
     * factory method for an instance of StagedOrderAddDiscountCodeActionBuilder
     * @return builder
     */
    public static StagedOrderAddDiscountCodeActionBuilder of() {
        return new StagedOrderAddDiscountCodeActionBuilder();
    }

    /**
     * create builder for StagedOrderAddDiscountCodeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddDiscountCodeActionBuilder of(final StagedOrderAddDiscountCodeAction template) {
        StagedOrderAddDiscountCodeActionBuilder builder = new StagedOrderAddDiscountCodeActionBuilder();
        builder.code = template.getCode();
        return builder;
    }

}
