
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleLabel associateRoleLabel = AssociateRoleLabel.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleLabelBuilder implements Builder<AssociateRoleLabel> {

    private String key;

    private String name;

    /**
     *  <p>User-defined unique identifier of the Associate Role.</p>
     * @param key value to be set
     * @return Builder
     */

    public AssociateRoleLabelBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Associate Role.</p>
     * @param name value to be set
     * @return Builder
     */

    public AssociateRoleLabelBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Associate Role.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the Associate Role.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds AssociateRoleLabel with checking for non-null required values
     * @return AssociateRoleLabel
     */
    public AssociateRoleLabel build() {
        Objects.requireNonNull(key, AssociateRoleLabel.class + ": key is missing");
        Objects.requireNonNull(name, AssociateRoleLabel.class + ": name is missing");
        return new AssociateRoleLabelImpl(key, name);
    }

    /**
     * builds AssociateRoleLabel without checking for non-null required values
     * @return AssociateRoleLabel
     */
    public AssociateRoleLabel buildUnchecked() {
        return new AssociateRoleLabelImpl(key, name);
    }

    /**
     * factory method for an instance of AssociateRoleLabelBuilder
     * @return builder
     */
    public static AssociateRoleLabelBuilder of() {
        return new AssociateRoleLabelBuilder();
    }

    /**
     * create builder for AssociateRoleLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleLabelBuilder of(final AssociateRoleLabel template) {
        AssociateRoleLabelBuilder builder = new AssociateRoleLabelBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        return builder;
    }

}
