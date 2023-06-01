package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeUpdate;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeUpdate discountCodeUpdate = DiscountCodeUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeUpdateBuilder implements Builder<DiscountCodeUpdate> {

    
    
    private Long version;
    
    
    
    private java.util.List<com.commercetools.api.models.discount_code.DiscountCodeUpdateAction> actions;

    
    /**
     *  <p>Expected version of the DiscountCode on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public DiscountCodeUpdateBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    /**
     *  <p>Update actions to be performed on the DiscountCode.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public DiscountCodeUpdateBuilder actions( final com.commercetools.api.models.discount_code.DiscountCodeUpdateAction ...actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the DiscountCode.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public DiscountCodeUpdateBuilder actions( final java.util.List<com.commercetools.api.models.discount_code.DiscountCodeUpdateAction> actions) {
        this.actions = actions;
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the DiscountCode.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public DiscountCodeUpdateBuilder plusActions( final com.commercetools.api.models.discount_code.DiscountCodeUpdateAction ...actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }
    
    
    /**
     *  <p>Update actions to be performed on the DiscountCode.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public DiscountCodeUpdateBuilder plusActions(Function<com.commercetools.api.models.discount_code.DiscountCodeUpdateActionBuilder, Builder<? extends com.commercetools.api.models.discount_code.DiscountCodeUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.discount_code.DiscountCodeUpdateActionBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the DiscountCode.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public DiscountCodeUpdateBuilder withActions(Function<com.commercetools.api.models.discount_code.DiscountCodeUpdateActionBuilder, Builder<? extends com.commercetools.api.models.discount_code.DiscountCodeUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.discount_code.DiscountCodeUpdateActionBuilder.of()).build());
        return this;
    }
                    
    

    /**
     *  <p>Expected version of the DiscountCode on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Update actions to be performed on the DiscountCode.</p>
     * @return actions
     */
    
    
    public java.util.List<com.commercetools.api.models.discount_code.DiscountCodeUpdateAction> getActions(){
        return this.actions;
    }

    /**
     * builds DiscountCodeUpdate with checking for non-null required values
     * @return DiscountCodeUpdate
     */
    public DiscountCodeUpdate build() {
        Objects.requireNonNull(version, DiscountCodeUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, DiscountCodeUpdate.class + ": actions is missing");
        return new DiscountCodeUpdateImpl(version, actions);
    }
    
    /**
     * builds DiscountCodeUpdate without checking for non-null required values
     * @return DiscountCodeUpdate
     */
    public DiscountCodeUpdate buildUnchecked() {
        return new DiscountCodeUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of DiscountCodeUpdateBuilder
     * @return builder 
     */
    public static DiscountCodeUpdateBuilder of() {
        return new DiscountCodeUpdateBuilder();
    }

    /**
     * create builder for DiscountCodeUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeUpdateBuilder of(final DiscountCodeUpdate template) {
        DiscountCodeUpdateBuilder builder = new DiscountCodeUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
