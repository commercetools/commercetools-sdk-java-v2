package com.commercetools.api.models.common;

import com.commercetools.api.models.common.UpdateAction;
import com.commercetools.api.models.common.Update;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Update update = Update.builder()
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
public class UpdateBuilder implements Builder<Update> {

    
    
    private Long version;
    
    
    
    private java.util.List<com.commercetools.api.models.common.UpdateAction> actions;

    
    /**
     * set the value to the version
     * @param version value to be set
     * @return Builder
     */
    
    public UpdateBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    /**
     * set values to the actions
     * @param actions value to be set
     * @return Builder
     */
    
    public UpdateBuilder actions( final com.commercetools.api.models.common.UpdateAction ...actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }
    
    /**
     * set value to the actions
     * @param actions value to be set
     * @return Builder
     */
    
    public UpdateBuilder actions( final java.util.List<com.commercetools.api.models.common.UpdateAction> actions) {
        this.actions = actions;
        return this;
    }
    
    /**
     * add values to the actions
     * @param actions value to be set
     * @return Builder
     */
    
    public UpdateBuilder plusActions( final com.commercetools.api.models.common.UpdateAction ...actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }
    
    
    
    /**
     * add the value to the actions using the builder function
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public UpdateBuilder plusActions(Function<com.commercetools.api.models.common.UpdateActionBuilder, com.commercetools.api.models.common.UpdateActionBuilder> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.common.UpdateActionBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the actions using the builder function
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public UpdateBuilder withActions(Function<com.commercetools.api.models.common.UpdateActionBuilder, com.commercetools.api.models.common.UpdateActionBuilder> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.common.UpdateActionBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the actions using the builder function
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public UpdateBuilder addActions(Function<com.commercetools.api.models.common.UpdateActionBuilder, com.commercetools.api.models.common.UpdateAction> builder) {
        return plusActions(builder.apply(com.commercetools.api.models.common.UpdateActionBuilder.of()));
    }
    
    /**
     * set the value to the actions using the builder function
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public UpdateBuilder setActions(Function<com.commercetools.api.models.common.UpdateActionBuilder, com.commercetools.api.models.common.UpdateAction> builder) {
        return actions(builder.apply(com.commercetools.api.models.common.UpdateActionBuilder.of()));
    }
                    

    /**
     * value of version}
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     * value of actions}
     * @return actions
     */
    
    
    public java.util.List<com.commercetools.api.models.common.UpdateAction> getActions(){
        return this.actions;
    }

    /**
     * builds Update with checking for non-null required values
     * @return Update
     */
    public Update build() {
        Objects.requireNonNull(version, Update.class + ": version is missing");
        Objects.requireNonNull(actions, Update.class + ": actions is missing");
        return new UpdateImpl(version, actions);
    }
    
    /**
     * builds Update without checking for non-null required values
     * @return Update
     */
    public Update buildUnchecked() {
        return new UpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of UpdateBuilder
     * @return builder 
     */
    public static UpdateBuilder of() {
        return new UpdateBuilder();
    }

    /**
     * create builder for Update instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UpdateBuilder of(final Update template) {
        UpdateBuilder builder = new UpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
