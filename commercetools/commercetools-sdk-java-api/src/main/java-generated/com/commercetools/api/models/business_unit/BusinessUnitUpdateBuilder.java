
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitUpdate businessUnitUpdate = BusinessUnitUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitUpdateBuilder implements Builder<BusinessUnitUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.business_unit.BusinessUnitUpdateAction> actions;

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public BusinessUnitUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param actions value to be set
     * @return Builder
     */

    public BusinessUnitUpdateBuilder actions(
            final com.commercetools.api.models.business_unit.BusinessUnitUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param actions value to be set
     * @return Builder
     */

    public BusinessUnitUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.business_unit.BusinessUnitUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param actions value to be set
     * @return Builder
     */

    public BusinessUnitUpdateBuilder plusActions(
            final com.commercetools.api.models.business_unit.BusinessUnitUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public BusinessUnitUpdateBuilder plusActions(
            Function<com.commercetools.api.models.business_unit.BusinessUnitUpdateActionBuilder, Builder<? extends com.commercetools.api.models.business_unit.BusinessUnitUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.business_unit.BusinessUnitUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public BusinessUnitUpdateBuilder withActions(
            Function<com.commercetools.api.models.business_unit.BusinessUnitUpdateActionBuilder, Builder<? extends com.commercetools.api.models.business_unit.BusinessUnitUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.business_unit.BusinessUnitUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.business_unit.BusinessUnitUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds BusinessUnitUpdate with checking for non-null required values
     * @return BusinessUnitUpdate
     */
    public BusinessUnitUpdate build() {
        Objects.requireNonNull(version, BusinessUnitUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, BusinessUnitUpdate.class + ": actions is missing");
        return new BusinessUnitUpdateImpl(version, actions);
    }

    /**
     * builds BusinessUnitUpdate without checking for non-null required values
     * @return BusinessUnitUpdate
     */
    public BusinessUnitUpdate buildUnchecked() {
        return new BusinessUnitUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of BusinessUnitUpdateBuilder
     * @return builder
     */
    public static BusinessUnitUpdateBuilder of() {
        return new BusinessUnitUpdateBuilder();
    }

    /**
     * create builder for BusinessUnitUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitUpdateBuilder of(final BusinessUnitUpdate template) {
        BusinessUnitUpdateBuilder builder = new BusinessUnitUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
