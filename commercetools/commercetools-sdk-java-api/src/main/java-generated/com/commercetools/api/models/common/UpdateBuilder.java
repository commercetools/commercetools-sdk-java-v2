
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UpdateBuilder implements Builder<Update> {

    private Long version;

    private java.util.List<com.commercetools.api.models.common.UpdateAction> actions;

    /**
     *
     * @param version
     * @return Builder
     */

    public UpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *
     * @param actions
     * @return Builder
     */

    public UpdateBuilder actions(final com.commercetools.api.models.common.UpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *
     * @param actions
     * @return Builder
     */

    public UpdateBuilder actions(final java.util.List<com.commercetools.api.models.common.UpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *
     * @param actions
     * @return Builder
     */

    public UpdateBuilder plusActions(final com.commercetools.api.models.common.UpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *
     * @return Builder
     */

    public UpdateBuilder plusActions(
            Function<com.commercetools.api.models.common.UpdateActionBuilder, com.commercetools.api.models.common.UpdateActionBuilder> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.common.UpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *
     * @return Builder
     */

    public UpdateBuilder withActions(
            Function<com.commercetools.api.models.common.UpdateActionBuilder, com.commercetools.api.models.common.UpdateActionBuilder> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.common.UpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.common.UpdateAction> getActions() {
        return this.actions;
    }

    public Update build() {
        Objects.requireNonNull(version, Update.class + ": version is missing");
        Objects.requireNonNull(actions, Update.class + ": actions is missing");
        return new UpdateImpl(version, actions);
    }

    /**
     * builds Update without checking for non null required values
     */
    public Update buildUnchecked() {
        return new UpdateImpl(version, actions);
    }

    public static UpdateBuilder of() {
        return new UpdateBuilder();
    }

    public static UpdateBuilder of(final Update template) {
        UpdateBuilder builder = new UpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
