package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetLocaleAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetLocaleActionBuilder implements Builder<OrderSetLocaleAction> {

    
    @Nullable
    private String locale;

    
    /**
     * set the value to the locale
     * @param locale value to be set
     * @return Builder
     */
    
    public OrderSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }
    
    

    /**
     * value of locale}
     * @return locale
     */
    
    @Nullable
    public String getLocale(){
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

    /**
     * factory method for an instance of OrderSetLocaleActionBuilder
     * @return builder 
     */
    public static OrderSetLocaleActionBuilder of() {
        return new OrderSetLocaleActionBuilder();
    }

    /**
     * create builder for OrderSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetLocaleActionBuilder of(final OrderSetLocaleAction template) {
        OrderSetLocaleActionBuilder builder = new OrderSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
