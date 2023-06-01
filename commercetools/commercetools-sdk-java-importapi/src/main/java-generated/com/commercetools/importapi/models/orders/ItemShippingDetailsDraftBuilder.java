package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.orders.ItemShippingTarget;
import com.commercetools.importapi.models.orders.ItemShippingDetailsDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ItemShippingDetailsDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ItemShippingDetailsDraft itemShippingDetailsDraft = ItemShippingDetailsDraft.builder()
 *             .plusTargets(targetsBuilder -> targetsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ItemShippingDetailsDraftBuilder implements Builder<ItemShippingDetailsDraft> {

    
    
    private java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> targets;

    /**
     *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
     * @param targets value to be set
     * @return Builder
     */
    
    public ItemShippingDetailsDraftBuilder targets( final com.commercetools.importapi.models.orders.ItemShippingTarget ...targets) {
        this.targets = new ArrayList<>(Arrays.asList(targets));
        return this;
    }
    
    /**
     *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
     * @param targets value to be set
     * @return Builder
     */
    
    public ItemShippingDetailsDraftBuilder targets( final java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> targets) {
        this.targets = targets;
        return this;
    }
    
    /**
     *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
     * @param targets value to be set
     * @return Builder
     */
    
    public ItemShippingDetailsDraftBuilder plusTargets( final com.commercetools.importapi.models.orders.ItemShippingTarget ...targets) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.addAll(Arrays.asList(targets));
        return this;
    }
    
    
    
    /**
     *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
     * @param builder function to build the targets value
     * @return Builder
     */
    
    public ItemShippingDetailsDraftBuilder plusTargets(Function<com.commercetools.importapi.models.orders.ItemShippingTargetBuilder, com.commercetools.importapi.models.orders.ItemShippingTargetBuilder> builder) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(builder.apply(com.commercetools.importapi.models.orders.ItemShippingTargetBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
     * @param builder function to build the targets value
     * @return Builder
     */
    
    public ItemShippingDetailsDraftBuilder withTargets(Function<com.commercetools.importapi.models.orders.ItemShippingTargetBuilder, com.commercetools.importapi.models.orders.ItemShippingTargetBuilder> builder) {
        this.targets = new ArrayList<>();
        this.targets.add(builder.apply(com.commercetools.importapi.models.orders.ItemShippingTargetBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
     * @param builder function to build the targets value
     * @return Builder
     */
    
    public ItemShippingDetailsDraftBuilder addTargets(Function<com.commercetools.importapi.models.orders.ItemShippingTargetBuilder, com.commercetools.importapi.models.orders.ItemShippingTarget> builder) {
        return plusTargets(builder.apply(com.commercetools.importapi.models.orders.ItemShippingTargetBuilder.of()));
    }
    
    /**
     *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
     * @param builder function to build the targets value
     * @return Builder
     */
    
    public ItemShippingDetailsDraftBuilder setTargets(Function<com.commercetools.importapi.models.orders.ItemShippingTargetBuilder, com.commercetools.importapi.models.orders.ItemShippingTarget> builder) {
        return targets(builder.apply(com.commercetools.importapi.models.orders.ItemShippingTargetBuilder.of()));
    }
                    

    /**
     *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
     * @return targets
     */
    
    
    public java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> getTargets(){
        return this.targets;
    }

    /**
     * builds ItemShippingDetailsDraft with checking for non-null required values
     * @return ItemShippingDetailsDraft
     */
    public ItemShippingDetailsDraft build() {
        Objects.requireNonNull(targets, ItemShippingDetailsDraft.class + ": targets is missing");
        return new ItemShippingDetailsDraftImpl(targets);
    }
    
    /**
     * builds ItemShippingDetailsDraft without checking for non-null required values
     * @return ItemShippingDetailsDraft
     */
    public ItemShippingDetailsDraft buildUnchecked() {
        return new ItemShippingDetailsDraftImpl(targets);
    }

    /**
     * factory method for an instance of ItemShippingDetailsDraftBuilder
     * @return builder 
     */
    public static ItemShippingDetailsDraftBuilder of() {
        return new ItemShippingDetailsDraftBuilder();
    }

    /**
     * create builder for ItemShippingDetailsDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ItemShippingDetailsDraftBuilder of(final ItemShippingDetailsDraft template) {
        ItemShippingDetailsDraftBuilder builder = new ItemShippingDetailsDraftBuilder();
        builder.targets = template.getTargets();
        return builder;
    }

}
