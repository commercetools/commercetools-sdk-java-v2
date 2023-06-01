package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomerEmailAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomerEmailActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomerEmailAction stagedOrderSetCustomerEmailAction = StagedOrderSetCustomerEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetCustomerEmailActionBuilder implements Builder<StagedOrderSetCustomerEmailAction> {

    
    @Nullable
    private String email;

    
    /**
     * set the value to the email
     * @param email value to be set
     * @return Builder
     */
    
    public StagedOrderSetCustomerEmailActionBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }
    
    

    /**
     * value of email}
     * @return email
     */
    
    @Nullable
    public String getEmail(){
        return this.email;
    }

    /**
     * builds StagedOrderSetCustomerEmailAction with checking for non-null required values
     * @return StagedOrderSetCustomerEmailAction
     */
    public StagedOrderSetCustomerEmailAction build() {
        return new StagedOrderSetCustomerEmailActionImpl(email);
    }
    
    /**
     * builds StagedOrderSetCustomerEmailAction without checking for non-null required values
     * @return StagedOrderSetCustomerEmailAction
     */
    public StagedOrderSetCustomerEmailAction buildUnchecked() {
        return new StagedOrderSetCustomerEmailActionImpl(email);
    }

    /**
     * factory method for an instance of StagedOrderSetCustomerEmailActionBuilder
     * @return builder 
     */
    public static StagedOrderSetCustomerEmailActionBuilder of() {
        return new StagedOrderSetCustomerEmailActionBuilder();
    }

    /**
     * create builder for StagedOrderSetCustomerEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomerEmailActionBuilder of(final StagedOrderSetCustomerEmailAction template) {
        StagedOrderSetCustomerEmailActionBuilder builder = new StagedOrderSetCustomerEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
