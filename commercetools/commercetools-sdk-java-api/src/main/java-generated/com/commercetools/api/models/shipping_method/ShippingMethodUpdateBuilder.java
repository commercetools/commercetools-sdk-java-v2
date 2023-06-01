package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdate;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodUpdate shippingMethodUpdate = ShippingMethodUpdate.builder()
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
public class ShippingMethodUpdateBuilder implements Builder<ShippingMethodUpdate> {

    
    
    private Long version;
    
    
    
    private java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> actions;

    
    /**
     *  <p>Expected version of the ShippingMethod on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public ShippingMethodUpdateBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    /**
     *  <p>Update actions to be performed on the ShippingMethod.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public ShippingMethodUpdateBuilder actions( final com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction ...actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the ShippingMethod.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public ShippingMethodUpdateBuilder actions( final java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> actions) {
        this.actions = actions;
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the ShippingMethod.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public ShippingMethodUpdateBuilder plusActions( final com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction ...actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }
    
    
    /**
     *  <p>Update actions to be performed on the ShippingMethod.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public ShippingMethodUpdateBuilder plusActions(Function<com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionBuilder, Builder<? extends com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Update actions to be performed on the ShippingMethod.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public ShippingMethodUpdateBuilder withActions(Function<com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionBuilder, Builder<? extends com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionBuilder.of()).build());
        return this;
    }
                    
    

    /**
     *  <p>Expected version of the ShippingMethod on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Update actions to be performed on the ShippingMethod.</p>
     * @return actions
     */
    
    
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> getActions(){
        return this.actions;
    }

    /**
     * builds ShippingMethodUpdate with checking for non-null required values
     * @return ShippingMethodUpdate
     */
    public ShippingMethodUpdate build() {
        Objects.requireNonNull(version, ShippingMethodUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ShippingMethodUpdate.class + ": actions is missing");
        return new ShippingMethodUpdateImpl(version, actions);
    }
    
    /**
     * builds ShippingMethodUpdate without checking for non-null required values
     * @return ShippingMethodUpdate
     */
    public ShippingMethodUpdate buildUnchecked() {
        return new ShippingMethodUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of ShippingMethodUpdateBuilder
     * @return builder 
     */
    public static ShippingMethodUpdateBuilder of() {
        return new ShippingMethodUpdateBuilder();
    }

    /**
     * create builder for ShippingMethodUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodUpdateBuilder of(final ShippingMethodUpdate template) {
        ShippingMethodUpdateBuilder builder = new ShippingMethodUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
