
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicationUpdateActionsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationUpdateActions applicationUpdateActions = ApplicationUpdateActions.builder()
 *             .version(1)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicationUpdateActionsBuilder implements Builder<ApplicationUpdateActions> {

    private Integer version;

    private java.util.List<com.commercetools.checkout.models.application.ApplicationUpdateAction> actions;

    /**
     *  <p>Expected version of the Application on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public ApplicationUpdateActionsBuilder version(final Integer version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Application.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ApplicationUpdateActionsBuilder actions(
            final com.commercetools.checkout.models.application.ApplicationUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Application.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ApplicationUpdateActionsBuilder actions(
            final java.util.List<com.commercetools.checkout.models.application.ApplicationUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Application.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ApplicationUpdateActionsBuilder plusActions(
            final com.commercetools.checkout.models.application.ApplicationUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Application.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ApplicationUpdateActionsBuilder plusActions(
            Function<com.commercetools.checkout.models.application.ApplicationUpdateActionBuilder, Builder<? extends com.commercetools.checkout.models.application.ApplicationUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.checkout.models.application.ApplicationUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Application.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ApplicationUpdateActionsBuilder withActions(
            Function<com.commercetools.checkout.models.application.ApplicationUpdateActionBuilder, Builder<? extends com.commercetools.checkout.models.application.ApplicationUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.checkout.models.application.ApplicationUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the Application on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Application.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.checkout.models.application.ApplicationUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds ApplicationUpdateActions with checking for non-null required values
     * @return ApplicationUpdateActions
     */
    public ApplicationUpdateActions build() {
        Objects.requireNonNull(version, ApplicationUpdateActions.class + ": version is missing");
        Objects.requireNonNull(actions, ApplicationUpdateActions.class + ": actions is missing");
        return new ApplicationUpdateActionsImpl(version, actions);
    }

    /**
     * builds ApplicationUpdateActions without checking for non-null required values
     * @return ApplicationUpdateActions
     */
    public ApplicationUpdateActions buildUnchecked() {
        return new ApplicationUpdateActionsImpl(version, actions);
    }

    /**
     * factory method for an instance of ApplicationUpdateActionsBuilder
     * @return builder
     */
    public static ApplicationUpdateActionsBuilder of() {
        return new ApplicationUpdateActionsBuilder();
    }

    /**
     * create builder for ApplicationUpdateActions instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationUpdateActionsBuilder of(final ApplicationUpdateActions template) {
        ApplicationUpdateActionsBuilder builder = new ApplicationUpdateActionsBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
