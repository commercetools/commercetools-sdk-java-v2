
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetLocaleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetLocaleAction orderSetLocaleAction = OrderSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetLocaleActionBuilder implements Builder<OrderSetLocaleAction> {

    @Nullable
    private String locale;

    /**
     *
     * @param locale value to be set
     * @return Builder
     */

    public OrderSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    /**
     * builds OrderSetLocaleAction with checking for non-null required values
     * @return OrderSetLocaleAction
     */
    public OrderSetLocaleAction build() {
        return new OrderSetLocaleActionImpl(locale);
    }

    /**
     * builds OrderSetLocaleAction without checking for non-null required values
     * @return OrderSetLocaleAction
     */
    public OrderSetLocaleAction buildUnchecked() {
        return new OrderSetLocaleActionImpl(locale);
    }

    public static OrderSetLocaleActionBuilder of() {
        return new OrderSetLocaleActionBuilder();
    }

    public static OrderSetLocaleActionBuilder of(final OrderSetLocaleAction template) {
        OrderSetLocaleActionBuilder builder = new OrderSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
