
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitUpdate myBusinessUnitUpdate = MyBusinessUnitUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitUpdateBuilder implements Builder<MyBusinessUnitUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.business_unit.BusinessUnitUpdateAction> actions;

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     */

    public MyBusinessUnitUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     */

    public MyBusinessUnitUpdateBuilder actions(
            final com.commercetools.api.models.business_unit.BusinessUnitUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     */

    public MyBusinessUnitUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.business_unit.BusinessUnitUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     */

    public MyBusinessUnitUpdateBuilder plusActions(
            final com.commercetools.api.models.business_unit.BusinessUnitUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     */

    public MyBusinessUnitUpdateBuilder plusActions(
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
     */

    public MyBusinessUnitUpdateBuilder withActions(
            Function<com.commercetools.api.models.business_unit.BusinessUnitUpdateActionBuilder, Builder<? extends com.commercetools.api.models.business_unit.BusinessUnitUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.business_unit.BusinessUnitUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.business_unit.BusinessUnitUpdateAction> getActions() {
        return this.actions;
    }

    public MyBusinessUnitUpdate build() {
        Objects.requireNonNull(version, MyBusinessUnitUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, MyBusinessUnitUpdate.class + ": actions is missing");
        return new MyBusinessUnitUpdateImpl(version, actions);
    }

    /**
     * builds MyBusinessUnitUpdate without checking for non null required values
     */
    public MyBusinessUnitUpdate buildUnchecked() {
        return new MyBusinessUnitUpdateImpl(version, actions);
    }

    public static MyBusinessUnitUpdateBuilder of() {
        return new MyBusinessUnitUpdateBuilder();
    }

    public static MyBusinessUnitUpdateBuilder of(final MyBusinessUnitUpdate template) {
        MyBusinessUnitUpdateBuilder builder = new MyBusinessUnitUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
